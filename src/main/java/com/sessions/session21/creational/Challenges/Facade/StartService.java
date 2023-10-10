package com.sessions.session21.creational.Challenges.Facade;

public class StartService {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    public void startPc(boolean cpuOn, boolean memoryOn, boolean hddOn){
        cpu.startCPU(cpuOn);
        memory.startMemory(memoryOn);
        hardDrive.startHdd(hddOn);
        if (cpuOn == true && memoryOn == true && hddOn == true){
            System.out.println("The Pc is running");
        }else {
            System.out.println("The Pc is not running");
        }
    }
}
