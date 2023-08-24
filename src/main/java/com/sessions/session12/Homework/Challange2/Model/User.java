package com.sessions.session12.Homework.Challange2.Model;

import com.sessions.session12.Homework.Challange2.Model.Project.Project;
import com.sessions.session12.Homework.Challange2.Model.Project.ResourceRecord;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public abstract class User extends Company {

//common methods for manager and construction engineer methods for resources


    public ResourceRecord getResourceRecordById(int resourceID){

        for(ResourceRecord r:getResourceRecords()){
            if(r.id()==resourceID){
               return r;
            }
        }
        return null;
    }

    public boolean editResourceQuantityUsed(int projectID, int resourceID,int quantityUsed){
        //
        ResourceRecord resourceRecord=getResourceRecordById(resourceID);
        if(resourceRecord==null){
            return false;
        }
        Project p=getProjectById(projectID);
        if(p==null){
            return false;
        }
        return p.editResourceQuantityUsed(resourceRecord,quantityUsed);

    }

    public boolean editResourceExtraQuantityNeeded(int projectID, int resourceID,int extraQuantityNeeded){
        //
        ResourceRecord resourceRecord=getResourceRecordById(resourceID);
        if(resourceRecord==null){
            return false;
        }
        Project p=getProjectById(projectID);
        if(p==null){
            return false;
        }
        return p.editResourceExtraQuantityNeeded(resourceRecord,extraQuantityNeeded);

    }




}
