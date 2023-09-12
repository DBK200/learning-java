package com.sessions.session16;

import com.sessions.session15.Homework.Challange1.Rectangle;

public enum UserRoles {

    SUPER_ADMIN("delete all users", "this is the administrator of the entire application"),
    ADMIN("delete other clients", "this is the business admin"),
    CLINET("place oreders", "this is the end user");
    private String permission;
    private String description;
    UserRoles(String permission, String description){
        this.permission = permission;
        this.description = description;
    }
    public String getPermission(){
        return permission;
    }
    public String getDescription(){
        return description;
    }

}

class EnumTest{

    public static void main(String[] args) {

        UserRoles role = UserRoles.ADMIN;
        System.out.println(role.name());
        System.out.println(role.getPermission());
    }
}
