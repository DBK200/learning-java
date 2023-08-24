package com.sessions.session12.Homework.Challange2.Model.Project;

public enum ConstructionPhases {

    PHASE_0("Not started"),
    PHASE_1("Preparing building site"),
    PHASE_2("Land and foundation"),
    PHASE_3("Structure of construction"),
    PHASE_4("Mechanical, Electrical and Pluming"),
    PHASE_5("Insulation and waterproofing"),
    PHASE_6("Finishes and closures"),
    PHASE_7("Completed");


    private String description; //description of each phase


    ConstructionPhases(String description) {
        this.description = description;
    }




    public String getDescription() {
        return description;
    }
}
