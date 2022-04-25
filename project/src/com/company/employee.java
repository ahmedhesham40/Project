package com.company;

public abstract class employee extends person
{
    protected int idNumber;
    public employee(String firstName,String lastName,int age,String addres,int idNumber)
    {
        super(firstName,lastName,age,addres);
        this.idNumber=idNumber;
    }

    public abstract double calcSalary();

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "employee{" +
                "idNumber=" + idNumber +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
