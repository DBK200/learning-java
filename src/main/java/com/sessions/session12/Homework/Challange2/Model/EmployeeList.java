package com.sessions.session12.Homework.Challange2.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    private List<Employee> employees;
    private int employeeCounter;

    public EmployeeList() {
        this.employees = new ArrayList<>();
        this.employeeCounter = 0;
    }

    public  EmployeeList(List<Employee> employees){
        this.employees=employees;
        this.employeeCounter=this.employees.size();

    }




    public boolean addEmployee(String firstName, String lastName, String email, String address,
                               LocalDate birthdate, LocalDate hiredDate, LocalDate contractExpirationDate, Role role) {

        int employeeId = 100000 + employeeCounter;
        employeeCounter++;
        if (contractExpirationDate != null) {
            return this.employees.add(new Employee(employeeId, firstName, lastName, email, address, birthdate, hiredDate, contractExpirationDate, role));
        }
        return this.employees.add(new Employee(employeeId, firstName, lastName, email, address, birthdate, hiredDate, role));

    }

    public Employee modifyEmployeeData(int employeeId,String firstName, String lastName,String email,String address,LocalDate contractExpirationDate,Role role){
        Employee e=findEmployeeById(employeeId);
        if(e==null){
            return null;
        }
        if(!firstName.isBlank()) e.setFirstName(firstName);
        if(!lastName.isBlank())  e.setLastName(lastName);
        if(!email.isBlank()) e.setEmail(email);
        if(!address.isBlank()) e.setAddress(address);
        if(contractExpirationDate!=null) e.setContractExpirationDate(contractExpirationDate);
        if(role!=null) e.setRole(role);

        return e;

    }


    public boolean removeEmployeeById(int id) {
        Employee e=findEmployeeById(id);
        if(e==null){
            return false;
        }
        return this.employees.remove(e);
    }

    public Employee findEmployeeById(int id) {
        if (employees == null) {
            return null;
        }
        for (Employee e : employees) {
            if (e.getEmployeeID() == id) {
                return e;
            }
        }

        return null;
    }

    public List<Employee> findEmployeesByLastName(String lastName) {
        if (employees == null) {
            return null;
        }

        List<Employee> foundEmployees = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getLastName().equals(lastName)) {
                foundEmployees.add(e);
            }
        }

        return foundEmployees;
    }

    public List<Employee> findEmployeesByLastAndFirstName(String lastName, String firstName) {
        if (employees == null) {
            return null;
        }

        List<Employee> foundEmployees = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getLastName().equals(lastName) && e.getFirstName().equals(firstName)) {
                foundEmployees.add(e);
            }
        }

        return foundEmployees;
    }


    public List<Employee> getEmployeesByRole(Role role) {
        if (employees == null) {
            return null;
        }

        List<Employee> foundEmployees = new ArrayList<>();
        for (Employee e : employees) {
            if (e.getRole().equals(role)) {
                foundEmployees.add(e);
            }
        }

        return foundEmployees;
    }


    public String toString() {
      String result="";

        for (Employee e : employees) {
            result += e.toString() + '\n';
        }

        return result;
    }

}
