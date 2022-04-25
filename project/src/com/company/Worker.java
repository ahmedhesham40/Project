package com.company;

public class Worker extends employee
{
    protected double dailySalary;
    protected int numOfDays;

    public Worker(String firstName, String lastName, int age, String address, int idNumber, double dailySalary, int numOfDays) {
        super(firstName, lastName, age, address, idNumber);
        this.dailySalary = dailySalary;
        this.numOfDays = numOfDays;
    }
    @Override
    public double calcSalary(){
        return dailySalary * numOfDays;
    }
    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        if(dailySalary < 0)
            System.out.println("There is no negative daily salary");
        else
            this.dailySalary = dailySalary;
    }

    public int getNumOfDays() {
        return numOfDays;
    }

    public void setNumOfDays(int numOfDays) {
        if(numOfDays < 0)
            System.out.println("There is no negative number of days");
        else
            this.numOfDays = numOfDays;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "dailySalary=" + dailySalary +
                ", numOfDays=" + numOfDays +
                ", idNumber=" + idNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +", salary = " + calcSalary() +
                '}';
    }
}
