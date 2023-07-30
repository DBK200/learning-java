package com.sessions.session8.challenges;

import java.time.LocalDateTime;

public class ClassHomework {

    public static void main(String[] args) {

        // Creates a new course of type "FtF"
        FtfCourse course1 = new FtfCourse("PTB 0EL P.1", "Modul electrica de baza",
                "Centrul de Scolarizare PoRo", "Trainer1");

        // Adds up a new event to [course1]
        // addEvent() creates a class [ActivityEvent] new object
        course1.addEvent(course1.getCode().concat(" 2023.08.01"), "(2023.08.01) ".concat(course1.getName()),
                LocalDateTime.of(2023,8, 1, 9, 30,0),4);

        // Adds up 10 participants to the event
        // addParticipant() creates 10 class [Participant] new objects
        printAddParticipantsStatus(course1,0,1,10);
        // Checks if {addParticipant()} adds a duplicate entry
        printAddParticipantsStatus(course1,0,2,1);


        // Adds up another event to [course1]
        course1.addEvent(course1.getCode().concat(" 2023.08.08"), "(2023.08.08) ".concat(course1.getName()),
                LocalDateTime.of(2023,8, 8, 9, 30,0),4);

        // Adds 10 participants to the event
        printAddParticipantsStatus(course1,1,11,10);

        // Prints out [course1] data
        System.out.println(course1.toString());

    }

    /**
     * Prints out the status of the {@code addParticipants()} operation
     * @param activity course object
     * @param eventIndex list index of the activity event for which to print the status
     * @param iParticipantCountStart starting number added as a suffix to participant's {@code firstName} and {@code lastName}
     * @param iParticipantCount number of participants to be added
     */
    private static void printAddParticipantsStatus(Activity activity, int eventIndex,
                                                   int iParticipantCountStart, int iParticipantCount) {
        int iCounter = 0;
        for(int i = iParticipantCountStart; i < iParticipantCountStart + iParticipantCount; i++) {
            if (activity.getEvents().get(eventIndex).addParticipant("First" + i, "Last"+ i)) iCounter++;
        }
        if (iCounter > 0) System.out.printf("Successfully added %d entries to \"%s\" event!%n",
                iCounter, activity.getEvents().get(eventIndex).getName());
    }
}
