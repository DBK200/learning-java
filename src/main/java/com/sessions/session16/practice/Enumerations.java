package com.sessions.session16.practice;

public class Enumerations {
    public static void main(String[] args) {
        UserRoles role = UserRoles.SUPER_ADMIN;
        System.out.println(role);
        role = UserRoles.ADMIN;
        System.out.println(role);
        System.out.println(role.getPermission() + " | " +
                role.getDescription());

    }
}

enum UserRoles {
    SUPER_ADMIN("SUPER_ADMIN permissions","SUPER_ADMIN description"){
        // Custom toString() available only for this constant
        // Overrides enum's toString() method.
        @Override
        public String toString() {
            return this.name() + " * " + this.getPermission() + " * " + this.getDescription();
        }
    },
    ADMIN("ADMIN permissions","ADMIN description"),
    CLIENT("CLIENT permissions","CLIENT description");

    private String permission;
    private String description;

    UserRoles(String permission, String description) {
        this.permission = permission;
        this.description = description;
    }

    public String getPermission() {
        return permission;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return String.format("[%s: permission=\"%s\", description=\"%s\"]",
                this.name(), permission, description);
    }
}