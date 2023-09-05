package com.sessions.session16;

public enum UserRoles {

    SUPER_ADMIN("delete all users", "this is an administrator of the entire application"),
    ADMIN("delete other clients", "this is a business administrator"),
    CLIENT("place orders", "this is the end user");
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
            // un enum se defineste similar cu un obiect
            // constantele se apeleaza ca si cand ar fi statice
//        UserRoles role = UserRoles.ADMIN;
//        System.out.println(role.name());  // -> printeaza ADMIN
//        System.out.println(role.getPermission());

        UserRoles superAdminRole = UserRoles.SUPER_ADMIN;
        System.out.println(superAdminRole);     // -> printeaza numele lui
        System.out.println(superAdminRole.getPermission());  // -> printeaza permisiunea lui
        System.out.println(superAdminRole.getDescription());  // -> printeaza descrierea lui
        System.out.println(superAdminRole.ordinal());


    }
}
