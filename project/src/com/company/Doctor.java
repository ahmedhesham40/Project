package com.company;

public class Doctor extends employee {
    protected String subject;
    protected double monthlySalary;
    protected double monthlyBonus;

    public Doctor(String firstName, String lastName, int age, String addres, int idNumber, String subject, double monthlyBonus, double monthlySalary) {
        super(firstName, lastName, age, addres, idNumber);
        this.subject = subject;
        if (monthlyBonus < 0)
            System.out.println("There is no negative monthly bonus");
        else
            this.monthlyBonus = monthlyBonus;
        if (monthlySalary < 0)
            System.out.println("There is no negative monthly salary");
        else
            this.monthlySalary = monthlySalary;
    }

    public String getSection() {
        return subject;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        if (monthlyBonus < 0)
            System.out.println("There is no negative monthly bonus");
        else
            this.monthlyBonus = monthlyBonus;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0)
            System.out.println("There is no negative monthly salary");
        else
            this.monthlySalary = monthlySalary;
    }

    @Override
    public double calcSalary() {
        return monthlySalary + monthlyBonus;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "subject='" + subject + '\'' +
                ", monthlySalary=" + monthlySalary +
                ", monthlyBonus=" + monthlyBonus +
                ", idNumber=" + idNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' + ", salary = " + calcSalary() +
                '}';
    }
}
