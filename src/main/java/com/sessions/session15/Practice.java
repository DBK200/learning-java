package com.sessions.session15;

public class Practice {

    public static void main(String[] args) {
        Person person1=new Person(1,"Alex","RO",23);
        Person person2=new Person(2,"Daniel","UK",38);
        Person person3=new Person(2,"Daniel","UK",38);

//        System.out.println(person1.equals(person2));
//        System.out.println(person1.equals("eghjhsdg"));
//        System.out.println(person1.equals(person1));

        //hashcode
        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.equals(person2));
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());


    }

}
class Person{

    private String name;
    private String country;
    private int age;

    private int id;


    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Person(int id,String name, String country, int age) {
        this.id=id;
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public boolean equals(Object object){

        if (object==null){
            return false;
        }

        if (object==this){
            return true;
        }

        if(!(object instanceof Person)){
            return false;
        }

        Person person=(Person) object;
        return id== person.id&&name.equals(person.name)&&country.equals(person.country)&&age== person.age;
    }
    //when equals returns true ->hashCode must be the same

    public int hashCode(){
        return id;
    }


}