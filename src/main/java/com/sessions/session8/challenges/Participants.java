package com.sessions.session8.challenges;

public class Participants {
    private Persons person;
    private EventStatus status;

    public Participants(Persons person, EventStatus status) {
        this.person = person;
        this.status = status;
    }

    public Participants(Persons person) {
        this(person, EventStatus.REGISTERED);
    }

    public Persons getPerson() {
        return person;
    }

    public EventStatus getStatus() {
        return status;
    }

    public boolean setStatus(EventStatus status) {
        this.status = status;
        return true;
    }

    /**
     * @return formatted participant data:<p>{@link Persons#firstName}&nbsp; {@link Persons#lastName} {@code (id: }{@link Persons#personId}{@code , status: }{@link Participants#status}{@code )}</p>
     */
    @Override
    public String toString() {
        return String.format("%S %S (id: %d, status: %s)",
                getPerson().getFirstName(), getPerson().getLastName(), getPerson().getPersonId(), status);
    }
}
