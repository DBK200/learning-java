package com.sessions.practice.building;

import com.sessions.session11.abstraction.defaultmethod.A;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Create object of manager class
        Manager manager = new Manager();

        // Create object of Workers class
        Worker worker1 = new Worker("Ion Popa");
        Worker worker2 = new Worker("Alin Popa");
        Worker worker3 = new Worker("George Popescu");
        Worker worker4 = new Worker("George Manea");
        Worker worker5 = new Worker("Ion Popa");


        // Create object of WorkTeam class
        WorkTeam workTeam1 = new WorkTeam("Team 1", 6);

        // Create a list of workers to have the possibility to create a team and add members and team leader to it
        ArrayList<Worker> workers1 = new ArrayList<>();

        // Create object of TeamLeader Class
        TeamLeader leaderOfWorkers1 = new TeamLeader("Hentz Mauritz");
        // Add workers to team workers1
        manager.addWorker(worker1, workers1);
        manager.addWorker(worker2, workers1);
        manager.addWorker(worker3, workers1);
        manager.addWorker(worker4, workers1);
        manager.addWorker(worker5, workers1);

        // Show the team
        manager.showTeam(workers1, leaderOfWorkers1, workTeam1);

        // Create object of ConstructorEngineer class
        ConstructorEngineer constructorEngineer = new ConstructorEngineer("John Doe");
        manager.assignTask("Pur the foundation", constructorEngineer);


    }
}
