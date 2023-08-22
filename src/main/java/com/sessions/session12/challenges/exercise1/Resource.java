package com.sessions.session12.challenges.exercise1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class is used to implement resources data.
 * @author  <b><i>Catalin Martazan</i></b>
 * */
public class Resource {
    private String code;
    private String name;
    private String description;
    private int quantity;

    // Holds all [Resource] class created objects
    private static LinkedList<Resource> resources = new LinkedList<>();

    // Unique ID value
    private long resourceId;

    // Unique value.
    // It is incremented with every instantiation
    // and the allocated to [resId]
    private static long resourceNo;

    private Resource(Object publisher, String code, String name, String description, int quantity) {
        if (publisher instanceof Persons
                && ((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                && !code.isBlank()
                && !name.isBlank()) {
            this.name = name;
            this.code = code;
            this.description = description;
            if (quantity > 0) this.quantity = quantity;
            resourceId = ++resourceNo;
            resources.add(this);
        }
    }

    /**
     * Creates a new {@link Resource} class object after some validation.<br>
     * Replaces the usual constructor introducing duplicate checking.
     *
     * @param publisher   the person who does the operation.
     *                    The person must have {@link EmployeeType#ADMINISTRATOR}.
     * @param code        resource code.
     * @param name        resource name.
     * @param description resource description. If nothing's passed, returns "(none)".
     * @param quantity    resource quantity.
     * @param msg          method's return message. This parameter is used to get a return message
     *                     after the method is executed. If no return message is wanted, {@code null} must be used.
     * @return a new {@link Resource} class object,<br><i>or</i><br>
     * {@code null} if there's an existing {@link Resource} class object that has the same
     * {@code code} value in the {@link Resource#code} field, {@code publisher} doesn't have
     * {@link EmployeeType#ADMINISTRATOR}, or one or more input parameters are wrong.
     */
    public static Resource createResource(Object publisher, String code, String name,
                                          String description, int quantity, StringBuilder msg){
        // Initial validation
        if (!(publisher instanceof Persons)
                || !((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                || code.isBlank()
                || name.isBlank()) {
            Persons.setMessage("[Err] No publishing rights or/and wrong arguments!", msg);
            return null;
        }
        else {
            // Holds the finding result into a variable
            // for multiple usage
            Resource findResult = findResource(code);

            if (findResult == null) {
                // The direct call af the constructor can return, when its conditions are not met,
                // a non-null object filled with default values for allocated variable types,
                // thus was discarded and replaced with next one
                Resource resource = new Resource(publisher, code, name,
                        ((description == null || description.isBlank()) ? "(none)" : description), quantity);
                resource = (resource.getCode() == null) ? null : resource;
                Persons.setMessage((resource != null) ? resource.toString() : null, msg);
                return resource;
            }
            else {
                Persons.setMessage(String.format("[Err] A resource with [code: %s] already exists!", code), msg);
                return null;
            }
        }
    }

    /**
     * Creates a new {@link Resource} class object after some validation.<br>
     * Replaces the usual constructor introducing duplicate checking.
     *
     * @param publisher   the person who does the operation.
     *                    The person must have {@link EmployeeType#ADMINISTRATOR}.
     * @param code        resource code
     * @param name        resource name
     * @param quantity    resource quantity.
     * @param msg          method's return message. This parameter is used to get a return message
     *                     after the method is executed. If no return message is wanted, {@code null} must be used.
     * @return a new {@link Resource} class object,<br><i>or</i><br>
     * {@code null} if there's an existing {@link Resource} class object that has the same
     * {@code code} value in the {@link Resource#code} field, {@code publisher} doesn't have
     * {@link EmployeeType#ADMINISTRATOR}, or one or more input parameters are wrong.
     */
    public static Resource createResource(Object publisher, String code, String name,
                                          int quantity, StringBuilder msg){
        return createResource(publisher, code, name, "", quantity, msg);
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public long getResourceId() {
        return resourceId;
    }

    /**
     * This method sets the resource quantity value, depending on {@code publisher} rights.<br>
     * Rights depend on the value of {@link Persons#employeeType} field of the parameter {@code publisher}.
     *
     * @param publisher  the person who does the operation. Must be {@link EmployeeType#ADMINISTRATOR}
     *                   to be able to set a value.
     * @param quantity    resource quantity.
     * @param msg       method's return message. This parameter is used to get a return message
     *                  after the method is executed. If no return message is wanted,
     *                  {@code null} must be used.
     * @return {@code true} if the allocation data was set successfully,<br><i>or</i><br>
     * {@code false} if allocation data has the same value as the one to be set.
     */
    public boolean setQuantity(Object publisher, int quantity, StringBuilder msg) {
        if (!(publisher instanceof Persons)
                && ((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                && this.quantity != quantity) {
            this.quantity = quantity;
            return true;
        }
        else {
            Persons.setMessage("[Err] No publishing rights or/and nothing to modify!", msg);
            return false;
        }
    }

    /**
     * This method looks in the {@link Resource#resources} list for an entry
     * that has {@code resourceId} in the {@link Resource#resourceId} field
     * (i.e., unique value field).
     *
     * @param resourceId resource ID to be searched
     * @return a {@link Resource} object with given parameter,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    static public Resource findResource(long resourceId) {
        // Initial validation
        if (resourceId <= 0) return null;

        // Navigates through the list and checks if there's
        // a resource with [resourceId]
        for (Resource resource : resources) {
            if (resource.getResourceId() == resourceId) return resource;
        }

        // Final output
        return null;
    }

    /**
     * This method looks in the {@link Resource#resources} list for an entry
     * that has {@code code} in the {@link Resource#code} field
     * (i.e., unique value field).
     *
     * @param code the code to be searched
     * @return a {@link Resource} object with given parameter,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    static public Resource findResource(String code) {
        // Initial validation
        if (code.isBlank()) return null;

        // Navigates through the list and gets the object
        // that has the [code] value in the [code] field
        for (Resource resource : resources) {
            if (resource.getCode().equalsIgnoreCase(code)) return resource;
        }

        // Final output if nothing's found
        return null;
    }

    /**
     * This method looks in the {@link Resource#resources} list for entries
     * that have {@code lookup} in {@link Resource#name} or {@link Resource#description},
     * depending on the value specified by the {@code field} parameter.
     *
     * @param lookup the term to be searched in the field specified by {@code field} parameter
     * @param field   initial letter of the field where to look:<br>
     *                <b>D</b> for {@link Resource#description}<br>
     *                Anything else for  {@link Resource#name}.
     * @param isEqual comparison flag. If true, {@code equalsIgnoreCase()} method will be used
     *                for comparison, otherwise {@code contains()}.
     * @return an ArrayList of {@link Resource} objects that satisfy given parameters,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    static public ArrayList<Resource> findResource(String lookup, String field, boolean isEqual) {
        // Initial validation
        if (lookup.isBlank()) return null;

        // Result holding variable
        ArrayList<Resource> arResult = new ArrayList<>();

        // Navigates through the list and collects all resources
        // that have [lookup] in [name] or [description] fields,
        // depending on the value passed as [field] parameter
        for (Resource resource : resources) {

            // Comparison field value depending on the value
            // passed as [field] parameter.
            String sField = (field.toUpperCase().charAt(0) == 'D')
                    ? resource.getDescription()
                    : resource.getName();

            boolean bFlag = (isEqual) ? sField.equalsIgnoreCase(lookup) : sField.contains(lookup);
            if (bFlag) arResult.add(resource);
        }

        // Final output
        return (arResult.isEmpty()) ? null : arResult;
    }

    /**
     * @return formatted resource data:  {@link Resource#code} {@link Resource#name}
     * {@code [}{@link Resource#description}{@code ]} {@code (id: }{@link Resource#resourceId}{@code )}
     */
    @Override
    public String toString() {
        return String.format("%s %s [%s] (id: %d)", code, name, description, resourceId);
    }
}


/**
 * Code testing class
 */
class ResourceTest {
    public static void main(String[] args) {
/*
        for (int i = 1; i <= 10; i++) {
            System.out.println(Resource.createResource("code" + i,"name" + i, "description " + i));
        }
        for (int i = 5; i <= 15; i++) {
            System.out.println(Resource.createResource("code" + i,"name" + i));
        }
*/
    }
}