package com.sessions.session16;

public enum UserRolesR
{
    SUPER_ADMIN("delete all users","this is an administrator of the entire application"),
    ADMIN("delete order clients","this is a business administrator"),
    CLIENT("place orders","this is the end user");
    private String permission;
    private String description;
    UserRolesR(String permission,String description)
    {
        this.permission=permission;
        this.description=description;
    }
    public String getPermission()
    {
        return permission;
    }
    public String getDescription()
    {
        return description;
    }
}



class EnumTestR
{
    public static void main(String[] args)
    {
        UserRolesR role=UserRolesR.ADMIN;
        System.out.println(role);
        System.out.println(role.getPermission());

        UserRolesR superAdminRole=UserRolesR.SUPER_ADMIN;
        System.out.println(superAdminRole);
        System.out.println(superAdminRole.getPermission());
        System.out.println(superAdminRole.ordinal());
    }
}