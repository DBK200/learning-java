package com.sessions.session12.challenges.exercise1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class is used to build Teams.
 * @author  <b><i>Catalin Martazan</i></b>
 * */
public class Teams {

    // Unique ID value
    private long teamId;

    // Unique value.
    // It is incremented with every instantiation
    // and the allocated to [teamId].
    private static long teamNo;

    private String code;

    private String description;

    // Parent [projectId]
    private String parent;

    private int size = 0;

    // Holds all team members successfully added
    private LinkedList<Persons> teamMembers;

    // Holds all [Teams] class objects successfully created
    private static LinkedList<Teams> teams = new LinkedList<>();

    private Teams(Object publisher, String code, String description, String parent) {
        if (publisher instanceof Persons
                && ((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                && !code.isBlank()
                && !parent.isBlank()) {
            teamId = ++teamNo;
            setCode(code);
            this.description = description;
            this.parent = parent;
            this.teamMembers = new LinkedList<>();
            teams.add(this);
        }
    }

    /**
     * Creates a new {@link Teams} class object and checks for duplicates during the process.
     *
     * @param publisher   the person who does the operation. The person must have {@link EmployeeType#ADMINISTRATOR}.
     * @param code        team's code.
     * @param description team's description.
     * @param parent      team's parent {@link Projects#projectId}.
     * @param msg         method's return message. This parameter is used to get a return message
     *                    after the method is executed. If no return message is wanted, {@code null} must be used.
     * @return a new {@link Teams} class object,<br><i>or</i><br>
     * {@code null} if there's an existing {@link Teams} class object that has the same
     * {@code code} value in the {@link Teams#code} field, {@code publisher} doesn't have proper rights to create new objects,
     * or one or more input parameters are wrong.
     */
    public static Teams createTeam(Object publisher, String code, String description,
                                   String parent, StringBuilder msg) {
        // Initial validation
        if (!(publisher instanceof Persons)
                || !((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                || code.isBlank()
                || parent.isBlank()) {
            Persons.setMessage("[Err] No publishing rights or/and wrong arguments!", msg);
            return null;
        }
        else {
            // If no team with the same [code] is present,
            // creates a new [Teams] class object,
            // or returns NULL otherwise

            // Holds the finding into a variable
            // for multiple operations
            Teams findResult = findTeam(code);

            if (findResult == null) {
                // The direct call of the constructor can return, when its conditions are not met,
                // a non-null object filled with default values for allocated variable types,
                // thus was discarded and replaced with the next one
                Teams team = new Teams(publisher, code, description, parent);
                team = (team.getCode() == null) ? null : team;
                Persons.setMessage((team != null) ? team.toString() : null, msg);
                return team;
            }
            else {
                Persons.setMessage("[Err] A team with [code: %s] already exists!", msg);
                return null;
            }
        }
    }

    public long getTeamId() {
        return teamId;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public String getParent() {
        return parent;
    }

    public int getSize() {
        return size;
    }

    public LinkedList<Persons> getTeamMembers() {
        return teamMembers;
    }

    public static LinkedList<Teams> getTeams() {
        return teams;
    }

    private boolean setSize() {
        size = (teamMembers.isEmpty()) ? 0 : teamMembers.size();
        return true;
    }

    /**
     * @param code
     */
    private void setCode(String code) {
        // When a duplicate is found, the team code will be generated
        // automatically as follows:
        // [code]{_counter},
        // {counter} is an integer suffixed to do
        // [code] unique when one with the same value
        // already exists.
        StringBuilder sbCode = new StringBuilder();
        sbCode.append(code);

        int i = 0;
        int j = sbCode.length();
        while (findTeam(sbCode.toString()) != null) {
            if (i == 0)
                sbCode.append("_").append(++i);
            else {
                int k = sbCode.length();
                sbCode.replace(j, k, String.valueOf(++i));
            }
        }

        this.code = sbCode.toString();
    }

    /**
     * <p>This method looks in the {@link Teams#teams} list for an entry
     * that has {@code teamId} in the {@link Teams#teamId} field <br>
     * (i.e., unique value field).</p>
     *
     * @param teamId team ID to be searched.
     * @return a {@link Teams} object with given parameter,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    public static Teams findTeam(long teamId) {
        // Initial validation
        if (teamId <= 0) return null;

        // Navigates through the list and checks if there's
        // a team with [teamId]
        for (Teams team : teams) {
            if (team.getTeamId() == teamId) return team;
        }

        // Final output
        return null;
    }

    /**
     * <p>This method looks in the {@link Teams#teams} list for an entry
     * that has {@code code} in the {@link Teams#code} field
     * (i.e., unique value field).</p>
     *
     * @param code team's code to be searched.
     * @return a {@link Teams} object with given parameter,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    public static Teams findTeam(String code) {
        // Initial validation
        if (code.isEmpty()) return null;

        // Navigates through the list and checks if there's a team
        // that has the [code] parameter value in the [code] field
        for (Teams team : teams) {
            if (team.getCode().equalsIgnoreCase(code)) return team;
        }

        // Final output if nothing's found
        return null;
    }

    /**
     * This method looks in the {@link Teams#teamMembers} list for an entry
     * that has {@code ssn} in the {@link Persons#ssn} field <br>
     * (i.e., unique value field).
     *
     * @param ssn social security number of the person to be searched.
     * @param team {@link Teams} class object where to search for members.
     * @return a {@link Persons} object with given parameter,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    public static Persons findTeamMember(String ssn, Teams team) {
        // Initial validation
        if (team == null || ssn.isBlank()) return null;

        // Navigates through the list and checks if there's
        // a person with [ssn]
        for (Persons person : team.teamMembers) {
            if (person.getSsn().equalsIgnoreCase(ssn)) return person;
        }

        // Final output
        return null;
    }

    /**
     * This method looks in the {@link Teams#teamMembers} list for entries
     * that have {@code lookup} in {@link Persons#firstName}, {@link Persons#lastName},
     * {@link Persons#address}, {@link Persons#allocationData}, {@link Persons#email},
     * {@link Persons#idCardData}, {@link Persons#employeeType}, or
     * {@link Persons#userName} fields depending on the value specified by the
     * {@code field} parameter.
     *
     * @param lookup  the term to be searched in the field specified by {@code field} parameter.
     * @param field   initial letter of the field where to look:<br>
     *                <b>A</b> for {@link Persons#address}<br>
     *                <b>D</b> for {@link Persons#allocationData}<br>
     *                <b>E</b> for {@link Persons#email}<br>
     *                <b>F</b> for {@link Persons#firstName}<br>
     *                <b>I</b> for {@link Persons#idCardData}<br>
     *                <b>T</b> for {@link Persons#employeeType}<br>
     *                <b>U</b> for {@link Persons#userName}<br>
     *                Anything else for {@link Persons#lastName}.
     * @param isEqual comparison flag. If true, {@code equalsIgnoreCase()} method will be used
     *                for comparison, otherwise {@code contains()}.
     * @param team {@link Teams} class object where to search for members.
     * @return an ArrayList of {@link Persons} objects that satisfy given parameters,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    public static ArrayList<Persons> findTeamMember(String lookup, String field, boolean isEqual, Teams team) {
        // Initial validation
        if (team == null || lookup.isBlank()) return null;

        // Result holding variable
        ArrayList<Persons> arResult = new ArrayList<>();

        // Navigates through the list and collects all resources that have
        // [lookup] in [firstName], [lastName], [address], [idCardData],
        // [email], [allocationData], [employeeType] or [userName] fields,
        // depending on the value passed as [field] parameter
        for (Persons person : team.teamMembers) {

            // Comparison field value depending on the value
            // passed as [field] parameter.
            String sField = switch (field.toUpperCase().charAt(0)) {
                case 'A' -> person.getAddress();
                case 'D' -> person.getAllocationData();
                case 'E' -> person.getEmail();
                case 'F' -> person.getFirstName();
                case 'I' -> person.getIdCardData();
                case 'T' -> person.getEmployeeType().toString();
                case 'U' -> person.getUserName();
                default -> person.getLastName();
            };
            boolean bFlag = (isEqual) ? sField.equalsIgnoreCase(lookup) : sField.contains(lookup);
            if (bFlag) arResult.add(person);
        }

        // Final output
        return (arResult.isEmpty()) ? null : arResult;
    }

    /**
     * This method adds a new person to the {@link Teams#teamMembers} list of the parameter {@code team}.
     *
     * @param publisher the person who does the operation. The person must have
     *                  {@link EmployeeType#ADMINISTRATOR}.
     * @param ssn       social security number of the person to be added.
     * @param isTeamLeader flag to set the added person as a {@link EmployeeType#TEAMLEADER} in {@code team}.
     * @param team      {@link Teams} class object where to make the addition.
     * @param msg       method's return message. This parameter is used to get a return message
     *                  after the method is executed. If no return message is wanted,
     *                  {@code null} must be used.
     * @return {@code true} if the addition was done successfully,<br><i>or</i><br>
     * {@code false} if the addition was not done, because the person is already allocated to a team,
     * {@code publisher} doesn't have {@link EmployeeType#ADMINISTRATOR},
     * or one or more input parameters are wrong.
     */
    public static boolean addTeamMember(Object publisher, String ssn, boolean isTeamLeader,
                                        Teams team, StringBuilder msg) {

        // Initial validation
        if (!(publisher instanceof Persons)
                || !((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                || team == null
                || ssn.isBlank()) {
            Persons.setMessage("[Err] No publishing rights or/and wrong arguments!", msg);
            return false;
        }

        // Checks if there's a person with [ssn]
        // between registered persons.
        Persons findRegistered = Persons.findPerson(ssn);

        if (findRegistered != null) {

            // Checks if the person found
            // is allocated to another team

            // Not allocated
            if(findRegistered
                    .getAllocationData()
                    .equalsIgnoreCase(findRegistered.formatAllocationData())) {

                // Adds the person to team's member list
                team.teamMembers.add(findRegistered);

                // Team size update
                team.setSize();

                // Sets new [allocationData] for added person
                // It has to be done before setting the [employeeType]
                // because there a team membership check is being made
                findRegistered.setAllocationData(publisher
                        , findRegistered.formatAllocationData(team.getParent(), team.getCode())
                        , null);

                // If the flag [isTeamLeader] is TRUE,
                // sets [employeeType] to {EmployeeType.TEAMLEADER}
                // for the added person
                if (isTeamLeader)
                    findRegistered.setEmployeeType(publisher
                            , EmployeeType.TEAMLEADER
                            , team
                            , null);

                Persons.setMessage(findRegistered.toString(), msg);
                return true;
            }

            // Allocated to another team
            else {
                Persons.setMessage(String.format("[Err] The person with [ssn: %s] is allocated to another team!", ssn), msg);
                return false;
            }
        }

        // The person is not registered yet
        else {
            Persons.setMessage(String.format("[Err] No person with [ssn: %s] is registered!", ssn), msg);
            return false;
        }
    }

    /**
     * This method removes a person from the {@link Teams#teamMembers} list of parameter {@code team}.
     *
     * @param publisher the person who does the operation. The person must have
     *                  {@link EmployeeType#ADMINISTRATOR}.
     * @param ssn       social security number of the person to be deleted.
     * @param team      {@link Teams} class object from where the person is removed.
     * @param msg       method's return message. This parameter is used to get a return message
     *                  after the method is executed. If no return message is wanted,
     *                  {@code null} must be used.
     * @return {@code true} if the deletion was done successfully,<br><i>or</i><br>
     * {@code false} if the deletion was not done, because the person is not allocated to {@code team},
     * {@code publisher} doesn't have {@link EmployeeType#ADMINISTRATOR},
     * or one or more input parameters are wrong.
     */
    public static boolean removeTeamMember(Object publisher, String ssn, Teams team, StringBuilder msg) {

        // Initial validation
        if (!(publisher instanceof Persons)
                || !((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                || team == null
                || ssn.isBlank()) {
            Persons.setMessage("[Err] No publishing rights or/and wrong arguments!", msg);
            return false;
        }

        // Checks if there's a person with [ssn]
        // between team members.
        Persons findMember = findTeamMember(ssn, team);

        if (findMember != null) {
            // Removes the person to team's member list
            team.teamMembers.remove(findMember);

            // Team size update
            team.setSize();

            // Sets the [allocationData] to default for the removed person
            findMember.setAllocationData(publisher, findMember.formatAllocationData(), null);
            Persons.setMessage(findMember.toString(), msg);
            return true;
        }

        // The person is not a member of [team]
        else {
            Persons.setMessage("[Err] No team member with [ssn: %s] was found!", msg);
            return false;
        }
    }

    /**
     * @return formatted teams data
     */
    @Override
    public String toString() {
        return String.format("Team data:%n"
                        + "\t- ID: %d%n"
                        + "\t- Code: %s%n"
                        + "\t- Description: %s%n"
                        + "\t- Parent ID: %s%n"
                        + "\t- Size: %d%n"
                        + "\t- Members: %n"
                        + "\t\t%s%n",
                teamId, code, description, parent, size, teamMembers);
    }

}
