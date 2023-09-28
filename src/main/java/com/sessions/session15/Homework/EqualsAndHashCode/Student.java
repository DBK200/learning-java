package com.sessions.session15.Homework.EqualsAndHashCode;

public class Student
{
    //Create a Student class with name, age, studentId, and email fields. Implement the equals()
    //    // method to check all fields except the studentId. Implement the hashCode() method to use
    //    // all fields except the studentId to calculate the hash code. Test that two instances with
    //    // the same name, age, and email return true for equals() and have the same hash code.
    public String name;
    public int age;
    public int idStudent;
    public String email;

    public Student(String name, int age, int idStudent, String email)
    {
        this.name = name;
        this.age = age;
        this.idStudent = idStudent;
        this.email = email;
    }

    // Metoda equals() compară două obiecte Student pentru egalitate pe baza tuturor câmpurilor, exceptând idStudent.
    @Override
    public boolean equals(Object object)
    {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Student student = (Student) object;

        // Verificăm dacă name, age și email sunt egale.
        return name.equals(student.name) && age == student.age && email.equals(student.email);
    }

    // Metoda hashCode() calculează codul hash pe baza tuturor câmpurilor, exceptând idStudent.
    @Override
    public int hashCode()
    {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    public static void main(String[] args)
    {
        // Creăm două instanțe de Student cu aceleași name, age și email, dar idStudent diferit.
        Student student1 = new Student("John", 20, 12345, "john@example.com");
        Student student2 = new Student("John", 20, 67890, "john@example.com");

        // Testăm metoda equals() pentru egalitate.
        boolean areEqual = student1.equals(student2);
        System.out.println("Are equal: " + areEqual);  // Va afișa "Are equal: true"

        // Testăm metoda hashCode() pentru coduri hash identice.
        System.out.println("HashCode for student1: " + student1.hashCode());
        System.out.println("HashCode for student2: " + student2.hashCode());  // Acestea vor fi identice
    }
}
