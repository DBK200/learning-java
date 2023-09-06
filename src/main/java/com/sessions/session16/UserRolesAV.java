package com.sessions.session16;

public enum UserRolesAV {
    SUPER_ADMIN("delete all users", "this is an admin of the entire application"),
    ADMIN("delete other clients", "this is a business administrator"),
    CLIENT("place orders", "this is the end user");
    private String permission;
    private String description;
    UserRolesAV(String permission, String description) {
        this.permission = permission;
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public String getPermission() {
        return permission;
    }
}

class EnumTest {
    public static void main(String[] args) {

        UserRolesAV role = UserRolesAV.ADMIN;
        System.out.println(role.name());
        System.out.println(role.getPermission());

        UserRolesAV superAdminRole = UserRolesAV.SUPER_ADMIN;
        System.out.println(superAdminRole);
        System.out.println(superAdminRole.getPermission());
        System.out.println(superAdminRole.ordinal());
    }
}
