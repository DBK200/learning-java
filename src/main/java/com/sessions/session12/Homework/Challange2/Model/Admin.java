package com.sessions.session12.Homework.Challange2.Model;

import com.sessions.session12.Homework.Challange2.Model.Project.ConstructionBlueprint;
import com.sessions.session12.Homework.Challange2.Model.Project.Project;
import com.sessions.session12.Homework.Challange2.Model.Project.Resource;
import com.sessions.session12.Homework.Challange2.Model.Project.ResourceRecord;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admin extends Company{




    public Admin(boolean isAdmin){

       setIsAdmin(isAdmin);

    }



    public boolean addEmployee(String firstName, String lastName, String email, String address,
                               String birthdateString, String hiredDateString, String contractExpirationDateString, String roleString) {


        if (firstName.equals("") ||
                lastName.equals("") ||
                email.equals("") ||
                address.equals("") ||
                birthdateString.equals("") ||
                hiredDateString.equals("") ||
                roleString.equals("")) {
            System.out.println("Missing information");
            return false;
        }
        Role role = null;
        switch (roleString) {
            case "admin":
                role = Role.ADMIN;
                break;
            case "manager":
                role = Role.MANAGER;
                break;
            case "constructor_engineer":
                role = Role.CONSTRUCTOR_ENGINEER;
                break;
            default:
                role = Role.BUILDER;
                break;
        }


        LocalDate birthDate;
        LocalDate hiredDate;
        LocalDate contractExpirationDate = null;
        try {
            birthDate = LocalDate.parse(birthdateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            hiredDate = LocalDate.parse(hiredDateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            if (!contractExpirationDateString.equals("")) {
                contractExpirationDate = LocalDate.parse(contractExpirationDateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            }

        } catch (Exception e) {
            System.out.println("Invalid date format");
            return false;
        }


        return employeeList.addEmployee(firstName, lastName, email, address, birthDate, hiredDate, contractExpirationDate, role);


    }



    public Employee modifyEmployeeData(int employeeId, String firstName, String lastName, String email, String address, String contractExpirationDate, String roleString) {


        LocalDate expirationDate = null;
        if (!contractExpirationDate.equals("")) {
            expirationDate = LocalDate.parse(contractExpirationDate, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        Role role = null;
        if (!roleString.equals("")) {
            role = getRoleFromString(roleString);
        }

        return employeeList.modifyEmployeeData(employeeId, firstName, lastName, email, address, expirationDate, role);


    }


    public boolean removeEmployee(int id) {

        return employeeList.removeEmployeeById(id);
    }

    public String seeAllEmployees() {

        return employeeList.toString();
    }



    public String getEmployeesByRole(String roleString) {
        if (roleString.equals("")) return null;
        Role role = getRoleFromString(roleString);
        List<Employee> resultList = employeeList.getEmployeesByRole(role);
        String result = "";

        for (Employee e : resultList) {
            result += e.toString() + '\n';
        }

        return result;
    }



    public int addProject(String projectDescription, String startDate, String deadline, int managerID, String blueprintDescription) {

        ConstructionBlueprint blueprint = new ConstructionBlueprint(blueprintDescription);

        Employee manager = findEmployeeById(managerID);
        int projectId = getProjects().size();
        Project project = new Project(projectId, projectDescription,
                convertStringToLocalDate(startDate),
                convertStringToLocalDate(deadline),
                manager,
                blueprint);
        getProjects().add(project);

        return projectId;
    }
    public List<String> getAllProjects() {

      List<String> projects=new ArrayList<>();
        for (Project p : getProjects()) {
            projects.add(p.toString());
        }
        return projects;
    }

    public  boolean addResourceRecord( String resourceType){
       return  getResourceRecords().add(new ResourceRecord(getResourceRecords().size(),resourceType));
    }


    public Map<Integer, String> getResourceRecordsAsMap(){
        Map<Integer,String> records=new HashMap<>();
        for(ResourceRecord r:getResourceRecords()){
            records.put(r.id(),r.name());
        }
        return records;
    }

    public boolean addResourceToProject(int projectId,int id, String resourceName,int quantity){

       Project p=getProjectById(projectId);

        for(ResourceRecord r: getResourceRecords()){
            if(r.id()==id){
                p.getBlueprint().addResourceNeeded(r,quantity);

                return true;
            }
        }

        ResourceRecord record=new ResourceRecord(id, resourceName);
        getResourceRecords().add(record);
        p.getBlueprint().addResourceNeeded(record,quantity);
        return true;


    }


    private LocalDate convertStringToLocalDate(String dateString) {
        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }



    private Role getRoleFromString(String roleString) {
        Role role = null;
        switch (roleString) {
            case "admin":
                role = Role.ADMIN;
                break;
            case "manager":
                role = Role.MANAGER;
                break;
            case "constructor_engineer":
                role = Role.CONSTRUCTOR_ENGINEER;
                break;
            default:
                role = Role.BUILDER;
                break;
        }
        return role;
    }
}
