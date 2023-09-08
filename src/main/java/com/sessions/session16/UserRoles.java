package com.sessions.session16;

public enum UserRoles {

    SUPER_ADMIN("delete all users","this is an administrator of the entire application"),
    ADMIN("delete other client","this is a bisiness administrator"),
    CLIENT("place orders","this is the end user");

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
}

class EnumTest{
    public static void main(String[] args) {
//       UserRoles role= UserRoles.ADMIN ;
//        System.out.println(role);
//        System.out.println(role.name());
//        System.out.println(role.getPermission());

        UserRoles superAdminRole= UserRoles.SUPER_ADMIN ;
        System.out.println(superAdminRole);
        System.out.println(superAdminRole.getPermission());
        System.out.println(superAdminRole.ordinal());
    }
}