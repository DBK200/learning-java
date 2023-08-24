package com.sessions.session12.Homework.Challange2.Model.Project;

public class Resource {

   private ResourceRecord resourceRecord;
    private int quantityNeeded;
    private int quantityUsed;

    private int extraQuantityNeeded;




    public Resource(ResourceRecord resourceRecord, int quantityNeeded){

        this.resourceRecord=resourceRecord;
        this.quantityNeeded=quantityNeeded;
        this.quantityUsed=0;
        this.extraQuantityNeeded=0;
    }

    public void setQuantityUsed(int quantityUsed) {
        this.quantityUsed = quantityUsed;
    }

    public void setExtraQuantityNeeded(int extraQuantityNeeded) {
        this.extraQuantityNeeded = extraQuantityNeeded;
    }

    public int getExtraQuantityNeeded() {
        return extraQuantityNeeded;
    }

    public int getQuantityNeeded() {
        return quantityNeeded;
    }

    public int getQuantityUsed() {
        return quantityUsed;
    }

    public ResourceRecord getResourceRecord() {
        return resourceRecord;
    }

    public ResourceRecord getResourceRecordById(int id){
        if(resourceRecord.id()==id){
            return resourceRecord;
        }
        return null;
    }

    public String toString(){
       return  String.format("%6d %15s %15d %15d %15d \n",
               resourceRecord.id(),
               resourceRecord.name(),
               quantityNeeded,
               quantityUsed,
               extraQuantityNeeded);

    }


}
