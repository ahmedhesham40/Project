package com.company;

public abstract class person implements ShowData
{
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String address;

    public person(String firstName,String lastName,int age,String address)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.address=address;
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
        if (age<0)
        {
            System.out.println("there is no negative age ");
        }
        else {
            this.age = age;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void PrintDetails() {
        System.out.println(toString());
    }
}
