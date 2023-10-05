package com.sessions.session23patternsStructural.homework.Template;


public abstract class Project {
    abstract void createProject();
    abstract void defineTask();
    abstract void monitorProgress();
    abstract void completeProject();

    void manageProject() {
        createProject();
        defineTask();
        monitorProgress();
        completeProject();
    }
}

class ConstructionProject extends Project {
    @Override
    void createProject() {
        System.out.println("Creează un proiect de construcție");
    }

    @Override
    void defineTask() {
        System.out.println("Definește sarcinile de construcție");
    }

    @Override
    void monitorProgress() {
        System.out.println("Monitorizează progresul construcției");
    }

    @Override
    void completeProject() {
        System.out.println("Completează proiectul de construcție");
    }
}

class SoftwareProject extends Project {
    @Override
    void createProject() {
        System.out.println("Creează un proiect software");
    }

    @Override
    void defineTask() {
        System.out.println("Definește sarcinile software");
    }

    @Override
    void monitorProgress() {
        System.out.println("Monitorizează progresul software");
    }

    @Override
    void completeProject() {
        System.out.println("Completează proiectul software");
    }
}

 class TemplateDemo
{
    public static void main(String[] args) {
        Project constructionProject = new ConstructionProject();
        Project softwareProject = new SoftwareProject();

        System.out.println("Proiect de construcție:");
        constructionProject.manageProject();

        System.out.println("\nProiect software:");
        softwareProject.manageProject();
    }
}
