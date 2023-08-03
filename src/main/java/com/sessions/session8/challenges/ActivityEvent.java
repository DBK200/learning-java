package com.sessions.session8.challenges;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class is used to implement activity events.
 * @author  Catalin Martazan
 * */

public class ActivityEvent {
    private String code;
    private String name;
    private String parent;
    private LocalDateTime eventStart;
    private LocalDateTime eventEnd;
    private LinkedList<Persons> participants;

    public ActivityEvent(String code, String name, String parent, LocalDateTime eventStart, LocalDateTime eventEnd) {
        this.code = code;
        this.name = name;
        this.parent = parent;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
        // Instantiates the variable
        participants = new LinkedList<>();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getParent() {
        return parent;
    }

    public LocalDateTime getEventStart() {
        return eventStart;
    }

    public LocalDateTime getEventEnd() {
        return eventEnd;
    }

    public LinkedList<Persons> getParticipants() {
        return participants;
    }

    /**
     * <p>This method looks for the existence of a participant who has {@link Persons#firstName} and {@link Persons#lastName},
     * in {@link ActivityEvent#participants} list.</p>
     * @param firstName the participant's first name
     * @param lastName the participant's last name
     * @return {@link Persons} class object, representing the person that was found <br>
     * {@code null} if the person wasn't found.
     */
    public Persons findParticipant(String firstName, String lastName) {
        // Initial validation
        if (firstName.isEmpty() || lastName.isEmpty()) return null;

        // Generates an iterator for list navigation
        ListIterator<Persons> iterator = participants.listIterator();

        // Navigates through list and checks if a participant with [firstName] [lastName]
        // is already present in the list.
        while (iterator.hasNext()) {
            Persons person = iterator.next();
            if (person.getFirstName().equalsIgnoreCase(firstName)
                    && person.getLastName().equalsIgnoreCase(lastName)) return person;
        }
        // Final output
        return null;
    }

    /**
     * <p>This method looks for the existence of a participant who has {@link Persons#personId},
     * in {@link ActivityEvent#participants} list.</p>
     * @param personId the participant's ID number
     * @return {@link Persons} class object, representing the person that was found <br>
     * {@code null} if the person wasn't found.
     */
    public Persons findParticipant(long personId) {
        // Initial validation
        if (personId <= 0) return null;

        // Generates an iterator for list navigation
        ListIterator<Persons> iterator = participants.listIterator();

        // Navigates through list and checks if a participant with [personId]
        // is already present in the list.
        while (iterator.hasNext()) {
            Persons person = iterator.next();
            if (person.getParticipantId() == personId) return person;
        }
        // Final output
        return null;
    }

    /**
     * <p>This method adds a new participant to {@link ActivityEvent#participants} list, after it checks if is not
     * already present in the list.<br>
     * If a person with the same {@link Persons#firstName} and {@link Persons#lastName} is found in the list,
     * prints out a warning message.</p>
     * @param firstName the participant's first name
     * @param lastName the participant's last name
     * @return {@code 1} -  if a new object of class {@link Persons} was created and added successfully
     * in the {@link ActivityEvent#participants} list <br>
     * {@code 0} -  if the participant is already present the class {@link Persons}
     * and was successfully added in the {@link ActivityEvent#participants} list<br>
     * {@code -1} -  if the participant is already present the {@link ActivityEvent#participants}
     * list or method's arguments were wrong.
     */
    public int addParticipant(String firstName, String lastName) {
        // Initial validation
        if (firstName.isEmpty() || lastName.isEmpty()) return -1;

        // Finds out if a person with given [firstName] and [lastName]
        // is already in [participants] list
        Persons person = findParticipant(firstName, lastName);

        if (person == null) {
            // Finds out if a person with given [firstName] and [lastName]
            // is already registered
            person = Persons.findPerson(firstName,lastName);
            if (person != null) {
                System.out.printf("[Info] {%S %S} is already a registered person!%n", firstName, lastName);
                participants.add(person);
                return 0;
            }
            else {
                participants.add(new Persons(firstName, lastName));
                return 1;
            }
        }
        else {
            // The person is already present in [participants] list
            System.out.printf("[Warning] {%S %S} is already a present in the participants list!%n", firstName, lastName);
            return -1;
        }
    }

    /**
     * @return formatted activity event data
     */
    @Override
    public String toString() {
        return String.format("ActivityEvent:%n"
                + "\t- Code: %s%n"
                + "\t- Name: %s%n"
                + "\t- Parent: %s%n"
                + "\t- StartDate: %s%n"
                + "\t- EndDate: %s%n"
                + "\t- Participants: %n\t\t%s%n",
                code, name, parent, eventStart.toString(), eventEnd.toString(), participants);
    }
}
