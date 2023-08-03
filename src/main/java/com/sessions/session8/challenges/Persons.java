package com.sessions.session8.challenges;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class is used to get participants data.
 * @author  Catalin Martazan
 * */

public class Persons {
    private String firstName;
    private String lastName;
    private long personId;
    private static long personNumber = 1;

    /**
     * Holds all the registered persons.
     */
    private static LinkedList<Persons> registrations = new LinkedList<>();


    public Persons(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // At every class instantiation [personNumber] is increased,
        // thus keeping this value unique.
        personId = personNumber++;
        // Adds current object to the list of registered persons
        registrations.add(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getParticipantId() {
        return personId;
    }

    /**
     * <p>This method looks for the existence of a person who has {@link Persons#firstName} {@link Persons#lastName},
     * in {@link Persons#registrations} list.</p>
     * @param firstName person's first name
     * @param lastName person's last name
     * @return {@code true} if the person was found <br>
     * {@code false} if the person wasn't found.
     */
    static public Persons findPerson(String firstName, String lastName) {
        // Initial validation
        if (firstName.isEmpty() || lastName.isEmpty()) return null;

        // Generates an iterator for list navigation
        ListIterator<Persons> iterator = registrations.listIterator();

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
     * @return formatted participant data:  {@link Persons#firstName} {@link Persons#lastName} {@code [id: }{@link Persons#personId}{@code ]}
     */
    @Override
    public String toString() {
        return String.format("%S %S [id: %d]", firstName, lastName, personId);
    }
}
