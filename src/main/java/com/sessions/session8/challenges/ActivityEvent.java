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
    private String parentCode;
    private LocalDateTime eventStart;
    private LocalDateTime eventEnd;
    private LinkedList<Participants> participants;

    public ActivityEvent(String code, String name, String parentCode,
                         LocalDateTime eventStart, LocalDateTime eventEnd) {
        this.code = code;
        this.name = name;
        this.parentCode = parentCode;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
        // Instantiates the variable
        participants = new LinkedList<>();
    }

/*
    public ActivityEvent(String code, String name, String parentCode,
                         LocalDateTime eventStart, long days) {
        this.code = code;
        this.name = name;
        this.parentCode = parentCode;
        this.eventStart = eventStart;
        this.eventEnd = eventStart.plusDays(days - 1).plusHours(8);
        // Instantiates the variable
        participants = new LinkedList<>();
    }

    public ActivityEvent(String code, String name, String parentCode) {
        this.code = code;
        this.name = name;
        this.parentCode = parentCode;
        eventStart = LocalDateTime.now();
        this.eventEnd = eventStart.plusHours(8);
        // Instantiates the variable
        participants = new LinkedList<>();
    }
*/

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getParentCode() {
        return parentCode;
    }

    public LocalDateTime getEventStart() {
        return eventStart;
    }

    public LocalDateTime getEventEnd() {
        return eventEnd;
    }

    public LinkedList<Participants> getParticipants() {
        return participants;
    }

    /**
     * This method gets into an ArrayList, all the participants who have {@link Participants#status}.
     * @param status activity event status.
     * @return an ArrayList with participants who have {@link Participants#status}.
     */
    public LinkedList<Participants> getParticipants(EventStatus status) {

        LinkedList<Participants> result = new LinkedList<>(participants);

        // Generates an iterator for list navigation
        ListIterator<Participants> iterator = result.listIterator();

        // Navigates through the list and removes participants with different [status]
        while (iterator.hasNext()) {
            Participants participant = iterator.next();
            if (participant.getStatus() != status) iterator.remove();
        }
        // Final output
        return result;
    }

    /**
     * <p>This method looks for the existence of a participant who has {@link Persons#firstName} and {@link Persons#lastName},
     * in {@link ActivityEvent#participants} list.</p>
     * @param firstName the participant's first name
     * @param lastName the participant's last name
     * @return a {@link Participants} class object, representing the participant that was found <br>
     * {@code null} if the participant wasn't found.
     */
    public Participants findParticipant(String firstName, String lastName) {
        // Initial validation
        if (firstName.isEmpty() || lastName.isEmpty()) return null;

        // Generates an iterator for list navigation
        ListIterator<Participants> iterator = participants.listIterator();

        // Navigates through list and checks if a participant with [firstName] [lastName]
        // is already present in the list.
        while (iterator.hasNext()) {
            Participants participant = iterator.next();
            if (participant.getPerson().getFirstName().equalsIgnoreCase(firstName)
                    && participant.getPerson().getLastName().equalsIgnoreCase(lastName)) return participant;
        }
        // Final output
        return null;
    }

    /**
     * <p>This method looks for the existence of a participant who has {@link Persons#personId},
     * in {@link ActivityEvent#participants} list.</p>
     * @param personId the participant's ID number
     * @return a {@link Participants} class object, representing the participant that was found <br>
     * {@code null} if the participant wasn't found.
     */
    private Participants findParticipant(long personId) {
        // Initial validation
        if (personId <= 0) return null;

        // Generates an iterator for list navigation
        ListIterator<Participants> iterator = participants.listIterator();

        // Navigates through list and checks if a participant with [personId]
        // is already present in the list.
        while (iterator.hasNext()) {
            Participants participant = iterator.next();
            if (participant.getPerson().getPersonId() == personId) return participant;
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
     * {@code -1} -  if the participant is already present in the {@link ActivityEvent#participants}
     * list or method's arguments were wrong.
     */
    public int addParticipant(String firstName, String lastName) {
        // Initial validation
        if (firstName.isEmpty() || lastName.isEmpty()) return -1;

        // Finds out if a participant with given [firstName] and [lastName]
        // is already in [participants] list
        Participants participant = findParticipant(firstName, lastName);

        if (participant == null) {
            // Finds out if a participant with given [firstName] and [lastName]
            // is already registered
            Persons person = Persons.findPerson(firstName,lastName);
            if (person != null) {
                System.out.printf("[Info] {%S %S} is already a registered participant!%n", firstName, lastName);
                participants.add(new Participants(person));
                return 0;
            }
            else {
                participants.add(new Participants(new Persons(firstName, lastName)));
                return 1;
            }
        }
        else {
            // The participant is already present in [participants] list
            System.out.printf("[Warning] {%S %S} is already a present in the participants list!%n", firstName, lastName);
            return -1;
        }
    }

    /**
     * The method changes the event course participation status of the given person
     * with {@link Persons#firstName} and {@link Persons#lastName}.
     * @param firstName the participant's first name
     * @param lastName the participant's last name
     * @param status activity event status.
     * @return {@code true} if the status was modified successfully <br>
     * {@code false} if the status couldn't be modified because the participant was not found
     * in {@link ActivityEvent#participants} list.
     */
    public boolean setParticipationStatus(String firstName, String lastName, EventStatus status) {
        Participants participant = findParticipant(firstName, lastName);
        return participant != null && participant.setStatus(status);
/*
        if (participant != null) {
            participant.setStatus(status);
            return true;
        }
        else return false;
*/
    }

    /**
     * The method changes the event course participation status of the given person
     * with {@link Persons#firstName} and {@link Persons#lastName}.
     * @param personId the participant's ID number
     * @param status activity event status.
     * @return {@code true} if the status was modified successfully <br>
     * {@code false} if the status couldn't be modified because the participant was not found
     * in {@link ActivityEvent#participants} list.
     */
    public boolean setParticipationStatus(long personId, EventStatus status) {
        Participants participant = findParticipant(personId);
        return participant != null && participant.setStatus(status);
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
                code, name, parentCode, eventStart.toString(), eventEnd.toString(), participants);
    }
}
