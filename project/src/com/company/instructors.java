package com.company;

public class instructors extends employee
{
    protected double hourlySalary;
    protected int numOfHours;
    protected String section;
    public instructors(String firstName, String lastName, int age, String addres, int idNumber, double hourlySalary, int numOfHours,String section) {
        super(firstName, lastName, age, addres, idNumber);
        this.hourlySalary = hourlySalary;
        this.numOfHours = numOfHours;
        this.section = section;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(double hourlySalary) {
        if(hourlySalary < 0)
            System.out.println("There is no negative hourly salary");
        else
            this.hourlySalary = hourlySalary;
    }

    public int getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(int numOfHours) {
        if(numOfHours < 0)
            System.out.println("There is no negative number of hours");
        else
            this.numOfHours = numOfHours;
    }
    @Override
    public double calcSalary(){
        return hourlySalary * numOfHours;
    }

    @Override
    public String toString() {
        return "instructors{" +
                "idNumber=" + idNumber +
                ", hourlySalary=" + hourlySalary +
                ", numOfHours=" + numOfHours +
                ", section='" + section + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +", salary = " + calcSalary() +
                '}';
    }
}
