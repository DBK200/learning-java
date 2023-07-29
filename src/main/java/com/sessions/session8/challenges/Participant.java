package com.sessions.session8.challenges;

/**
 * This class is used to get participant's data.
 * @author  Catalin Martazan
 * */

public class Participant {
    private String firstName;
    private String lastName;
    private long participantId;
    private static long participantNumber = 1;

    public Participant(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // At every class instantiation [participantNumber] is increased,
        // thus keeping this value unique.
        this.participantId = participantNumber++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getParticipantId() {
        return participantId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return formatted participant data:  {@code firstName} {@code lastName} {@code [id: participantId]}
     */
    @Override
    public String toString() {
        return String.format("%S %S [id: %d]", firstName, lastName, participantId);
    }
}
