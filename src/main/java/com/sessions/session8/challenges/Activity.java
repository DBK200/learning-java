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
    private String type = "online";
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
     * @return the value of {@code type}
     */
    public String activityType() {
        return type;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>This method adds a new activity event to the {@code events} list after it checks
     * if an activity event with the same {@code code} as the new activity event isn't
     * already present in the list.
     * <br>If an event with the same code is found in the list, prints out a warning message.</p>
     * @param code is the activity event code
     * @param name is the activity event name
     * @param eventDate (variable arguments) are the activity event start and end dates.<br>If only one argument is passed,
     *                   event's {@code endDate} is identical with event's {@code startDate}.
     * @return {@code true} if the event was added successfully and {@code false} if the event already exists or at least one method argument was wrong.
     */
    public boolean addEvent(String code, String name, LocalDateTime...eventDate) {
        // Initial validation
        if (code.isEmpty()
                || name.isEmpty()
                || eventDate.length == 0) return false;

        // Generates an iterator for list navigation
        ListIterator<ActivityEvent> iterator = events.listIterator();

        // Navigates through list and checks if [code] is already present.
        // If [code] is found, returns false without adding the element to the list.
        while (iterator.hasNext()) {
            if (iterator.next().getCode().equalsIgnoreCase(code)) {
                System.out.printf("[Warning] An event with code {%s} is already present in the list!%n", code);
                return false;
            }
        }

        // Formats [eventStart] and [eventEnd] course DateTime data
        LocalDateTime eventStart = eventDate[0];
        LocalDateTime eventEnd = (eventDate.length > 1) ? eventDate[1] : eventDate[0];

        // Adds a new activity event to the list and returns true.
        // Sets [parent] of the activity event to current activity [code].
        events.add(new ActivityEvent(code, name, this.code,eventStart, eventEnd));
        return true;
    }

    /**
     * <p>This method adds a new activity event to the {@code events} list after it checks
     * if an activity event with the same {@code code} as the new activity event isn't
     * already present in the list.
     * <br>If an event with the same code is found in the list, prints out a warning message.</p>
     * @param code is the activity event code
     * @param name is the activity event name
     * @param eventStart event's start date.
     * @param days event's duration in days. One day has 8 training hours.
     * @return {@code true} if the event was added successfully and {@code false} if the event already exists or at least one method argument was wrong.
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
    public ArrayList<Participant> getParticipants() {
        // Generates an iterator for list navigation
        ListIterator<ActivityEvent> iterator = events.listIterator();

        LinkedList<Participant> result = new LinkedList<>();

        // Navigates through the list of events and adds up every [participants] list
        // to an aggregate [result] list.
        while (iterator.hasNext()) {
            result.addAll(iterator.next().getParticipants());
        }

        return new ArrayList<Participant>(result);
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
