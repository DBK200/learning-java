package com.sessions.session15;

public class PersonROX
{
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

    PersonROX(int id, String name, String country, int age) {
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

        if (!(object instanceof PersonROX)) {
            return false;
        }

        PersonROX person = (PersonROX) object;
        return id == person.id && name.equals(person.name) &&
                country.equals(person.country) && age == person.age;
    }
    // when equals returns true -> hashCode must be the same
    public int hashCode() {
        return id + 10;
    }


}
