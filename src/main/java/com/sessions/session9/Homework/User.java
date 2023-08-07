package com.sessions.session9.Homework;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {


    public static final int REQUIRED_AGE = 14;


    private String firstName;
    private String lastName;

    private String email;
    private String password;

    private LocalDate birthday;


    private boolean isActive;

    private LocalDateTime accountCreation;




    public User() {
        accountCreation=LocalDateTime.now();
        this.isActive=false;


    }

    public User(String firstName, String lastName, String email, String password, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.birthday = birthday;

        this.isActive=false;
        this.accountCreation=LocalDateTime.now();

    }

    //------ setters
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    //---------- getters
    public boolean getIsActive(){
        return isActive;
    }


    public static void getAccountCreationInformationBeforeAccountCreation(){
        System.out.println("Anyone can create an accout.A user is eligible only if he is above  "+ REQUIRED_AGE+" years old.");
    }

    //-------- methods

    public void getAccountCreationInformation(){
       if(checkAllFieldsFilled()){
           System.out.println("All required field are filled in.");
           if(getIsActive()){
               System.out.println("Your account has been activated.");
           }else{
               System.out.println("The account has not been yet activated.");
               if(checkRequiredAge(this.birthday)){
                   System.out.println("Looks like you meet all criteria for the account. You account will be soon activated.");
               }else{
                   System.out.println("Your account is not eligible for activation due to age requirement");

               }
           }
       }else{
           System.out.println("Your account is missing some required information");
           System.out.println("Please fill in the following required fields: ");
           if(this.firstName==null) System.out.println("First name");
           if(this.lastName==null) System.out.println("Last name");
           if(this.birthday==null) System.out.println("Birthday");
           if(this.email==null) System.out.println("Email");
           if(this.password==null) System.out.println("Password");

       }

    }

    public void verifyAndActivate(){
        if(!checkActivationTimeInterval()){
            System.out.println("Verification only possible within 24 hours");
        }else{
            if(
                    checkAllFieldsFilled()
                    && checkRequiredAge(this.birthday)){
                this.isActive=true;
                System.out.println("Account activated");
            }else{
                System.out.println("The account is missing some information. Try to activate later");
            }
        }
    }


  private boolean checkActivationTimeInterval(){
      if(this.accountCreation.plusHours(24).isBefore(LocalDateTime.now()))return false;
      return true;
  }

  private boolean checkAllFieldsFilled(){
        if( this.firstName!=null
                && this.lastName!=null
                && this.email !=null
                && this.password !=null
                && this.birthday!= null)return true;
        return false;
  }


    private boolean checkRequiredAge(LocalDate birthday) {
        LocalDate date = birthday.plusYears(REQUIRED_AGE);

      return date.isBefore(LocalDate.now());
    }


}
