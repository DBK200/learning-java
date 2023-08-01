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
    private LinkedList<Participant> participants;

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

    public LinkedList<Participant> getParticipants() {
        return participants;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public void setEventStart(LocalDateTime eventStart) {
        this.eventStart = eventStart;
    }

    public void setEventEnd(LocalDateTime eventEnd) {
        this.eventEnd = eventEnd;
    }

    /**
     * <p>This method looks for the existence of a person who has {@code firstName} and {@code lastName},
     * in {@code participants} list.</p>
     * @param firstName is the participant's first name
     * @param lastName is the participant's last name
     * @return {@code true} if the person was found and {@code false} if not.
     */
    public boolean findParticipant(String firstName, String lastName) {
        // Initial validation
        if (firstName.isEmpty() || lastName.isEmpty()) return false;

        // Generates an iterator for list navigation
        ListIterator<Participant> iterator = participants.listIterator();

        // Navigates through list and checks if a participant with [firstName] [lastName]
        // is already present in the list.
        while (iterator.hasNext()) {
            Participant participantPerson = iterator.next();
            if (participantPerson.getFirstName().equalsIgnoreCase(firstName)
                    && participantPerson.getLastName().equalsIgnoreCase(lastName)) return true;
        }
        // Final output
        return false;
    }

    /**
     * <p>This method adds a new participant to {@code participants} list, after it checks if is not
     * already present in the list.<br>
     * If a person with the same {@code firstName} and {@code lastName} is found in the list,
     * prints out a warning message.</p>
     * @param firstName is the participant's first name
     * @param lastName is the participant's last name
     * @return {@code true} if the participant was added successfully and {@code false} if the participant
     * is already present in {@code participants} list or method's arguments were wrong.
     */
    public boolean addParticipant(String firstName, String lastName) {
        // Initial validation
        if (firstName.isEmpty() || lastName.isEmpty()) return false;

        if (findParticipant(firstName, lastName)) {
            System.out.printf("[Warning] A participant {%S %S} is already present in the list!%n", firstName, lastName);
            return false;
        }
        else {
            // Adds a new participant to the list and returns true
            participants.add(new Participant(firstName, lastName));
            return true;
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
