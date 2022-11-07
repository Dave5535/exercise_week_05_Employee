package se.Lexicon;

import java.time.LocalDate;
import java.util.Arrays;

public abstract class Employee {
    private static int sequencer = 0;

    //fields
    private final int id;
    private String name;
    private double salary;
    private LocalDate dateHired;

    //constructor
    public Employee(String name) {
        this.id = (++sequencer);
        setName(name);
        setSalary(25000);
        setDateHired(LocalDate.now());
    }



    //methods

    public abstract void calculateSalary();


    public String getInformation(){
        return "id: " + id + " Name: " + name + " salary: " + salary + " date of Hired: " + dateHired;
    }


    //getters & setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) throw new IllegalArgumentException("FirstName was null.");
        this.name = name;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }
}
