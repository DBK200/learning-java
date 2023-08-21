package com.sessions.session12.HomeworkAV.challenge2;

public class Employee extends Team implements Company{
    private int ID;
    private String name;
    private String email;
    private Role role;
    private Role.TeamPosition teamPosition;
    private Role.User user;
    public Employee(int ID, String name, String email, Role role) {
        super();
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.role = role;
    }
    public Employee(int ID, String name, String email, Role.TeamPosition teamPosition) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.teamPosition = teamPosition;
    }
    public Employee(int ID, String name, String email, Role.User user) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.user = user;
    }
    public void printEmployeeData() {
        System.out.println("ID: " + ID);
        System.out.println("NAME: " + name);
        System.out.println("Team Position: " + teamPosition);
    }
    public void changeTeamPosition(Role.TeamPosition teamPosition) {
        this.teamPosition = teamPosition;
    }
    public String getEmail() {
        return this.email;
    }
}
