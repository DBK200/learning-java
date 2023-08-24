package com.sessions.session12.challenges.exercise1;

public class InventoryEntry {

    private Resources resource;

    private int requestedQuantity;

    private int neededQuantity = 0;

    private InventoryEntry(Object publisher, Resources resource, int requestedQuantity) {
        if (publisher instanceof Persons
                && ((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                && (resource != null)
                && requestedQuantity > 0) {
            this.resource = resource;
            this.requestedQuantity = requestedQuantity;

            // Updates [resource]'s [availableQuantity] field and if the [requestedQuantity]
            // is partially available updates also this class's [neededQuantity] field
            int iResult = resource.setQuantity(publisher, -requestedQuantity, null);
            this.neededQuantity = Math.min(iResult, requestedQuantity);
        }
    }

    /**
     * Replaces the usual constructor in creating a new {@link InventoryEntry} class object
     * after some validation.
     *
     * @param publisher         the person who does the operation.
     *                          The person must have {@link EmployeeType#ADMINISTRATOR}.
     * @param resource          resource object to be added.
     * @param requestedQuantity resource needed quantity.
     * @param msg               method's return message. This parameter is used to get a return message
     *                          after the method is executed. If no return message is wanted,
     *                          {@code null} must be used.
     * @return a new {@link InventoryEntry} class object,<br><i>or</i><br
     * {@code null} if there isn't any {@link Resources} class object that has the same
     * {@code code} value in the {@link Resources#code} field, {@code publisher} doesn't have
     * {@link EmployeeType#ADMINISTRATOR}, or one or more input parameters are wrong.
     */
    public InventoryEntry createInventoryEntry(Object publisher, Resources resource, int requestedQuantity,
                                               StringBuilder msg) {
        // Initial validation
        if (!(publisher instanceof Persons)
                || !((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                || (resource == null)
                || requestedQuantity <= 0) {
            Persons.setMessage("[Err] No publishing rights or/and wrong arguments!", msg);
            return null;
        }
        else {
            // Holds the finding result into a variable
            // for multiple usage
            Resources findResult = Resources.findResource(resource.getCode());

            // Checks if the resource is present
            // between available resources
            if (findResult != null) {
                InventoryEntry entry = new InventoryEntry(publisher, resource, requestedQuantity);
                entry = (entry.getResource() == null) ? null : entry;
                Persons.setMessage((entry != null) ? entry.toString() : null, msg);
                return entry;
            }

            // Resource not found
            else {
                Persons.setMessage("[Err] No such resource was found!", msg);
                return null;
            }

        }
    }

    public Resources getResource() {
        return resource;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }

    public int getNeededQuantity() {
        return neededQuantity;
    }

    /**
     * This method updates the quantity of {@link InventoryEntry#resource}
     * needed for current allocated project (i.e., with {@link InventoryEntry#neededQuantity}).
     *
     * @param publisher      the person who does the operation.
     *                       The person must have {@link EmployeeType#ADMINISTRATOR}.
     * @param msg            method's return message. This parameter is used to get a return message
     *                       after the method is executed. If no return message is wanted,
     *                       {@code null} must be used.
     * @return {@code true} if after the update was done successfully ,<br><i>or</i><br>
     * {@code false} if the update was not done successfully, {@code publisher} doesn't have
     * {@link EmployeeType#ADMINISTRATOR}, or one or more input parameters are wrong.
     */
    public boolean updateNeededQuantity(Object publisher, StringBuilder msg) {
        if (!(publisher instanceof Persons)
                && ((Persons) publisher).getEmployeeType().equals(EmployeeType.ADMINISTRATOR)
                && this.neededQuantity > 0) {
            // Updates the resource [availableQuantity] field.
            // If the update quantity (i.e., this class's [neededQuantity] field value)
            // is partially available, it will be also updated.
            int iResult = resource.setQuantity(publisher, -this.neededQuantity, null);

            // Updates resource's status in current project
            if (iResult < this.neededQuantity) this.neededQuantity = iResult;
            return true;
        }
        else {
            Persons.setMessage("[Err] No publishing rights or/and nothing to modify!", msg);
            return false;
        }
    }
}
