package com.sessions.session12.challenges.exercise1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

public class Projects {

    private String code;
    private String name;
    private String location;
    private LocalDate projectStart;
    private LocalDate projectEnd;

    // Unique ID value
    private long projectId;

    // Unique value.
    // It is incremented with every instantiation
    // and the allocated to [projectId].
    private static long projectNo;

    // Holds all teams successfully added to the project
    private LinkedList<Teams> projectTeams;

    // Holds all [Projects] class objects successfully created
    private static LinkedList<Projects> projects = new LinkedList<>();

    private Projects(Object publisher, String code, String name, String location,
                     LocalDate projectStart, LocalDate projectEnd) {
        if (publisher instanceof Persons
                && ((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                && !code.isBlank()
                && !name.isBlank()
                && !location.isBlank()
                && projectStart != null
                && projectEnd != null) {
            projectId = ++projectNo;
            setCode(code);
            this.name = name;
            this.location = location;
            this.projectStart = projectStart;
            this.projectEnd = projectEnd;
            this.projectTeams = new LinkedList<>();
            projects.add(this);
        }
    }

    /**
     * Creates a new {@link Projects} class object and checks for duplicates during the process.
     *
     * @param publisher    the person who does the operation. The person must have {@link EmployeeType#ADMINISTRATOR}.
     * @param code         project's code.
     * @param name         name of the project.
     * @param location     project location.
     * @param projectStart date when the project starts.
     * @param projectEnd   date when the project ends.
     * @param msg          method's return message. This parameter is used to get a return message
     *                     after the method is executed. If no return message is wanted, {@code null} must be used.
     * @return a new {@link Projects} class object,<br><i>or</i><br>
     * {@code null} if there's an existing {@link Projects} class object that has the same
     * {@code code} value in the {@link Projects#code} field, {@code publisher} doesn't have
     * {@link EmployeeType#ADMINISTRATOR}, or one or more input parameters are wrong.
     */
    public static Projects createProject(Object publisher, String code, String name, String location,
                                         LocalDate projectStart, LocalDate projectEnd, StringBuilder msg) {
        // Initial validation
        if (!(publisher instanceof Persons)
                || !((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                || code.isBlank()
                || name.isBlank()
                || location.isBlank()
                || projectStart == null
                || projectEnd == null) {
            Persons.setMessage("[Err] No publishing rights or/and wrong arguments!", msg);
            return null;
        }
        else {
            // If no project with the same [code] is present,
            // creates a new [Projects] class object,
            // or returns NULL otherwise

            // Holds the finding into a variable
            // for multiple operations
            Projects findResult = findProject(code);

            if (findResult == null) {
                // This declaration returns a non-null object filled with default
                // values for allocated variable types, thus was discarded and
                // replaced with next one
//                return new Projects(publisher, code, name, location,projectStart, projectEnd);
                Projects project = new Projects(publisher, code, name, location,projectStart, projectEnd);
                project = (project.getCode() == null) ? null : project;
                Persons.setMessage((project != null) ? project.toString() : null, msg);
                return project;
            }
            else {
                Persons.setMessage(String.format("[Err] A project with [code: %s] already exists!", code), msg);
                return null;
            }
        }
    }

    public long getProjectId() {
        return projectId;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public LocalDate getProjectStart() {
        return projectStart;
    }

    public LocalDate getProjectEnd() {
        return projectEnd;
    }

    public LinkedList<Teams> getProjectTeams() {
        return projectTeams;
    }

    public static LinkedList<Projects> getProjects() {
        return projects;
    }

    private void setCode(String code) {
        // When a duplicate is found, the project code will be generated
        // automatically as follows:
        // [code]{_counter},
        // {counter} is an integer suffixed to do
        // [code] unique when one with the same value
        // already exists.
        StringBuilder sbCode = new StringBuilder();
        sbCode.append(code);

        int i = 0;
        int j = sbCode.length();
        while (findProject(sbCode.toString()) != null) {
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
     * This method looks in the {@link Projects#projects} list for an entry
     * that has {@code projectId} in the {@link Projects#projectId} field <br>
     * (i.e., unique value field).</p>
     *
     * @param projectId project ID to be searched.
     * @return a {@link Projects} object with given parameter,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    public static Projects findProject(long projectId) {
        // Initial validation
        if (projectId <= 0) return null;

        // Navigates through the list and checks if there's
        // a team with [projectId]
        for (Projects project : projects) {
            if (project.getProjectId() == projectId) return project;
        }

        // Final output
        return null;
    }

    /**
     * This method looks in the {@link Projects#projects} list for an entry
     * that has {@code code} in the {@link Projects#code} field
     * (i.e., unique value field).
     *
     * @param code project's code to be searched.
     * @return a {@link Projects} object with given parameter,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    public static Projects findProject(String code) {
        // Initial validation
        if (code.isEmpty()) return null;

        // Navigates through the list and checks if there's a team
        // that has the [code] parameter value in the [code] field
        for (Projects project : projects) {
            if (project.getCode().equalsIgnoreCase(code)) return project;
        }

        // Final output if nothing's found
        return null;
    }

    /**
     * This method looks in the {@link Projects#projects} list for entries
     * that have {@code lookup} in {@link Projects#name}, {@link Projects#location},
     * {@link Projects#projectStart} or {@link Projects#projectEnd} fields
     * depending on the value specified by the {@code field} parameter.
     *
     * @param lookup  the term to be searched in the field specified by {@code field} parameter.
     * @param field   initial letter of the field where to look:<br>
     *                <b>L</b> for  {@link Projects#location}<br>
     *                <b>S</b> for  {@link Projects#projectStart}<br>
     *                <b>E</b> for  {@link Projects#projectEnd}<br>
     *                Anything else for  {@link Projects#name}.
     * @param isEqual comparison flag. If true, {@code equalsIgnoreCase()} method will be used
     *                for comparison, otherwise {@code contains()}.
     * @return an ArrayList of {@link Projects} objects that satisfy given parameters,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    public static ArrayList<Projects> findProject(String lookup, String field, boolean isEqual) {
        // Initial validation
        if (lookup.isBlank()) return null;

        // Result holding variable
        ArrayList<Projects> arResult = new ArrayList<>();

        // Navigates through the list and collects all resources that have
        // [lookup] in [name], [location], [projectStart] or [projectEnd] fields,
        // depending on the value passed as [field] parameter
        for (Projects project : projects) {

            // Comparison field value depending on the value
            // passed as [field] parameter.
            String sField = switch (field.toUpperCase().charAt(0)) {
                case 'L' -> project.getLocation();
                case 'S' -> project.getProjectStart().toString();
                case 'E' -> project.getProjectEnd().toString();
                default -> project.getName();
            };
            boolean bFlag = (isEqual) ? sField.equalsIgnoreCase(lookup) : sField.contains(lookup);
            if (bFlag) arResult.add(project);
        }

        // Final output
        return (arResult.isEmpty()) ? null : arResult;
    }

    /**
     * Creates a new {@link Teams} class object and checks for duplicates during the process.<br>
     * If the process ends successfully, the newly created object is added to
     * the {@link Projects#projectTeams} list.
     *
     * @param publisher   the person who does the operation. The person must have {@link EmployeeType#ADMINISTRATOR}.
     * @param code        team's code.
     * @param description team's description.
     * @param msg         method's return message. This parameter is used to get a return message
     *                    after the method is executed. If no return message is wanted, {@code null} must be used.
     * @return {@code true} if the addition was done successfully,<br><i>or</i><br>
     * {@code false} if the addition was not done, because the team is already present,
     * {@code publisher} doesn't have {@link EmployeeType#ADMINISTRATOR},
     * or one or more input parameters are wrong.
     */
    public boolean addTeam(Object publisher, String code,
                           String description, StringBuilder msg) {

        if (!(publisher instanceof Persons)
                || !((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                || code.isBlank()) {
            Persons.setMessage("[Err] No publishing rights or/and wrong arguments!", msg);
            return false;
        }
        else {
            Teams team = Teams.createTeam(publisher, code, description, this.code, msg);
            if (team != null) {
                this.projectTeams.add(team);
                return false;
            }
            return false;
        }
    }

    /**
     * @return formatted project data
     */
    @Override
    public String toString() {
        return String.format("Project data:%n"
                        + "\t- ID: %d%n"
                        + "\t- Code: %s%n"
                        + "\t- Name: %s%n"
                        + "\t- Location: %s%n"
                        + "\t- Start Date: %s%n"
                        + "\t- End Date: %s%n"
                        + "\t- Teams: %n"
                        + "\t\t%s%n",
                projectId, code, name, location, projectStart, projectEnd, projectTeams);
    }

}
