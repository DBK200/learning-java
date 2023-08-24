package com.sessions.session12.Homework.Challange2.Model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Team {

    private List<Employee> members;
    private List<Employee> constructorEngineers;
    private List<Employee> builders;
    private Employee teamLead;


    public Team(){
        this.members=new ArrayList<>();
        this.constructorEngineers=new ArrayList<>();
        this.builders=new ArrayList<>();
        this.teamLead=null;
    }

    public void setTeamLead(Employee teamLead){
        this.teamLead=teamLead;
    }

    public Employee getTeamLead(){
        return teamLead;
    }

    public boolean addTeamMember(Employee employee,boolean isTeamLeader){
        if(isTeamLeader) this.teamLead=employee;
        if(employee.getRole()==Role.CONSTRUCTOR_ENGINEER){
            constructorEngineers.add(employee);
        }
        if(employee.getRole()==Role.BUILDER){
            builders.add(employee);
        }
        return true;
    }

    public boolean hasMembers(){
        return !constructorEngineers.isEmpty() || !builders.isEmpty();
    }



    /**
     * Constructs a list of team members grouped by role and alphabetically ordered with the team leader on first position.
     * @return list of team members
     */
    public List<Employee> getTeamMembers(){
        this.members=new ArrayList<>();
        members.add(teamLead); //add teamLeadFirst
        for(Employee e:sortAlphabetically(constructorEngineers)){ //add constructor engineers second
            if(e.getEmployeeID()!= teamLead.getEmployeeID()){
                members.add(e);
            }
        }
        for(Employee e:sortAlphabetically(builders)){//add constructor engineers last
            if(e.getEmployeeID()!= teamLead.getEmployeeID()){
                members.add(e);
            }
        }
        return members;



    }




    public boolean removeTeamMember(Employee employee){

        if(employee.getRole()==Role.CONSTRUCTOR_ENGINEER){
            constructorEngineers.remove(employee);
            return true;
        }else
        if(employee.getRole()==Role.BUILDER){
            builders.remove(employee);
            return true;
        }else{
            return false;
        }


    }


    public boolean hasEmployee(int employeeId){
        for(Employee e: constructorEngineers){
            if(e.getEmployeeID()==employeeId){
                return true;
            }
        }

        for(Employee e: builders){
            if(e.getEmployeeID()==employeeId){
                return true;
            }
        }
        return false;
    }

    public String toString(){
        String result="";
        getTeamMembers();
        int count=0;
        for(Employee e: members){
            if(count==0 && teamLead!=null){
                result+="------------------- Team Leader ------------------- \n";
                result += e.getSimplifiedEmployeeInfo() + '\n';
                result+= "--------------------------------------------------- \n";
                count++;
            }else{
                result += e.getSimplifiedEmployeeInfo() + '\n';
            }

        }
        return result;
    }

    private List<Employee> sortAlphabetically(List<Employee> list){
        list.sort((Comparator.comparing(Employee::getFirstName)));
        return list;
    }



}
