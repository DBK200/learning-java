package com.sessions.session12.Homework.Challange2.Model;

import com.sessions.session12.Homework.Challange2.Model.Project.Project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConstructionEngineer extends User{

    public ConstructionEngineer(boolean isConstructionEngineer){
        setIsConstructionEngineer(isConstructionEngineer);

    }

    @Override
    public List<String> getAllProjects() {

        List<String> projectString = new ArrayList<>();
        for (Project p : getProjects()) {
            if (p.getTeam().hasEmployee(getLoggedInID())) {
                projectString.add(p.toString());
            }
        }

        return projectString;
    }






}
