package com.sessions.session12.Homework.Challange2.Model.Project;

import com.sessions.session12.Homework.Challange2.Model.Employee;
import com.sessions.session12.Homework.Challange2.Model.Team;

import java.time.LocalDate;
import java.util.List;

public class Project {


    private int projectId;
    private String description;
    private Employee manager;
    private Team team;

    private ConstructionBlueprint blueprint;
    private ConstructionPhases phase;

    private LocalDate startDate;
    private LocalDate deadline;



    public Project(int projectId,String description, LocalDate startDate, LocalDate deadline,Employee manager,ConstructionBlueprint blueprint){
        this.projectId=projectId;
        this.description=description;
        this.startDate=startDate;
        this.deadline=deadline;
        this.manager=manager;
        this.blueprint=blueprint;

        this.phase=ConstructionPhases.PHASE_0; //Not started
        this.team=new Team();

    }

    public void setManager(Employee manager){
        this.manager=manager;
    }

    public void setTeam(Team team){
        this.team=team;
    }

    public Employee getManager() {
        return manager;
    }

    public Team getTeam(){
        return this.team;
    }

    public int getProjectId() {
        return projectId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public String getDescription() {
        return description;
    }

    public ConstructionBlueprint getBlueprint() {
        return blueprint;
    }

    public List<Employee> getTeamMembers(){
        return team.getTeamMembers();
    }
    public String getTeamMembersString(){
        if(team.hasMembers()) return team.toString();
        return "";
    }

    public boolean addTeamMember(Employee e, boolean isTeamLead){
        if(e==null){
            return false;
        }
        return team.addTeamMember(e,isTeamLead);
    }

    public boolean hasTeam(){
        return team.hasMembers();
    }

    public boolean removeTeamMember(Employee e){
        return team.removeTeamMember(e);
    }

    public boolean changeTeamLead(Employee e){
        if(e==null){
            return false;
        }
        team.setTeamLead(e);
        return true;


    }

    public boolean editResourceQuantityUsed(ResourceRecord resourceRecord,int quantityUsed){
      if(quantityUsed<0){
          return false;
      }
       Resource r= blueprint.getResourceByRecord(resourceRecord);
      if(r==null){
          return false;
      }
       r.setQuantityUsed(quantityUsed);
      return true;
    }

    public boolean editResourceExtraQuantityNeeded(ResourceRecord resourceRecord,int extraQuantityUsed){
        if(extraQuantityUsed<0){
            return false;
        }
        Resource r= blueprint.getResourceByRecord(resourceRecord);
        if(r==null){
            return false;
        }
        r.setExtraQuantityNeeded(extraQuantityUsed);
        return true;
    }




    public LocalDate moveDeadline(LocalDate newDeadline){
        this.deadline=newDeadline;
        return this.deadline;
    }

    public String changeConstructionPhase(ConstructionPhases phase){
        this.phase=phase;
        return this.phase.getDescription();
    }




    public String toString(){

        String result= String.format("%5d %15s %12s %12s %40s %20s %12d",projectId,description,startDate,deadline,phase.getDescription(),manager.getFullName(),manager.getEmployeeID()) ;

        return result;
    }


}
