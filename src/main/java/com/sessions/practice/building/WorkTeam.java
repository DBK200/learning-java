package com.sessions.practice.building;


import java.util.ArrayList;

public class WorkTeam {
    private TeamLeader teamLeader;
    //private Worker worker;

    private ArrayList<Worker> workers;
    private String teamName;
    private int teamSize;
    private ArrayList<String> teamTasks;

//    public Worker getWorker() {
//        return worker;
//    }

    public WorkTeam(String teamName, int teamSize){
        this.teamName = teamName;
        this.teamSize = teamSize;
    }
    public ArrayList<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(ArrayList<Worker> workers) {
        this.workers = workers;
    }

//    public void setWorker(Worker worker) {
//        this.worker = worker;
//    }

    public TeamLeader getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(TeamLeader teamLeader) {
        this.teamLeader = teamLeader;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public ArrayList<String> getTeamTasks() {
        return teamTasks;
    }

    public void setTeamTasks(ArrayList<String> teamTasks) {
        this.teamTasks = teamTasks;
    }




    // Astea trebuie sa fie in clasa Manager ?
//    // Method to add workers to the team
//    public void addWorker(Worker worker){
//        workers.add(worker);
//        System.out.println("The worker " + worker.getName() + " was successfully added to the team");
//    }

    // Method to remove workers from team
//    public void removeWorker(Worker worker){
//        workers.remove(worker);
//        System.out.println("The worker " + worker.getName() + " was successfully removed from team");
//    }

    // Method to show the team structure
//    public void showTeam(ArrayList<Worker> workers, TeamLeader teamLeader){
//        System.out.println("Members of " + getTeamName() + " team: ");
//        System.out.println("Team leader: " + teamLeader.getName());
//        System.out.println("Workers: ");
//        for(Worker worker : workers){
//            System.out.println(worker.getName());
//        }
//    }
    // How do I make this to be seen only by Constructor engineer
}
