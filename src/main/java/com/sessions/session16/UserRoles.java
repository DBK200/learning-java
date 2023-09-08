package com.sessions.session16;

import com.sessions.session12.polymorphism.User;

public enum UserRoles {

    SUPER_ADMIN("delete all users", "this an administrator of the entire application"),
    ADMIN("delete other clients", "this is a business administrator"),
    CLIENT("place orders", "this is the end user");
    private String permission;
    private String description;

    UserRoles(String permission, String description) {
        this.permission = permission;
        this.description = description;
    }

    public String getPermission(){
        UserRoles.values();
        return permission;
    }

    public String getDescription(){
        return description;
    }
}

class EnumTestS16 {
    public static void main(String[] args) {
//        UserRoles role = UserRoles.ADMIN;
//        System.out.println(role.name());
//        System.out.println(role.getPermission());

        UserRoles superAdminRole= UserRoles.SUPER_ADMIN;
        System.out.println(superAdminRole);
        System.out.println(superAdminRole.getPermission());
        System.out.println(superAdminRole.ordinal());

    }

}