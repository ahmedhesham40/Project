package com.company;

public class technicians extends employee
{
    protected int lab;
    protected double weeklySalary;
    protected int numOfWeeks;
    public technicians (String firstName,String lastName,int age,String address,int idNumber,int lab,double weeklySalary,int numOfWeeks)
    {
        super(firstName,lastName,age,address,idNumber);
        if(weeklySalary < 0){
            System.out.println("There is no negative weekly salary");
        }
        else
            this.weeklySalary = weeklySalary;
        if(numOfWeeks < 0){
            System.out.println("There is no negative number of weeks");
        }
        else
            this.numOfWeeks = numOfWeeks;
        this.lab=lab;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if(weeklySalary < 0){
            System.out.println("There is no negative weekly salary");
        }
        else
            this.weeklySalary = weeklySalary;
    }

    public double getNumOfWeeks() {
        return numOfWeeks;
    }

    public void setNumOfWeeks(int numOfWeeks) {
        if(numOfWeeks < 0){
            System.out.println("There is no negative number of weeks");
        }
        else
            this.numOfWeeks = numOfWeeks;
    }

    public int getLab() {
        return lab;
    }

    public void setLab(int lab) {
        this.lab = lab;
    }
    @Override
    public double calcSalary(){
        return weeklySalary * numOfWeeks;
    }

    @Override
    public String toString() {
        return "technicians{" +
                "idNumber=" + idNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", lab=" + lab +
                ", weeklySalary=" + weeklySalary +
                ", numOfWeeks=" + numOfWeeks +", salary = " + calcSalary() +
                '}';
    }
}
