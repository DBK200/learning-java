package com.sessions.session12.Homework.Challange2.Model;

import com.sessions.session12.Homework.Challange2.Model.Project.Project;
import com.sessions.session12.Homework.Challange2.Model.Project.Resource;
import com.sessions.session12.Homework.Challange2.Model.Project.ResourceRecord;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Company {


    private boolean isAdmin;
    private boolean isManager;
    private boolean isConstructionEngineer;
    private int loggedInID;
    protected EmployeeList employeeList;

    private List<Project> projects;



    private List<ResourceRecord> resourceRecords;



    public Company() {
        this.isAdmin=false;
        this.isManager=false;
        this.isConstructionEngineer=false;
        employeeList = new EmployeeList();
        this.projects = new ArrayList<>();

        this.loggedInID = -1;

        resourceRecords=new ArrayList<>();
    }

    public void setResourceRecords(List<ResourceRecord> resourceRecords) {
        this.resourceRecords = resourceRecords;
    }

    public List<ResourceRecord> getResourceRecords() {
        return resourceRecords;
    }

    public void setIsAdmin(boolean isAdmin){this.isAdmin=isAdmin;}
    public void setIsManager(boolean isManager){this.isManager=isManager;}
    public void setIsConstructionEngineer(boolean isConstructionEngineer){this.isConstructionEngineer=isConstructionEngineer;}

    public void setEmployeeList(EmployeeList employeeList) {
        this.employeeList = employeeList;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }



    public void setLoggedInID(int id) {
        this.loggedInID = id;
    }

    public int getLoggedInID() {
        return loggedInID;
    }

    public List<Project> getProjects() {
        return projects;
    }

    /**
     * Adds an employee to employee list.
     * <p>
     * Only  admin has permission to call this method.
     * <p>
     * @param firstName String
     * @param lastName  String
     * @param email     String
     * @param address   String
     * @param birthdateString  String
     * @param hiredDateString  String
     * @param contractExpirationDateString  String
     * @param roleString String
     * @return true if new employee was created. false otherwise
     */
    public  boolean addEmployee(String firstName, String lastName, String email, String address,
                                        String birthdateString, String hiredDateString, String contractExpirationDateString, String roleString){
        System.out.println("You don't have permission to perform this action");
        return false;
    }


    /**
     * Updates the employee fields with the given values
     * only if the corresponding parameter is
     * not given and empty of null value.
     * <p>
     * Only  admin has permission to call this method.
     * <p>
     *
     * @param employeeId id of employee to modify
     * @param firstName  new value; can be empty
     * @param lastName   new value; can be empty
     * @param email      new value; can be empty
     * @param address    new value; can be empty
     * @param contractExpirationDate  new value; can be null
     * @param roleString    new value; can be null
     * @return Employee object updated.
     */
    public  Employee modifyEmployeeData(int employeeId, String firstName, String lastName, String email, String address, String contractExpirationDate, String roleString){
        System.out.println("You don't have permission to perform this action");
        return null;
    }

    /**
     * Searches for the employee with the given id.
     * Removes the found employee from the employee list.
     * <p>
     * Only  admin has permission to call this method.
     * <p>
     * @param id id of employee to be removed
     * @return true if employee was removed;
     *         false if employee was not found;
     *         false if the callee doesn't have permission for the action;
     */
    public  boolean removeEmployee(int id){
        System.out.println("You don't have permission to perform this action");
        return false;
    }

    /**
     * <p>
     * Only  admin has permission to call this method.
     * <p>
     * @return formatted String containing list of employees
     */
    public  String seeAllEmployees(){
        System.out.println("You don't have permission to perform this action");
        return null;
    }


    /**
     * Finds all employees that have a specific role.
     * <p>
     * Only  admin has permission to call this method.
     * <p>
     * @param roleString String containing the corresponding Role.
     * @return String containing the found list of employees.
     */
    public  String getEmployeesByRole(String roleString){
        System.out.println("You don't have permission to perform this action");
        return null;
    }


    //--------------------------------------------------------------------

    /**
     * Creates a new project with the given parameters.
     * <p>
     * Only  admin has permission to call this method.
     * <p>
     * @param projectDescription String : description of the project to be created.
     * @param startDate  LocalDate : start of the project to be created
     * @param deadline   LocalDate : expected deadline of the project to be created
     * @param managerID  int : the ID of the manager assigned to this project
     * @param blueprintDescription ConstructionBlueprint : the construction blueprint for this project
     * @return Project
     */
    public  int addProject(String projectDescription, String startDate, String deadline, int managerID, String blueprintDescription){
        System.out.println("You don't have permission to perform this action");
        return -1;
    }


    /**
     * Finds all projects the caller has permission to see.
     * Admin - can see all projects in the company
     * Manager & Construction Engineer - can only see the projects they are involved in.
     * @return a List of String containing the found projects data.
     */
    public  List<String> getAllProjects() {
        System.out.println("You don't have permission to perform this action");
        return null;
    }




    /**
     *  Finds for the project with the given id.
     *  Finds all employees that are not involved in other
     *  projects overlapping with the found project dates.
     * <p>
     * Only  manager has permission to call this method.
     * <p>
     * Only  manager has permission to call this method.
     *
     * @param projectId int - id of project.
     * @return List of String containing the found employees' data. Or empty list if no such
     *   employee was found.
     */
    public  List<String> getAvailableEmployees(int projectId) {
        System.out.println("You don't have permission to perform this action");
        return null;
    }


    /**
     * Adds employees to a team for a project.
     * <p>
     * Only  manager has permission to call this method.
     * <p>
     * @param projectId int - id of project
     * @param members map with id of employee and a boolean indicating if the employee should be a team leader
     * @return true if employees are added. false otherwise.
     */
    public  boolean addMembersToTeam(int projectId, Map<Integer, Boolean> members){
        System.out.println("You don't have permission to perform this action");
        return false;
    }

    /**
     * Removes employees from a projects team.
     * <p>
     * Only  manager has permission to call this method.
     * <p>
     * @param projectId int - id of project
     * @param members List of employee ids
     * @return  true if employees are removed. false otherwise.
     */
    public  boolean removeMembersFromTeam(int projectId, List<Integer> members){
        System.out.println("You don't have permission to perform this action");
        return false;
    }

    /**
     * Marks a new employee as team leader for a team of a project.
     * <p>
     * Only  manager has permission to call this method.
     * <p>
     * @param projectId int  id of project
     * @param employeeId int  id of employee to be marked as team leader.
     * @return true if team leader was changed. false otherwise
     */
    public boolean changeTeamLead(int projectId,int employeeId){
        System.out.println("You don't have permission to perform this action");
        return false;
    }


    /**
     * Creates a new Record type object containing id and name
     * of a resource.
     * Adds it to a list containing all resources records.
     * <p>
     * Only  admin has permission to call this method.
     * <p>
     *
     * @param resourceType String name of resource to be added.
     * @return true if resource was added; false otherwise.
     */
    public  boolean addResourceRecord( String resourceType){
        System.out.println("You don't have permission to perform this action");
        return false;
    }

    /**
     * Finds the project with the given projectID.
     * Adds the resource to the project.
     * <p>
     * Only  admin has permission to call this method.
     * @param projectId
     * @param id
     * @param resourceName
     * @param quantity
     * @return true if the resource was added; false otherwise
     */

    public  boolean addResourceToProject(int projectId,int id, String resourceName,int quantity){
        System.out.println("You don't have permission to perform this action");
        return false;
    }

    /**
     * Finds the resource record with the given id
     * <p>
     * Only  manager has permission to call this method.
     * <p>
     * @param resourceID id of resource
     * @return ResourceRecord found or null.
     */
    public ResourceRecord getResourceRecordById(int resourceID){
        System.out.println("You don't have permission to perform this action");
        return null;
    }

    /**
     * Edit quantityUsed field of a resource from a project
     * <p>
     * Only manager and construction engineer have permission to call this method.
     * <p>
     * @param projectID id of project
     * @param resourceID if of resource
     * @param quantityUsed new value for field
     * @return true if field of resource was modified; false otherwise
     */
    public boolean editResourceQuantityUsed(int projectID, int resourceID,int quantityUsed){
        System.out.println("You don't have permission to perform this action");
        return false;
    }

    /**
     * Edit extraQuantityNeeded field of a resource from a project
     * <p>
     * Only manager and construction engineer have permission to call this method.
     * <p>
     * @param projectID id of project
     * @param resourceID if of resource
     * @param extraQuantityNeeded new value for field
     * @return true if field of resource was modified; false otherwise
     */
    public boolean editResourceExtraQuantityNeeded(int projectID, int resourceID,int extraQuantityNeeded){
        System.out.println("You don't have permission to perform this action");
        return false;
    }


    /**
     * <p>
     * Only  admin has permission to call this method.
     * <p>
     * @return list of resources as String.
     */
    public  String getResourcesAsString(){
        System.out.println("You don't have permission to perform this action");
        return null;
    }
    public boolean hasTeam(int projectId){
        System.out.println("You don't have permission to perform this action");
        return false;
    }

    /**
     * <p>
     * Only  admin has permission to call this method.
     * <p>
     * @return map that contains ids and name of resource records
     */
    public  Map<Integer, String> getResourceRecordsAsMap(){
        System.out.println("You don't have permission to perform this action");
        return null;
    }

    /**
     * Finds the employee with the given id.
     * @param id int employee id
     * @return found employee or null.
     */
    public  Employee findEmployeeById(int id){
        if(loggedInID==-1){
            return null;
        }
        return employeeList.findEmployeeById(id);
    }




    /**
     * Finds all projects an employee is involved in.
     * @param id employee id
     * @return List of Project objects.
     */
    protected List<Project> getProjectsForTeamMember(int id) {
        if(loggedInID==-1){
            return null;
        }

        List<Project> foundProjects = new ArrayList<>();
        for (Project p : projects) {
            if (p.getTeam().hasEmployee(id)) {
                foundProjects.add(p);
            }
        }
        return foundProjects;
    }

    /**
     * Finds a project with the given id
     * @param id id of project
     * @return Project found
     */
    public Project getProjectById(int id) {
        if(loggedInID==-1){
            return null;
        }
        for (Project p : projects) {
            if (p.getProjectId() == id) {
                return p;
            }
        }
        return null;
    }

    /**
     * Finds all team members of a project with given id
     * @param id project id
     * @return String containing list of team members.
     */
    public String getProjectTeamMembersString(int id) {
        if(loggedInID==-1){
            return null;
        }
        Project p = getProjectById(id);
        String result = "";
        if(p.hasTeam()){
            System.out.println("Has team -true");
            result = p.getTeamMembersString();
        }else{
            result = "No team created";
        }

        return result;
    }

    /**
     * Finds contruction blueprint of the project with given project id
     * @param id project id
     * @return String containing construction blueprint details.
     */
    public String getProjectConstructionBlueprint(int id) {
        if(loggedInID==-1){
            return null;
        }
        return getProjectById(id).getBlueprint().toString();

    }


}
