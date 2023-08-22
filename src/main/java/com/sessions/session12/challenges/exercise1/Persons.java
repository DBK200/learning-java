package com.sessions.session12.challenges.exercise1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class is used to implement persons data.
 *
 * @author <b><i>Catalin Martazan</i></b>
 */
public class Persons {

    // Constant. Holds the name of the class ADMINISTRATOR
    private final String ADMIN = "Administrators";
    private String firstName;
    private String lastName;
    private String address;

    // Person's social security number
    private String ssn;

    // Person's identity card data:
    // [serial] and [number] (e.g., RX123456)
    private String idCardData;

    private String userName;

    private String email;

    private EmployeeType employeeType; // = EmployeeType.EMPLOYEE;

    // Holds information about current allocation.
    // It has the following format:
    // [Project code];[Team code];[allocation date]
    private String allocationData = "-;-;-";

    // Holds all [Persons] class objects successfully created
    private static LinkedList<Persons> persons = new LinkedList<>();

    // Unique ID value
    private long personId;

    // Unique value.
    // It is incremented with every instantiation
    // and the allocated to [personId].
    private static long personNo;

    /**
     * This method is the constructor of the {@link Persons} class.<br>
     * It doesn't check for duplicates, thus is better to use
     * {@link Persons#createPerson(Object, String, String, String, String, String, String, EmployeeType, StringBuilder)}
     * method instead.<br>
     * It has the {@code public} access modifier because is an extended class.
     *
     * @param publisher    the person who does the operation. The person must have {@link EmployeeType#ADMINISTRATOR}, or
     *                     is {@code null} and this method is called by the child {@link Administrators} class constructor.
     * @param firstName    person's first name.
     * @param lastName     person's last name.
     * @param address      person's address.
     * @param ssn          person's social security number.
     * @param idCardData   person's identity card data {@code ID serial} and {@code ID number} (e.g., RX123456)
     * @param email        person's email address.
     * @param employeeType the employee type to be set.
     * @return a new {@link Persons} class object,<br><i>or</i><br>
     * {@code null} if {@code publisher} doesn't have proper rights to create new objects,
     * or one or more input parameters are wrong.
     */
    public Persons(Object publisher, String firstName, String lastName, String address,
                   String ssn, String idCardData, String email,
                   EmployeeType employeeType) {

        if ((publisher instanceof Persons
                && ((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                || this.getClass().getSimpleName().equalsIgnoreCase(ADMIN))
                && !ssn.isBlank()
                && !firstName.isBlank()
                && !lastName.isBlank()
                && !address.isBlank()
                && !idCardData.isBlank()
                && !email.isBlank()) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.ssn = ssn;
            this.idCardData = idCardData;
            this.email = email;
            this.employeeType = employeeType;
            personId = ++personNo;
            userName = setUserName();
            persons.add(this);
        }

    }

    /**
     * Creates after some validation, a new {@link Persons} class object.<br>
     * It is recommended to be used instead of the constructor because it checks for duplicates.
     * @param publisher  the person who does the operation. The person must have {@link EmployeeType#ADMINISTRATOR}, or
     *                   is {@code null} and this method is called by the child {@link Administrators} class constructor.
     * @param firstName  person's first name.
     * @param lastName   person's last name.
     * @param address    person's address.
     * @param ssn        person's social security number.
     * @param idCardData person's identity card data {@code ID serial} and {@code ID number} (e.g., RX123456)
     * @param email      person's email address.
     * @param employeeType the employee type to be set.
     * @param msg        method's return message. This parameter is used to get a return message
     *                   after the method is executed. If no return message is wanted, {@code null} must be used.
     * @return a new {@link Persons} class object,<br><i>or</i><br>
     * {@code null} if there's an existing {@link Persons} class object that has the same
     * {@code ssn} value in the {@link Persons#ssn} field, {@code publisher} doesn't have
     * {@link EmployeeType#ADMINISTRATOR}, or one or more input parameters are wrong.
     */
    public static Persons createPerson(Object publisher, String firstName, String lastName, String address,
                                       String ssn, String idCardData, String email, EmployeeType employeeType,
                                       StringBuilder msg) {
        // Initial validation
        if (!(publisher instanceof Persons)
                || !((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                || ssn.isBlank()
                || firstName.isBlank()
                || lastName.isBlank()
                || address.isBlank()
                || idCardData.isBlank()
                || email.isBlank()) {
            setMessage("[Err] No publishing rights or/and wrong arguments!", msg);
            return null;
        }
        else {
            // If no person with the same [ssn] is present,
            // creates a new [Persons] class object,
            // or returns NULL otherwise

            // Holds the finding into a variable
            // for multiple operations
            Persons findResult = findPerson(ssn);

                if (findResult == null) {
                    // The direct call of the constructor can return, when its conditions are not met,
                    // a non-null object filled with default values for allocated variable types,
                    // thus was discarded and replaced with the next one
                    Persons person = new Persons(publisher, firstName, lastName, address, ssn, idCardData, email, employeeType);
                    person = (person.getSsn() == null) ? null : person;
                    setMessage((person != null) ? person.toString() : null, msg);
                    return person;
                }
                else {
                    setMessage(String.format("[Err] A person with [ssn: %s] already exists!", ssn), msg);
                    return null;
                }
            }
    }

    /**
     * Creates after some validation, a new {@link Persons} class object with {@link EmployeeType#EMPLOYEE}.<br>
     * It is recommended to be used instead of the constructor because it checks for duplicates.
     * @param publisher  the person who does the operation. The person must be a class {@code Administrator}
     *                   object to be able to create a new {@link Persons} class object.
     * @param firstName  person's first name.
     * @param lastName   person's last name.
     * @param address    person's address.
     * @param ssn        person's social security number.
     * @param idCardData person's identity card data {@code ID serial} and {@code ID number} (e.g., RX123456)
     * @param email      person's email address.
     * @param msg        method's return message. This parameter is used to get a return message
     *                   after the method is executed. If no return message is wanted, {@code null} must be used.
     * @return a new {@link Persons} class object with {@link EmployeeType#EMPLOYEE},<br><i>or</i><br>
     * {@code null} if there's an existing {@link Persons} class object that has the same
     * {@code ssn} value in the {@link Persons#ssn} field, {@code publisher} doesn't have
     * {@link EmployeeType#ADMINISTRATOR}, or one or more input parameters are wrong.
     */
    public static Persons createPerson(Object publisher, String firstName, String lastName, String address,
                                       String ssn, String idCardData, String email, StringBuilder msg) {
        return createPerson(publisher, firstName, lastName,
                address, ssn, idCardData, email, EmployeeType.EMPLOYEE, msg);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getSsn() {
        return ssn;
    }

    public String getIdCardData() {
        return idCardData;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public long getPersonId() {
        return personId;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public String getAllocationData() {
        return allocationData;
    }

    public static LinkedList<Persons> getPersons() {
        return persons;
    }

    private String setUserName() {
        // Username will be generated automatically as follows:
        // [firstName].[lastName]{_counter},
        // {counter} is an integer suffixed to do
        // [userName] unique when one already exists
        // with "firstName.lastName".
        // When [firstName] or [lastName] have many terms,
        // holds only the first term.
        String arFirstNames[] = firstName.toLowerCase().split("[ -]");
        String arLastNames[] = lastName.toLowerCase().split("[ -]");

        StringBuilder sbUserName = new StringBuilder();
        sbUserName.append(arFirstNames[0]).append(".").append(arLastNames[0]);

        int i = 0;
        int j = sbUserName.length();
        while (findPerson(sbUserName.toString(), "user", true) != null) {
            if (i == 0)
                sbUserName.append("_").append(++i);
            else {
                int k = sbUserName.length();
                sbUserName.replace(j, k, String.valueOf(++i));
            }
        }

        return sbUserName.toString();
    }

    /**
     * This method sets the value for the {@link Persons#employeeType} depending on {@code publisher} rights.<br>
     * Rights depend on the value of {@link Persons#employeeType} field of {@code publisher}.<br>
     * In case of setting {@link EmployeeType#TEAMLEADER}, the person has to be set as member of {@code team},
     * before calling this method.
     *
     * @param publisher    the person who does the operation. The person must be {@link EmployeeType#ADMINISTRATOR} or
     *                     {@link EmployeeType#MANAGER} to be able to set a value. {@link EmployeeType#ADMINISTRATOR}
     *                     can set any value, {@link EmployeeType#MANAGER} only {@link EmployeeType#TEAMLEADER} and
     *                     {@link EmployeeType#EMPLOYEE}.
     * @param employeeType the employee type to be set.
     * @param team         {@link Teams} class object where the participant is allocated.
     * @param msg          method's return message. This parameter is used to get a return message
     *                     after the method is executed. If no return message is wanted,
     *                     {@code null} must be used.
     * @return {@code true} if the value was set successfully,<br><i>or</i><br>
     * {@code false} if the value couldn't be set because of the {@code publisher}'s rights.
     */
    public boolean setEmployeeType(Object publisher, EmployeeType employeeType,
                                   Teams team, StringBuilder msg) {

        if (publisher instanceof Persons
                && (((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                || (((Persons) publisher).getEmployeeType().equals(EmployeeType.MANAGER)
                && employeeType.ordinal() > 1))) {

            // TEAMLEADER type
            if (employeeType.equals(EmployeeType.TEAMLEADER)) {

                if (team != null) {
                    // Holds the boolean result of
                    // "The team doesn't have a TEAMLEADER" and "Current person is member of the team"
                    boolean bAllowed = (Teams.findTeamMember(EmployeeType.TEAMLEADER.toString(),
                            "T", true, team) == null)
                            && team.getCode().equalsIgnoreCase(this.allocationData.split(";")[1]);

                    if (bAllowed) this.employeeType = employeeType;
                    else setMessage("[Err] The team already has a TEAMLEADER or/and " +
                            "current person is not member of the team!", msg);

                    return bAllowed;
                }
                else {
                    setMessage("[Err] No team was provided!", msg);
                    return false;
                }
            }

            // Every other employee type
            else {
                this.employeeType = employeeType;
                return true;
            }
        }
        else {
            setMessage("[Err] No publishing rights or/and wrong arguments!", msg);
            return false;
        }
    }

    /**
     * This method sets the value for the {@link Persons#ssn} depending on {@code publisher} rights.<br>
     * Rights depend on the value of {@link Persons#employeeType} field of the parameter {@code publisher}.
     *
     * @param ssn       the social security number to be set.
     * @param publisher the person who does the operation. Must be {@link EmployeeType#ADMINISTRATOR}
     *                  to be able to set a value.
     * @param msg       method's return message. This parameter is used to get a return message
     *                  after the method is executed. If no return message is wanted,
     *                  {@code null} must be used.
     * @return {@code true} if the value was set successfully,<br><i>or</i><br>
     * {@code false} if {@code publisher}  doesn't have {@link EmployeeType#ADMINISTRATOR}, a
     * {@link Persons} object with the same {@code ssn} is already registered,
     * or {@code ssn} parameter is not correct.
     */
    public boolean setSsn(Object publisher, String ssn, StringBuilder msg) {

        if (!(publisher instanceof Persons)
                || !((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                || ssn.isBlank()) {
            setMessage("[Err] No publishing rights or/and wrong argument!", msg);
            return false;
        }

        // Checks if there's a person with [ssn]
        // between registered persons.
        Persons findRegistered = findPerson(ssn);

        if (findRegistered == null) {
            this.ssn = ssn;
            setMessage(this.toString(), msg);
            return true;
        }
        else {
            setMessage(String.format("[Err] No person with [ssn: %s] was found!", ssn), msg);
            return false;
        }
    }

    /**
     * This method formats the allocation data.<br>
     * Allocation data has the following format:<br>
     * <b><i>[{@link Projects#code}];[{@link Teams#code}];[allocation date]</i></b>
     * @param projectCode the code of the project where the person will be allocated.
     * @param teamCode the code of the team where the person will be allocated.
     * @param allocationDate the allocation date.
     * @return formatted allocating data.
     */
    public String formatAllocationData(String projectCode, String teamCode,
                                       LocalDate allocationDate) {
        return projectCode
                .concat(";")
                .concat(teamCode)
                .concat(";")
                .concat((allocationDate == null) ? LocalDate.now().toString() : allocationDate.toString());
    }

    /**
     * This method formats the allocation data, setting current date as date of the allocation.<br>
     * Allocation data has the following format:<br>
     * <b><i>[{@link Projects#code}];[{@link Teams#code}];[allocation date]</i></b>
     * @param projectCode the code of the project where the person will be allocated.
     * @param teamCode the code of the team where the person will be allocated.
     * @return formatted allocating data.
     */
    public String formatAllocationData(String projectCode, String teamCode) {
        return formatAllocationData(projectCode, teamCode, null);
    }

    /**
     * This method formats the blank allocation data.<br>
     * Blank allocation data has the following format: <b><i>{@code -;-;-}</i></b>.
     * @return blank allocating data.
     */
    public String formatAllocationData() {
        return "-;-;-";
    }

    /**
     * This method sets new allocation data, depending on {@code publisher} rights.<br>
     * Rights depend on the value of {@link Persons#employeeType} field of the parameter {@code publisher}.<br>
     * To erase a person allocation, {@code allocationData} parameter must be an empty string.
     *
     * @param publisher      the person who does the operation. Must be {@link EmployeeType#ADMINISTRATOR}
     *                       to be able to set a value.
     * @param allocationData new allocation data to be set.<br>
     *                       It has the following format:<br>
     *                       <b><i>[{@link Projects#code}];[{@link Teams#code}];[allocation date]</i></b>
     * @param msg            method's return message. This parameter is used to get a return message
     *                       after the method is executed. If no return message is wanted,
     *                       {@code null} must be used.
     * @return {@code true} if the allocation data was set successfully,<br><i>or</i><br>
     * {@code false} if allocation data has the same value as the one to be set.
     */
    public boolean setAllocationData(Object publisher, String allocationData, StringBuilder msg) {
        if (publisher instanceof Persons
                && (((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                || (((Persons) publisher).getEmployeeType().equals(EmployeeType.MANAGER)
                && employeeType.ordinal() > 1))) {

            if (this.allocationData.equalsIgnoreCase(allocationData)
                    || (allocationData.isBlank()
                    && this.allocationData.equalsIgnoreCase(formatAllocationData()))) {
                setMessage("[Warning] Nothing to modify!", msg);
                return false;
            }
            else {
                this.allocationData = (allocationData.isBlank()) ? "-;-;-" : allocationData;
                setMessage(this.toString(), msg);
                return true;
            }
        }
        else return false;
    }

    /**
     * @param message the message content.
     * @param msg     a {@code StringBuilder} variable that will have the {@code message} content appended to.
     */
    public static void setMessage(String message, StringBuilder msg) {
        if (msg != null)
            msg.append((msg.isEmpty()) ? "" : "###").append(message);
    }

    /**
     * <p>This method looks in the {@link Persons#persons} list for an entry
     * that has {@code personId} in the {@link Persons#personId} field <br>
     * (i.e., unique value field).</p>
     *
     * @param personId person's ID to be searched.
     * @return a {@link Persons} object with given parameter,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    public static Persons findPerson(long personId) {
        // Initial validation
        if (personId <= 0) return null;
/*
        // =====================================
        // = Iterator approach                 =
        // = (a bit quicker but less readable) =
        // =====================================

        // Generates an iterator for list navigation
        ListIterator<Persons> iterator = persons.listIterator();

        // Navigates through the list and checks if there's
        // a person with [personId]
        while (iterator.hasNext()) {
            Persons person = iterator.next();
            if (person.getPersonId() == personId) return person;
        }
*/
        // Navigates through the list and checks if there's
        // a person with [personId]
        for (Persons person : persons) {
            if (person.getPersonId() == personId) return person;
        }

        // Final output
        return null;
    }

    /**
     * <p>This method looks in the {@link Persons#persons} list for an entry
     * that has {@code ssn} in the {@link Persons#ssn} field
     * (i.e., unique value field).</p>
     *
     * @param ssn the social security number to be searched
     * @return a {@link Persons} object with given parameter,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    public static Persons findPerson(String ssn) {
        // Initial validation
        if (ssn.isBlank()) return null;
/*
        // =====================================
        // = Iterator approach                 =
        // = (a bit quicker but less readable) =
        // =====================================

        // Generates an iterator for list navigation
        ListIterator<Persons> iterator = persons.listIterator();

        // Navigates through the list and checks if there's a person
        // who has the [ssn] parameter value in the [ssn] field
        while (iterator.hasNext()) {
            Persons person = iterator.next();
            if (person.getSsn().equalsIgnoreCase(ssn)) return person;
        }
 */
        // Navigates through the list and checks if there's a person
        // who has the [ssn] parameter value in the [ssn] field
        for (Persons person : persons) {
            if (person.getSsn().equalsIgnoreCase(ssn)) return person;
        }

        // Final output if nothing's found
        return null;
    }

    /**
     * This method looks in the {@link Persons#persons} list for entries
     * that have {@code lookup} in {@link Persons#firstName}, {@link Persons#lastName},
     * {@link Persons#address}, {@link Persons#allocationData}, {@link Persons#email},
     * {@link Persons#idCardData}, {@link Persons#employeeType}, or
     * {@link Persons#userName} fields depending on the value specified by the
     * {@code field} parameter.
     *
     * @param lookup  the term to be searched in the field specified by {@code field} parameter.
     * @param field   initial letter of the field where to look:<br>
     *                <b>A</b> for  {@link Persons#address}<br>
     *                <b>D</b> for  {@link Persons#allocationData}<br>
     *                <b>E</b> for  {@link Persons#email}<br>
     *                <b>F</b> for  {@link Persons#firstName}<br>
     *                <b>I</b> for  {@link Persons#idCardData}<br>
     *                <b>T</b> for  {@link Persons#employeeType}<br>
     *                <b>U</b> for  {@link Persons#userName}<br>
     *                Anything else for  {@link Persons#lastName}.
     * @param isEqual comparison flag. If true, {@code equalsIgnoreCase()} method will be used
     *                for comparison, otherwise {@code contains()}.
     * @return an ArrayList of {@link Persons} objects that satisfy given parameters,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    public static ArrayList<Persons> findPerson(String lookup, String field, boolean isEqual) {
        // Initial validation
        if (lookup.isBlank()) return null;

        // Result holding variable
        ArrayList<Persons> arResult = new ArrayList<>();
/*
        // =====================================
        // = Iterator approach                 =
        // = (a bit quicker but less readable) =
        // =====================================

        // Generates an iterator for list navigation
        ListIterator<Persons> iterator = persons.listIterator();

        // Navigates through the list and collects all resources that have
        // [lookup] in [firstName], [lastName], [address], [idCardData],
        // [email], [allocationData], [employeeType] or [userName] fields,
        // depending on the value passed as [field] parameter
        while (iterator.hasNext()) {

            Persons person = iterator.next();

            // Comparison field value depending on the value
            // given for the [field] parameter.
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

            boolean bFlag = (isEqual) ? sField.equals(lookup) : sField.contains(lookup);
            if (bFlag) arResult.add(person);
        }
 */
        // Navigates through the list and collects all resources that have
        // [lookup] in [firstName], [lastName], [address], [idCardData],
        // [email], [allocationData], [employeeType] or [userName] fields,
        // depending on the value passed as [field] parameter
        for (Persons person : persons) {

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
     * @return formatted resource data: <br>{@link Persons#firstName} {@link Persons#lastName}{@code , }
     * {@link Persons#ssn}{@code , }{@link Persons#idCardData}{@code , }{@link Persons#email}
     * {@code [}{@link Persons#address}{@code ] }{@code (id: }{@link Persons#personId}{@code )}
     * {{@link Persons#userName}}
     */
    @Override
    public String toString() {
        return String.format("%S %S, %s, %S, %s, %s, %s [%s] (id: %d) {%s}",
                firstName, lastName, ssn,
                idCardData, email, allocationData,
                employeeType, address, personId,
                userName);
    }
}


/**
 * Code testing class
 */
class PersonTest {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(Persons.createPerson("firstName" + i, "lastName" + i, "address" + i,
//                    "ssn" + i, "idCardData" + i, "abc@email" + i + ".com"));
//        }
//
//        System.out.println(Persons.createPerson("firstName", "lastName1", "address",
//                "ssn", "idCardData", "firstName.lastName@email.com"));
//
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(Persons.createPerson("firstName" + i, "lastName" + i, "address" + i,
//                    "ssn" + i, "idCardData" + i, "abc@email" + i + ".com"));
//        }
/*
        System.out.println(Persons.findPerson("email1", "email", false));
        System.out.println(Persons.findPerson("firstname.lastname1", "user", true));
*/

        StringBuilder msg = new StringBuilder();

        Persons person = Persons.createPerson(null, "John", "Doe", "Nowhere", "1741211123456",
                "RX123456", "johny.popp@gmail.com", EmployeeType.ADMINISTRATOR, msg);
        System.out.println(person + "\nMsg: " + msg + "\n");

        Persons admin = Administrators.createAdmin("John", "Doe", "Nowhere", "1231211123456",
                "RX123456", "john.doe@gmail.com", msg);
        System.out.println(admin + "\nMsg: " + msg + "\n");

        Persons admin1 = Administrators.createAdmin("John", "Doe", "Nowhere", "1231211123456",
                "RX123456", "john.doe@gmail.com", msg);
        System.out.println(admin1 + "\nMsg: " + msg + "\n");
        admin1 = Administrators.createAdmin("Johny", "Che", "Nowhere", "1641211123456",
                "RX123456", "johny.che@gmail.com", msg);
        System.out.println(admin1 + "\nMsg: " + msg);
        admin1.setEmployeeType(admin1, EmployeeType.TEAMLEADER, null, null);
        System.out.println(admin1.getUserName() + " is now type " + admin1.getEmployeeType());
        Persons person1 = Persons.createPerson(admin1, "Johny", "Pope", "Nowhere", "1741211123456",
                "RX123456", "johny.pope@mail.com", EmployeeType.MANAGER, msg);
/*
        System.out.println(person1);
        admin1.setEmployeeType(EmployeeType.ADMINISTRATOR, admin);
        System.out.println(admin1.getUserName() + " is type " + admin1.getEmployeeType());
        person1 = Persons.createPerson(admin1, "Johny", "Pope", "Nowhere", "1741211123456",
                "RX123456", "johny.pope@mail.com", EmployeeType.MANAGER, msg);
*/
        System.out.println(person1 + "\nMsg: " + msg + "\n");

        person1 = Persons.createPerson(admin, "Johny", "Pope", "Nowhere", "1741211123456",
                "RX123456", "johny.pope@mail.com", EmployeeType.MANAGER, msg);
        System.out.println(person1 + "\nMsg: " + msg + "\n");

        Persons person2 = Persons.createPerson(person1, "John", "Doe", "Nowhere", "1741211123450",
                "RX123456", "johny.popp@gmail.com", EmployeeType.EMPLOYEE, null);
        System.out.println(person2 + "\nMsg: " + msg + "\n"); // [msg] remains unchanged

        person2 = Persons.createPerson(admin, "Dan", "Don", "Nowhere", "1641022123456",
                "RX123456", "dan.don@mail.com", msg);
        System.out.println(person2 + "\nMsg: " + msg + "\n");

        Teams team = Teams.createTeam(admin, "T001", "First team", "P001", msg);
        Teams.addTeamMember(admin, person2.getSsn(), false, team, msg);

        person2.setEmployeeType(person2, EmployeeType.MANAGER, team, null);
        System.out.println(person2.getUserName() + " is type " + person2.getEmployeeType());
        person2.setEmployeeType(admin1, EmployeeType.TEAMLEADER, team, null);
        System.out.println("Now " + person2.getUserName() + " is type " + person2.getEmployeeType());
        person2.setEmployeeType(admin, EmployeeType.TEAMLEADER, team, null);
        System.out.println("Now " + person2.getUserName() + " is type " + person2.getEmployeeType()
                + "\nMsg: " + team + "\n" + person2);



/*
        System.out.println(manager + "  ###  " + ((manager != null) ? manager.getEmployeeType() : null));
        System.out.println(Persons.findPerson("ssn1").getEmployeeType());
        System.out.println(Persons.findPerson("ssn01").setAllocationData("boohoo"));
        System.out.println(manager.getAllocationData());
*/
    }
}