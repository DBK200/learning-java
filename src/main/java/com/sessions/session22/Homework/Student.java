package com.sessions.session22.Homework;

public class Student
{
    private String nume;
    private int varsta;
    private String email;
    private String adresa;

    // Constructor privat al clasei Student pentru inițializarea datelor
    private Student(String nume, int varsta, String email, String adresa)
    {
        this.nume = nume;
        this.varsta = varsta;
        this.email = email;
        this.adresa = adresa;
    }

    // Metode pentru a obține valorile membrilor privați

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresa() {
        return adresa;
    }

    // Clasa StudentBuilder pentru construirea obiectelor Student

    public static class StudentBuilder
    {
        // Variabilele private pentru datele studentului, acestea pot fi modificate în timpul construirii

        private String nume;
        private int varsta;
        private String email;
        private String adresa;

        // Metodă statică pentru a crea o instanță a StudentBuilder

        public static StudentBuilder studentBuilder()
        {
            return new StudentBuilder();
        }

        // Metode pentru a seta valorile membrilor StudentBuilder

        public StudentBuilder withName(String nume) {
            this.nume = nume;
            return this;
        }

        public StudentBuilder withAge(int varsta) {
            this.varsta = varsta;
            return this;
        }

        public StudentBuilder withAdresa(String adresa) {
            this.adresa = adresa;
            return this;
        }

        public StudentBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        // Metodă pentru a construi un obiect Student folosind valorile setate în StudentBuilder

        public Student build()
        {
            return new Student(nume, varsta, email, adresa);
        }
    }

    // Metoda pentru exemplificarea construirii unui obiect Student

    public static void main(String[] args)
    {
        Student student = Student.StudentBuilder.studentBuilder()
                .withName("NumeleTau")
                .withAge(20)
                .withEmail("email@example.com")
                .withAdresa("Adresa ta")
                .build();
    }
}
