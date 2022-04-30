package com.coding.fundamentals.datastructures.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeComparableComparatorDriver {

    public static void main(String[] args){
        Employee employeeComparable1 = new Employee(1, "aTestName", "aTesname", 34);
        Employee employeeComparable2 = new Employee(2, "aTestName", "aTesname", 30);
        Employee employeeComparable3 = new Employee(3, "aTestName", "aTesname", 31);
        Employee employeeComparable4 = new Employee(3, "aTestName", "aTesname", 25);

        List<Employee> comparableList = new ArrayList<>();
        comparableList.add(employeeComparable1);
        comparableList.add(employeeComparable4);
        comparableList.add(employeeComparable3);
        comparableList.add(employeeComparable2);

        System.out.println("1.- Unsorted List " + comparableList);

        Collections.sort(comparableList);

        System.out.println("2.- Sorted Comparator " + comparableList);

        Collections.sort(comparableList, new FirstNameSorter());

        System.out.println("3.- Sorted List by First Name Comparator sorter " + comparableList);

        Collections.sort(comparableList, new LastNameSorter());

        System.out.println("4.- Sorted List by Last Name Comparator sorter " + comparableList);

        Collections.sort(comparableList, new AgeSorter());

        System.out.println("5.- Sorted List by Age Comparator sorter " + comparableList);

        System.out.println("6.- Max List by Age Comparator sorter " + Collections.max(comparableList, new AgeSorter()));
        System.out.println("7.- Min List by Age Comparator sorter " + Collections.min(comparableList, new AgeSorter()));

        Collections.reverse(comparableList);

        System.out.println("8.- Reserved List by Age Comparator sorter " + comparableList);

    }
}

class Employee implements Comparable<Employee> {
    private int id = -1;
    private String firstName = null;
    private String lastName = null;
    private int age = -1;

    public Employee(){}
    public Employee(int id, String firstName, String lastName, int age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "EmployeeComparable{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}

class FirstNameSorter implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}

class LastNameSorter implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}

class AgeSorter implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}





