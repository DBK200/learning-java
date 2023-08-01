package com.sessions.session8;

public class ClassHomeworkB {
    public static void main(String[] args) {

        HomeworkBStudent student = new HomeworkBStudent(20, 9, "John", "Politehnica" );
        student.printHowManyInClass();
        HomeworkBAnimal animal = new HomeworkBAnimal("Elephant", 4, "gray", 100);
        animal.AnimalSound();
        HomeworkBSoundSystem soundSystem = new HomeworkBSoundSystem(5, "Yes", "Yes", 50);
        soundSystem.setHowManySpeakers();
        HomeworkBVehicle bicycle = new HomeworkBVehicle("blue", 2,"Yes");
        bicycle.brandName();



    }
}
