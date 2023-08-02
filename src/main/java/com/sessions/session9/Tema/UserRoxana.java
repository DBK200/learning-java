package com.sessions.session9.Tema;

public class UserRoxana
{
    // 7 instance properties
    private String firstName;
    private String secondName;
    private String nationality;
    private int age;
    private String sex;
    private String occupation;
    private String favoriteFood;

    //3 static variables
    public static String placeOfBirth;
    public static String favoriteColor;
    public static String eyesColor;
    public static String favoriteGame;

    //no arg constructor
    public UserRoxana()
    {

    }
    //all arg constructor
    public UserRoxana(String firstName,String secondName,String sex,int age,String occupation,String favoriteFood,String nationality)
    {
        this.firstName=firstName;
        this.secondName=secondName;
        this.sex=sex;
        this.age=age;
        this.occupation=occupation;
        this.favoriteFood=favoriteFood;
        this.nationality=nationality;
    }


    //2 new methods that makes use of the static variables
    public static void printEyesColor(String eyesColor)
    {
        System.out.println(eyesColor);
    }
    public static void printPlaceOfBirth(String placeOfBirth)
    {
        System.out.println(placeOfBirth);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public static String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public String getOccupation() {
        return occupation;
    }

    public static String getEyesColor() {
        return eyesColor;
    }

    public static String getFavoriteColor() {
        return favoriteColor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }
    //Add at least one method that uses local and instance variables (add some logic like printing to the console or manipulating the variables)

    public void printUser() {
        System.out.println("My first name is " + firstName);
        System.out.println("My second name is " + secondName);
        System.out.println("I am " + age + " years old");
        System.out.println("I am " + sex);
        System.out.println("I work as a " + occupation);
        System.out.println("My favorite food is " + favoriteFood);
        System.out.println("I am of nationality " + nationality);
    }
    public static String printFavoriteColor()
    {
        String myFavoriteColor="blue";
        return myFavoriteColor;
    }
    public static String printFavoriteGame()
    {
        String myFavoriteGame="Minecraft";
        return myFavoriteGame;
    }

}
