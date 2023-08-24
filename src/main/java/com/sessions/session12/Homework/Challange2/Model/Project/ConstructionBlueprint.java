package com.sessions.session12.Homework.Challange2.Model.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//simpliefied class for a blueprint;
public class ConstructionBlueprint {

    List<Resource> resourcesNeeded;




    private String description;



    public ConstructionBlueprint(String description){
        this.resourcesNeeded=new ArrayList<>();
        this.description=description;

    }
    public void setResourcesNeeded(  List<Resource> resourcesNeeded) {
        this.resourcesNeeded = resourcesNeeded;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public   List<Resource> getResourcesNeeded() {
        return resourcesNeeded;
    }


    public void addResourceNeeded(ResourceRecord resourceRecord, int totalQuantity){
      resourcesNeeded.add(new Resource(resourceRecord,totalQuantity));
    }
    public Resource getResourceByRecord(ResourceRecord resourceRecord){
        for(Resource r:resourcesNeeded){
            if(r.getResourceRecord().id() ==resourceRecord.id()){
                return r;
            }
        }
        return null;
    }

    public String toString(){
        String result="";
        result+= '\n';
        result+= "Description: "+ description+ '\n';
        result+= '\n';
        result+="  --- Resources needed  --- \n";
        result+='\n';
        result+=String.format("%6s %15s %15s %15s %15s \n",
                "ID",
               "Name",
                "Qty Required",
                "Qty. Used",
                "Qty. Extra");
        for(Resource r:resourcesNeeded){
            result+=r.toString();
        }
        return result;
    }


}
