package com.sessions.session15;

public class Practice {

    public static void main(String[] args) {

        PersonS15 person1 = new PersonS15(1, "Alex", "RO", 23);
        PersonS15 person2 = new PersonS15(2, "Alex", "DE", 23);
        PersonS15 person3 = new PersonS15(2, "Alex", "RO", 23);
        // person1 = person2 -> person2 = person3 => person1=person3
//        System.out.println(person1.equals(person2));
//        System.out.println(person1.equals("SomeString"));
//        System.out.println(person1.equals(person1));
        //hashcode
        System.out.println(person1.equals(person2)); // returns false
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

        System.out.println(person2.equals(person3)); // returns true
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
    }
}

class PersonS15 {
    private String name;
    private String country;
    private int age;

    private int id;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getAge() {
        return age;
    }

    PersonS15(int id, String name, String country, int age) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }

        if (object == this) {
            return true;
        }

        if (!(object instanceof Person)) {
            return false;
        }

        PersonS15 person = (PersonS15) object;
        return id == person.id && name.equals(person.name) &&
                country.equals(person.country) && age == person.age;
    }
    // when equals returns true -> hashCode must be the same
    public int hashCode() {
        return id + 10;
    }
}