package com.sessions.session18.challenge;

import java.util.Comparator;
import java.util.List;

public class StreamChallenge {

    public static void main(String[] args) {
        // 1. Filtering:
        // Write a program that uses a stream to filter out all the negative numbers from a list of integers.
        List<Integer> integerList = List.of(-1,2,-4,1,5,7,-11,20);
        List<Integer> positiveIntegerList = integerList.stream().filter(i -> i >= 0).toList();
        System.out.printf("Original integer list: %s%n" +
                        "Positive number list: %s%n" +
                        "=".repeat(20) + "%n",
                integerList, positiveIntegerList);


        // 2. Mapping:
        // Write a program that uses a stream to transform a list of strings to uppercase
        // and then sort them in reversed natural order.
        List<String> stringList = List.of("The", "quick", "brown", "fox", "jumps", "over", "a", "lazy", "dog");
        List<String> workedList = stringList.stream().map(s -> s.toUpperCase()).sorted(Comparator.reverseOrder()).toList();
        System.out.printf("Original list: %s%n" +
                        "Worked list [uppercase, reversed sorted]: %s%n" +
                        "=".repeat(20) + "%n",
                stringList, workedList);


        // 3. Reducing:
        // Write a program that uses a stream to calculate the product of all the elements in a list of integers.
        long lProduct = integerList.stream().reduce(1, (x, y) -> x * y).longValue();
        System.out.printf("Original integer list: %s%n" +
                        "List element's product: %d%n" +
                        "=".repeat(20) + "%n",
                integerList, lProduct);


        // 4. Sorting:
        // Write a program that uses a stream to sort a list of custom objects by a specific property,
        // such as age or name.
        class Person{
            private String firstName;
            private String lastName;
            private int age;

            public Person(String firstName, String lastName, int age) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
            }

            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            @Override
            public String toString() {
                return String.format("[%s %s, %d]", firstName, lastName, age);
            }
        }

        // Sorting is done as follows:
        // 1. by age
        // 2. by lastName
        // 3. by firstName
        List<Person> personList = List.of(new Person("Ion", "Iliescu", 666),
                        new Person("Ilie", "Nastase", 666),
                        new Person("Traian", "Basescu", 666),
                        new Person("Zen", "Zen", 1000),
                        new Person("Adrian", "Nastase", 666),
                        new Person("Viorica", "Dancila", 10))
                .stream().sorted((Person p1, Person p2) -> {
                    return (p1.getAge() == p2.getAge()) ?
                            ((p1.getLastName().compareToIgnoreCase(p2.getLastName()) == 0) ?
                                    p1.getFirstName().compareToIgnoreCase(p2.getFirstName()) :
                                    p1.getLastName().compareToIgnoreCase(p2.getLastName())) :
                            p1.getAge() - p2.getAge();
                }).toList();

        personList.forEach(e -> System.out.println(e));
        System.out.println("=".repeat(20));


        // 5. Bonus Challenge
        // Create a stream from a List of Strings that in the end reduces all the elements
        // to a single String made from the concatenation of all the Strings inside the original collection
        String sConcat = stringList.stream().reduce("", (s1, s2) -> s1.concat(s2));
        System.out.println(sConcat);
    }
}
