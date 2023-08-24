package com.sessions.session12.Homework.Challange2.Model;

import com.sessions.session12.Homework.Challange2.Model.Project.Project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Manager extends User {

    public Manager(boolean isManager) {
        setIsManager(isManager);

    }

    @Override
    public List<String> getAllProjects() {
        List<String> foundProjects = new ArrayList<>();
        for (Project p : getProjects()) {
            if (p.getManager().getEmployeeID() == getLoggedInID()) {
                foundProjects.add(p.toString());
            }
        }
        return foundProjects;
    }

    public boolean hasTeam(int projectId){
      Project p=getProjectById(projectId);
      return p.hasTeam();

    }



    @Override
    public List<String> getAvailableEmployees(int projectId) {


        //check if employee has a project in the period

        Project project=getProjectById(projectId);
        LocalDate start=project.getStartDate();
        LocalDate end=project.getDeadline();
        boolean isFree = true;
        List<String> freeEmployees = new ArrayList<>();
        List<Employee> employees = getAllConstructionEnginnersAndBuilders();
        for (Employee e : employees) {
            List<Project> employeeProjects = getProjectsForTeamMember(e.getEmployeeID());

            for (Project p : employeeProjects) {


                if (start.isBefore(p.getStartDate()) && end.isAfter(p.getStartDate())
                        || start.isBefore(p.getDeadline()) && end.isAfter(p.getDeadline())
                        || start.isBefore(p.getStartDate()) && end.isAfter(p.getDeadline())
                        || start.isAfter(p.getStartDate()) && end.isBefore(p.getDeadline())
                        || start.isEqual(p.getStartDate() ) && end.isEqual(p.getDeadline())

                ) {
                    isFree = false;
                    break;
                }
            }
            if (isFree) {
                freeEmployees.add(e.toString());
            }
            isFree = true;

        }
        return freeEmployees;

    }

    @Override
    public boolean addMembersToTeam(int projectId, Map<Integer, Boolean> members) {

        Project p = getProjectById(projectId);

        for (Map.Entry<Integer, Boolean> member : members.entrySet()) {
            Employee e = findEmployeeById(member.getKey());
            p.addTeamMember(e, member.getValue());

        }
        return true;
    }

    @Override
    public boolean removeMembersFromTeam(int projectId, List<Integer> members) {

        Project p = getProjectById(projectId);

        for (Integer i : members) {
            Employee e = findEmployeeById(i);
            if (e == null) {
                return false;
            }
            p.removeTeamMember(e);

        }
        return true;
    }

    @Override
    public boolean changeTeamLead(int projectId, int employeeId) {
        Project p = getProjectById(projectId);
        Employee e = findEmployeeById(employeeId);
        if (p == null || e == null) {
            return false;
        }
        return p.changeTeamLead(e);
    }


    private List<Employee> getAllConstructionEnginnersAndBuilders() {
        List<Employee> resultList = new ArrayList<>();
        resultList.addAll(employeeList.getEmployeesByRole(Role.CONSTRUCTOR_ENGINEER));
        resultList.addAll(employeeList.getEmployeesByRole(Role.BUILDER));
        System.out.println();

        return resultList;
    }
}
