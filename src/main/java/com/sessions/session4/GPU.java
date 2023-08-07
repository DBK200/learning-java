package com.sessions.session4;

public class GPU {
    String brandName;
    int brandName1;
    String graphicsProcessor;
    int graphicsProcessor1;
    int cores;
    int memorySize;
    String memorySize1;
    String memoryType;
    int busWidth;

    public void setBrandName(String brandName, int brandName1){
        this.brandName = brandName;
        this.brandName1 = brandName1;
    }
    public void setGraphicsProcessor(String graphicsProcessor, int graphicsProcessor1){
        this.graphicsProcessor = graphicsProcessor;
        this.graphicsProcessor1 = graphicsProcessor1;
    }
    public void setCores(int cores){
        this.cores = cores;
    }
    public void setMemorySize(int memorySize, String memorySize1){
        this.memorySize = memorySize;
        this.memorySize1 = memorySize1;
    }
    public void setMemoryType(String memoryType){
        this.memoryType = memoryType;
    }
    public void setBusWidth(int busWidth){
        this.busWidth = busWidth;
    }

    public int getBrandName1() {
        return brandName1;
    }
    public String getBrandName(){
        return brandName;
    }
    public String getGraphicsProcessor(){
        return graphicsProcessor;
    }
    public int getGraphicsProcessor1(){
        return graphicsProcessor1;
    }
    public int getCores(){
        return cores;
    }
    public int getMemorySize(){
        return memorySize;
    }
    public String getMemorySize1(){
        return memorySize1;
    }
    public String getMemoryType(){
        return memoryType;
    }
    public int getBusWidth(){
        return busWidth;
    }



}
