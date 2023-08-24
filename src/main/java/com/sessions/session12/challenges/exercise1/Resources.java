package com.sessions.session12.challenges.exercise1;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * This class is used to implement resources data.
 * @author  <b><i>Catalin Martazan</i></b>
 * */
public class Resources {
    private String code;
    private String name;
    private String description;
    private int availableQuantity;
    private int neededQuantity;

    // Holds all [Resources] class created objects
    private static LinkedList<Resources> resources = new LinkedList<>();

    // Unique ID value
    private long resourceId;

    // Unique value.
    // It is incremented with every instantiation
    // and the allocated to [resId]
    private static long resourceNo;

    private Resources(Object publisher, String code, String name, String description, int quantity) {
        if (publisher instanceof Persons
                && ((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                && !code.isBlank()
                && !name.isBlank()) {
            this.name = name;
            this.code = code;
            this.description = description;
            if (quantity > 0) this.availableQuantity = quantity;
            resourceId = ++resourceNo;
            resources.add(this);
        }
    }

    /**
     * Creates a new {@link Resources} class object after some validation.<br>
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
     * @return a new {@link Resources} class object,<br><i>or</i><br>
     * {@code null} if there's an existing {@link Resources} class object that has the same
     * {@code code} value in the {@link Resources#code} field, {@code publisher} doesn't have
     * {@link EmployeeType#ADMINISTRATOR}, or one or more input parameters are wrong.
     */
    public static Resources createResources(Object publisher, String code, String name,
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
            Resources findResult = findResource(code);

            if (findResult == null) {
                // The direct call of the constructor can return, when its conditions are not met,
                // a non-null object filled with default values for allocated variable types,
                // thus was discarded and replaced with the next one
                Resources resources = new Resources(publisher, code, name,
                        ((description == null || description.isBlank()) ? "(none)" : description), quantity);
                resources = (resources.getCode() == null) ? null : resources;
                Persons.setMessage((resources != null) ? resources.toString() : null, msg);
                return resources;
            }
            else {
                Persons.setMessage(String.format("[Err] A resource with [code: %s] already exists!", code), msg);
                return null;
            }
        }
    }

    /**
     * Creates a new {@link Resources} class object after some validation.<br>
     * Replaces the usual constructor introducing duplicate checking.
     *
     * @param publisher   the person who does the operation.
     *                    The person must have {@link EmployeeType#ADMINISTRATOR}.
     * @param code        resource code
     * @param name        resource name
     * @param quantity    resource quantity.
     * @param msg          method's return message. This parameter is used to get a return message
     *                     after the method is executed. If no return message is wanted, {@code null} must be used.
     * @return a new {@link Resources} class object,<br><i>or</i><br>
     * {@code null} if there's an existing {@link Resources} class object that has the same
     * {@code code} value in the {@link Resources#code} field, {@code publisher} doesn't have
     * {@link EmployeeType#ADMINISTRATOR}, or one or more input parameters are wrong.
     */
    public static Resources createResources(Object publisher, String code, String name,
                                            int quantity, StringBuilder msg){
        return createResources(publisher, code, name, "", quantity, msg);
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

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public int getNeededQuantity() {
        return neededQuantity;
    }

    public long getResourceId() {
        return resourceId;
    }

    /**
     * This method adds or removes {@code quantity} from {@link Resources#availableQuantity},
     * depending on {@code publisher} rights.<br>
     * If {@code quantity} is a positive number, the value will be added to the value of
     * {@link Resources#availableQuantity} and/or removed from {@link Resources#neededQuantity},
     * otherwise the other way around.<br>
     * Rights depend on the value of {@link Persons#employeeType} field of the parameter {@code publisher}.
     *
     * @param publisher the person who does the operation. Must be {@link EmployeeType#ADMINISTRATOR}
     *                  to be able to set a value.
     * @param quantity  quantity added or removed from {@link Resources#availableQuantity}.
     *                  Positive for addition and negative for removal.
     * @param msg       method's return message. This parameter is used to get a return message
     *                  after the method is executed. If no return message is wanted,
     *                  {@code null} must be used.
     * @return {@link Resources#neededQuantity} value,<br><i>or</i><br>
     * {@code Integer.MAX_VALUE} if {@code publisher} doesn't have {@link EmployeeType#ADMINISTRATOR},
     * or nothing to modify.
     */
    public int setQuantity(Object publisher, int quantity, StringBuilder msg) {
        if (!(publisher instanceof Persons)
                && ((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                && quantity != 0) {

            // [neededQuantity] > 0 means [availableQuantity] = 0
            if (this.neededQuantity > 0) {
                this.neededQuantity -= quantity;
                if (this.neededQuantity < 0) {
                    this.availableQuantity = -this.neededQuantity;
                    this.neededQuantity = 0;
                }
            }

            // [availableQuantity] > 0 means [neededQuantity] = 0
            else {
                this.availableQuantity += quantity;
                if (this.availableQuantity < 0) {
                    this.neededQuantity = -this.availableQuantity;
                    this.availableQuantity = 0;
                }
            }
            return this.neededQuantity;
        }
        else {
            Persons.setMessage("[Err] No publishing rights or/and nothing to modify!", msg);
            return Integer.MAX_VALUE;
        }
    }

    /**
     * This method looks in the {@link Resources#resources} list for an entry
     * that has {@code resourceId} in the {@link Resources#resourceId} field
     * (i.e., unique value field).
     *
     * @param resourceId resource ID to be searched
     * @return a {@link Resources} object with given parameter,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    static public Resources findResource(long resourceId) {
        // Initial validation
        if (resourceId <= 0) return null;

        // Navigates through the list and checks if there's
        // a resource with [resourceId]
        for (Resources resources : Resources.resources) {
            if (resources.getResourceId() == resourceId) return resources;
        }

        // Final output
        return null;
    }

    /**
     * This method looks in the {@link Resources#resources} list for an entry
     * that has {@code code} in the {@link Resources#code} field
     * (i.e., unique value field).
     *
     * @param code the code to be searched
     * @return a {@link Resources} object with given parameter,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    static public Resources findResource(String code) {
        // Initial validation
        if (code.isBlank()) return null;

        // Navigates through the list and gets the object
        // that has the [code] value in the [code] field
        for (Resources resources : Resources.resources) {
            if (resources.getCode().equalsIgnoreCase(code)) return resources;
        }

        // Final output if nothing's found
        return null;
    }

    /**
     * This method looks in the {@link Resources#resources} list for entries
     * that have {@code lookup} in {@link Resources#name} or {@link Resources#description},
     * depending on the value specified by the {@code field} parameter.
     *
     * @param lookup the term to be searched in the field specified by {@code field} parameter
     * @param field   initial letter of the field where to look:<br>
     *                <b>D</b> for {@link Resources#description}<br>
     *                Anything else for  {@link Resources#name}.
     * @param isEqual comparison flag. If true, {@code equalsIgnoreCase()} method will be used
     *                for comparison, otherwise {@code contains()}.
     * @return an ArrayList of {@link Resources} objects that satisfy given parameters,<br><i>or</i><br>
     * {@code null} if nothing's found.
     */
    static public ArrayList<Resources> findResource(String lookup, String field, boolean isEqual) {
        // Initial validation
        if (lookup.isBlank()) return null;

        // Result holding variable
        ArrayList<Resources> arResult = new ArrayList<>();

        // Navigates through the list and collects all resources
        // that have [lookup] in [name] or [description] fields,
        // depending on the value passed as [field] parameter
        for (Resources resources : Resources.resources) {

            // Comparison field value depending on the value
            // passed as [field] parameter.
            String sField = (field.toUpperCase().charAt(0) == 'D')
                    ? resources.getDescription()
                    : resources.getName();

            boolean bFlag = (isEqual) ? sField.equalsIgnoreCase(lookup) : sField.contains(lookup);
            if (bFlag) arResult.add(resources);
        }

        // Final output
        return (arResult.isEmpty()) ? null : arResult;
    }

    /**
     * @return formatted resource data:  {@link Resources#code} {@link Resources#name}
     * {@code [}{@link Resources#description}{@code ]} {@code (id: }{@link Resources#resourceId}{@code )}
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
            System.out.println(Resources.createResource("code" + i,"name" + i, "description " + i));
        }
        for (int i = 5; i <= 15; i++) {
            System.out.println(Resources.createResource("code" + i,"name" + i));
        }
*/
    }
}