package com.company;

public class student extends person
{
    protected int grade;
    protected float gpa;
    public student(String firstName,String lastName,int age,String address,int grade,float gpa)
    {
        super(firstName,lastName,age,address);
        this.grade=grade;
        this.gpa=gpa;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", grade=" + grade +
                ", gpa=" + gpa +
                '}';
    }
}
