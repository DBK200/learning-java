package com.sessions.patternsPractice.creational.builder;

public class Test {
    public static void main(String[] args) {
        User user = new User.UserBuilder()

                .build();

//        createNewObject(userBuilder);
    }


    private static void createNewObject(User.UserBuilder userbuilder){
      //...
       userbuilder.build();
        //...

    }

}
