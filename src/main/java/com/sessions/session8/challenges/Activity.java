package com.sessions.session8.challenges;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class is used to implement training activities.
 * @author  Catalin Martazan
 * */

public class Activity {
    private String code;
    private String name;

    // PROTECTED to allow modification by child classes
    protected String type = "online";
    private LinkedList<ActivityEvent> events;

    public Activity(String code, String name) {
        this.code = code;
        this.name = name;
        // Instantiates the variable
        events = new LinkedList<>();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public LinkedList<ActivityEvent> getEvents() {
        return events;
    }

    /**
     * This method looks for the existence of an activity event that has {@link Activity#code} as activity event code, in {@link Activity#events} list.
     * @param code the activity event code
     * @return {@code true} if the activity event was found. <br>
     * {@code false} if the activity event wasn't found.
     */
    public boolean findActivity(String code) {
        // Initial validation
        if (code.isEmpty()) return false;

        // Generates an iterator for list navigation
        ListIterator<ActivityEvent> iterator = events.listIterator();

        // Navigates through [events] list and checks for presence of
        // an activity event with [code].
        while (iterator.hasNext()) {
            if (iterator.next().getCode().equalsIgnoreCase(code)) return true;
        }
        // Final output
        return false;
    }

    /**
     * <p>This method adds a new activity event to the {@link Activity#events} list after it checks
     * if an activity event with the same {@link Activity#code} as the new activity event isn't
     * already present in the list.
     * <br>If an event with the same code is found in the list, prints out a warning message.</p>
     * @param code the activity event code
     * @param name the activity event name
     * @param eventDate (variable arguments) are the activity event start and end dates.<br>If only one argument is passed,
     *                   {@link ActivityEvent#eventEnd} will be identical with {@link ActivityEvent#eventStart}.
     * @return {@code true} if the event was added successfully. <br>
     * {@code false} if the event activity already exists or at least one method argument was wrong.
     */
    public boolean addEvent(String code, String name, LocalDateTime...eventDate) {
        // Initial validation
        if (code.isEmpty()
                || name.isEmpty()
                || eventDate.length == 0) return false;

        // Checks the activity event existence
        if (findActivity(code)) {
            System.out.printf("[Warning] An event with code {%s} is already present in the list!%n", code);
            return false;
        }
        else {
            // Formats [eventStart] and [eventEnd] course DateTime data
            LocalDateTime eventStart = eventDate[0];
            LocalDateTime eventEnd = (eventDate.length > 1) ? eventDate[1] : eventDate[0];

            // Adds a new activity event to the list and returns true.
            // Sets [parent] of the activity event to current activity [code].
            events.add(new ActivityEvent(code, name, this.code, eventStart, eventEnd));
            return true;
        }

    }

    /**
     * <p>This method adds a new activity event to the {@link Activity#events} list after it checks
     * if an activity event with the same {@link Activity#code} as the new activity event isn't
     * already present in the list.
     * <br>If an event with the same code is found in the list, prints out a warning message.</p>
     * @param code the activity event code
     * @param name the activity event name
     * @param eventStart event's start date.
     * @param days event's duration in days. One day has 8 training hours.
     * @return {@code true} if the event was added successfully <br>
     * {@code false} if the event already exists or at least one method argument was wrong.
     */
    public boolean addEvent(String code, String name, LocalDateTime eventStart, long days) {
        // Initial validation.
        if (code.isEmpty()
                || name.isEmpty()
                || eventStart == null
                || days <= 0) return false;

        // Formats [eventEnd] based on [eventStart] data
        LocalDateTime eventEnd = eventStart.plusDays(days - 1).plusHours(8);
        return addEvent(code, name, eventStart, eventEnd);
    }

    /**
     * This method aggregates into one ArrayList, all the participants registered to the events.
     * @return an aggregate ArrayList with all the registered participants.
     */
    public ArrayList<Persons> getParticipants() {
        // Generates an iterator for list navigation
        ListIterator<ActivityEvent> iterator = events.listIterator();

        LinkedList<Persons> result = new LinkedList<>();

        // Navigates through the list of events and adds up every [participants] list
        // to an aggregate [result] list.
        while (iterator.hasNext()) {
            result.addAll(iterator.next().getParticipants());
        }

        return new ArrayList<Persons>(result);
    }

    /**
     * @return formatted activity data
     */
    @Override
    public String toString() {
        return String.format("Activity info:%n"
                        + "- Code: %s%n"
                        + "- Name: %s%n"
                        + "- Type: %s%n"
                        + "- %s%n",
                code, name, type, events);
    }
}
