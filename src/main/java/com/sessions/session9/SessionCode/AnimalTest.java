package com.sessions.session9.SessionCode;

public class AnimalTest {

    public static void main(String[] args){
        Animal animal=new Animal();
        animal.setName("Cat");
        animal.setAge(2);


        Animal dog=new Animal("dog",6);
        System.out.println(dog.name);
        System.out.println(dog.age);

        Animal dog2=new Animal("canin",3,"Nala");

    }

}
