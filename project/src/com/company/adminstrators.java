package com.company;

public class adminstrators extends employee
{
    protected double yearlySalary;
    protected double yearlyBonus;

    public adminstrators(String firstName, String lastName, int age, String addres, int idNumber, double yearlySalary, double yearlyBonus) {
        super(firstName, lastName, age, addres, idNumber);
        this.yearlySalary = yearlySalary;
        this.yearlyBonus = yearlyBonus;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        if(yearlySalary < 0)
            System.out.println("There is no negative salary");
        else
            this.yearlySalary = yearlySalary;
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        if(yearlyBonus < 0)
            System.out.println("There is no negative bonus");
        else
            this.yearlyBonus = yearlyBonus;
    }
    @Override
    public double calcSalary(){
        return yearlySalary + yearlyBonus;
    }

    @Override
    public String toString() {
        return "administrators{" +
                "yearlySalary=" + yearlySalary +
                ", yearlyBonus=" + yearlyBonus +
                ", idNumber=" + idNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +", salary = " + calcSalary() +
                '}';
    }
}
