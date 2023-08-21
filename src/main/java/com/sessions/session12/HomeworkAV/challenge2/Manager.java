package com.sessions.session12.HomeworkAV.challenge2;
import java.util.*;
public class Manager implements Company {
    private int ID;
    private List<Team> teams = new ArrayList<>();
    public void setTeam(Team team) {
        teams.add(team);
    }
    public void printEmployees() {
        for (Team team: teams) {
            team.printTeamEmployees();
        }
    }
    public void changeEmployeePosition(Employee employee, Role.TeamPosition teamPosition) {
        employee.changeTeamPosition(teamPosition);
    }
}
