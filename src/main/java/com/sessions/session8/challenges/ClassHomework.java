package com.sessions.session8.challenges;

import java.time.LocalDateTime;

public class ClassHomework {

    public static void main(String[] args) {

        FtfCourse course1 = new FtfCourse("PTB 0EL P.1", "Modul electrica de baza",
                "Centrul de Scolarizare PoRo", "Trainer1");

        // Adds an event
        course1.addEvent(course1.getCode().concat(" 2023.08.01"), "(2023.08.01) ".concat(course1.getName()),
                LocalDateTime.of(2023,8, 1, 9, 30,0),4);

        // Adds 10 participants
        for(int i = 0; i < 10; i++) {
            course1.getEvents().get(0).addParticipant("First" + i, "Last"+ i);
        }

        // Adds a new event
        course1.addEvent(course1.getCode().concat(" 2023.08.08"), "(2023.08.08) ".concat(course1.getName()),
                LocalDateTime.of(2023,8, 8, 9, 30,0),4);

        // Adds 10 participants
        for(int i = 11; i < 21; i++) {
            course1.getEvents().get(1).addParticipant("First" + i, "Last"+ i);
        }

        // Prints out course data
        System.out.println(course1.toString());
    }
}
