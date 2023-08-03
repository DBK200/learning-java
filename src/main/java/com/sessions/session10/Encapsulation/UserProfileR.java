package com.sessions.session10.Encapsulation;

public class UserProfileR
{
    private String firstName;
    private int id;
    private String userName;
    private String lastName;
    private String email;
    //constructorul nu are un return type!!!
//    public UserProfileR(int id)
//    {
//        if(id<1)
//        {
//            System.out.println("invalid id");
//        }
//        return id;
//    }

    public String getFirstName()
    {
        return firstName;
    }

    public int getId()
    {
        return id;
    }
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    public void setId(int id)
    {
        this.id = id;
    }
}
