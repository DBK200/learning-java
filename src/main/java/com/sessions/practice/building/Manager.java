package com.sessions.practice.building;

import com.sessions.session11.abstraction.defaultmethod.A;

import java.util.ArrayList;

public class Manager {
    private String name;
    private String projectName;
    private ArrayList<String> tasksToGive = new ArrayList<>();

    // Resources (in this class??)
    private ArrayList<String> resources = new ArrayList<>();

    // Method to assign tasks
    public void assignTask(String task, ConstructorEngineer constructorEngineer){
        tasksToGive.add(task);
        System.out.println("Task " + task + " was assignee ");
        System.out.println("Constructor Engineer " + constructorEngineer.getName() + " received the latest task from manager");
    }



    // Method to add workers to the team
    public void addWorker(Worker worker, ArrayList<Worker> workers){
        workers.add(worker);
        System.out.println("The worker " + worker.getName() + " was successfully added to the team");
    }

    // Method to remove workers from team
    public void removeWorker(Worker worker, ArrayList<Worker> workers){
        workers.remove(worker);
        System.out.println("The worker " + worker.getName() + " was successfully removed from team");
    }

    // Method to show the structure of the team
    public void showTeam(ArrayList<Worker> workers, TeamLeader teamLeader, WorkTeam workTeam){
        System.out.println("Members of " + workTeam.getTeamName() + " team: ");
        System.out.println("Team leader: " + teamLeader.getName());
        System.out.println("Workers: ");
        for(Worker worker : workers){
            System.out.println(worker.getName());
        }
    }

    // Cum fac o functie in care managerul sa avanseze un membru al echipei ca team leader?
    public void advanceFunction(Worker worker, TeamLeader teamLeader){
       // Worker worker = new TeamLeader();   ??
    }
}
