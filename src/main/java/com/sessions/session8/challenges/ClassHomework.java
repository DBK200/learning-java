package com.sessions.session8.challenges;

import java.time.LocalDateTime;

public class ClassHomework {

    public static void main(String[] args) {

        // Creates a new "FtF" type course
        FtfCourse course1 = new FtfCourse("PTB 0EL P.1", "Modul electrica de baza",
                "Centrul de Scolarizare PoRo", "Trainer1");

        // Adds an event to [course1]
        // addEvent() creates a class [ActivityEvent] new object without making duplicates
        course1.addEvent(course1.getCode().concat(" 2023.08.01"),
                "(2023.08.01) ".concat(course1.getName()),
                LocalDateTime.of(2023,8, 1, 9, 30,0),
                4);

/*
        // Adding an event to [course1] using the pseudo-constructor.
        // can introduce duplicates!
        ActivityEvent event1 = ActivityEvent.addEvent(course1.getCode().concat(" 2023.08.01"),
                "(2023.08.01) ".concat(course1.getName()),
                course1.getCode(),
                LocalDateTime.of(2023,8, 1, 9, 30,0),
                LocalDateTime.of(2023,8, 4, 17, 0,0));
*/

        // Checks if {addEvent()} adds a duplicate entry
        course1.addEvent(course1.getCode().concat(" 2023.08.01"),
                "(2023.08.01) ".concat(course1.getName()),
                LocalDateTime.of(2023,8, 1, 9, 30,0),
                4);


        // Adds 10 participants to the event
        // addParticipant() creates 10 class [Participant] new objects
        printAddParticipantsStatus(course1,0,1,10);

        // Checks if {addParticipant()} adds a duplicate entry to participants list
        printAddParticipantsStatus(course1,0,2,1);

        // Changes participation status for some registered participants
        course1.getEvents().get(0).setParticipationStatus(1, EventStatus.ATTENDED);
        course1.getEvents().get(0).setParticipationStatus(2, EventStatus.ATTENDED);
        course1.getEvents().get(0).setParticipationStatus(3, EventStatus.CANCELED);
        course1.getEvents().get(0).setParticipationStatus(4, EventStatus.NOSHOW);

        // Checks if {setParticipationStatus()} changes the status of an unregistered person
        course1.getEvents().get(0).setParticipationStatus(11, EventStatus.ATTENDED);

        // Adds another event to [course1]
        course1.addEvent(course1.getCode().concat(" 2023.08.08"),
                "(2023.08.08) ".concat(course1.getName()),
                LocalDateTime.of(2023,8, 8, 9, 30,0),
                4);

        // Adds 10 participants to the event
        // Checks if {addParticipant()} creates duplicate [Persons] class objects
        printAddParticipantsStatus(course1,1,9,10);

        // Prints out all course participants
        System.out.printf("Participants to \"%s %s\": %n\t%s%n",
                course1.getCode(), course1.getName(), course1.getParticipants());

        // Prints out the participants for every type of participation status
        for (EventStatus status: EventStatus.values()) {
            System.out.printf("Participants to \"%s %s\" with status %s: %n\t%s%n",
                    course1.getCode(), course1.getName(), status, course1.getParticipants(status));
        }

        // Prints out [course1] data
        System.out.println(course1);

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
            if (activity.getEvents().get(eventIndex).addParticipant("First" + i, "Last"+ i) > -1) iCounter++;
        }
        if (iCounter > 0) System.out.printf("Successfully added %d entries to \"%s\" event!%n",
                iCounter, activity.getEvents().get(eventIndex).getName());
    }
}
