package com.sessions.session17;

public enum UserRoles {

    SUPER_ADMIN("delete all accounts", "this is the administrator of the entire application"),
    ADMIN("delete client users", "this is the administrator of the business"),
    CLIENT("delete own account", "this is the end user/client of the application");

    private final String permission;
    private final String description;

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
//
//    public String toString(){
//        return this.name()+" has this permission:" + getPermission() + ". " +
//        getDescription();
//    }
}

class TestRoles{
    public static void main(String[] args) {
        UserRoles userRoles= UserRoles.SUPER_ADMIN;
//        System.out.println(userRoles);
        System.out.println(userRoles);
        System.out.println(userRoles.name());
        System.out.println(userRoles.getPermission());
        System.out.println(userRoles.getDescription());
    }
}
