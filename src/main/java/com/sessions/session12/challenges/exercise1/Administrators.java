package com.sessions.session12.challenges.exercise1;

/**
 * This class is used to implement Administrator's data.<br>
 * Objects of this class are needed for the initial administrator declaration.
 *
 * @author <b><i>Catalin Martazan</i></b>
 */
public class Administrators extends Persons {

    private Administrators(String firstName, String lastName, String address,
                           String ssn, String idCardData, String email) {
        super(null, firstName, lastName, address, ssn, idCardData, email, EmployeeType.ADMINISTRATOR);
    }

    /**
     * Creates a new {@link Administrators} class object after some validation.<br>
     * Replaces the usual constructor, introducing duplicate checking.
     *
     * @param firstName  person's first name
     * @param lastName   person's last name
     * @param address    person's address
     * @param ssn        person's social security number
     * @param idCardData person's identity card data "{@code ID serial}" and "{@code ID number}" (e.g., RX123456)
     * @param email      person's email address
     * @param msg        method's return message. This parameter is used to get a return message
     *                   after the method is executed. If no return message is wanted, {@code null} must be used.
     * @return a new {@link Administrators} class object,<br><i>or</i><br>
     * {@code null} if there's already one class {@link Persons} object that has the same {@code ssn}
     * value in the {@link Persons#ssn} field.
     */
    public static Administrators createAdmin(String firstName, String lastName, String address,
                                             String ssn, String idCardData, String email,
                                             StringBuilder msg) {
        // Initial validation
        if (ssn.isBlank()
                || firstName.isBlank()
                || lastName.isBlank()
                || address.isBlank()
                || idCardData.isBlank()
                || email.isBlank()) {
            Persons.setMessage("[Err] Wrong arguments!", msg);
            return null;
        }

        else {
            // Creates a new ADMIN class object if
            // no person with [ssn] is present,
            // or returns NULL otherwise

            // Holds the findings into a variable
            // for multiple operations
            Persons findResult = Persons.findPerson(ssn);

            if (findResult == null) {
                Administrators admin = new Administrators(firstName, lastName, address, ssn, idCardData, email);
                Persons.setMessage(admin.toString(), msg);
                return admin;
            }
            else {
                Persons.setMessage(String.format("[Err] A person with [ssn: %s] already exists!", ssn), msg);
                return null;
            }
        }
    }

}
