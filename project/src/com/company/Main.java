package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> st = new ArrayList();
        ArrayList<Doctor> doc = new ArrayList();
        ArrayList<technicians> tech = new ArrayList();
        ArrayList<Worker> wk = new ArrayList();
        ArrayList<instructors> inst = new ArrayList();
        ArrayList<adminstrators> admin = new ArrayList();
        System.out.println("Welcome...");
        System.out.println("----------------------------------------");
        System.out.println("1- Add a student ");
        System.out.println("--------------------------");
        System.out.println("2- Add a Doctor ");
        System.out.println("--------------------------");
        System.out.println("3- Add a technician ");
        System.out.println("--------------------------");
        System.out.println("4- Add a worker ");
        System.out.println("--------------------------");
        System.out.println("5- Add an instructor ");
        System.out.println("--------------------------");
        System.out.println("6- Add an administrator ");
        System.out.println("--------------------------");
        System.out.println("7- search for a student");
        System.out.println("--------------------------");
        System.out.println("8- search for a doctor");
        System.out.println("--------------------------");
        System.out.println("9- search for a technician");
        System.out.println("--------------------------");
        System.out.println("10- search for a worker");
        System.out.println("--------------------------");
        System.out.println("11- search for an instructor");
        System.out.println("--------------------------");
        System.out.println("12- search for an administrator");
        System.out.println("--------------------------");
        System.out.println("13- display a student");
        System.out.println("--------------------------");
        System.out.println("14- display a doctor");
        System.out.println("--------------------------");
        System.out.println("15- display a technician");
        System.out.println("--------------------------");
        System.out.println("16- display a worker");
        System.out.println("--------------------------");
        System.out.println("17- display an instructor");
        System.out.println("--------------------------");
        System.out.println("18- display an administrator");
        System.out.println("--------------------------");
        System.out.println("19- remove a student");
        System.out.println("--------------------------");
        System.out.println("20- remove a doctor");
        System.out.println("--------------------------");
        System.out.println("21- remove a technician");
        System.out.println("--------------------------");
        System.out.println("22- remove a worker");
        System.out.println("--------------------------");
        System.out.println("23- remove an instructor");
        System.out.println("--------------------------");
        System.out.println("24- remove an administrator");
        System.out.println("--------------------------");
        System.out.println("25- Exit");
        System.out.println("----------------------------------------");
        while (true) {

            System.out.println("Enter your number");
            int x = sc.nextInt();
            if (x == 1) {
                try {
                    System.out.println("enter student's first name");
                    String fn = sc.next();
                    System.out.println("enter student's last name");
                    String ls = sc.next();
                    System.out.println("enter student's address");
                    String add = sc.next();
                    System.out.println("enter student's age");
                    int age = sc.nextInt();
                    System.out.println("enter student's grade");
                    int grade = sc.nextInt();
                    System.out.println("enter student's gpa");
                    float gpa = sc.nextFloat();
                    student st1 = new student(fn, ls, age, add, grade, gpa);
                    st.add(st1);
                } catch (Exception e) {

                    System.out.println("Wrong Data");
                    sc.next();
                }
            } else if (x == 2) {
                try {
                    System.out.println("enter doctor's first name");
                    String fn = sc.next();
                    System.out.println("enter doctor's last name");
                    String ls = sc.next();
                    System.out.println("enter doctor's address");
                    String add = sc.next();
                    System.out.println("enter doctor's age");
                    int age = sc.nextInt();
                    System.out.println("enter doctor's id number");
                    int idn = sc.nextInt();
                    System.out.println("enter doctor's subject");
                    String sub = sc.next();
                    System.out.println("enter doctor's monthly salary");
                    double msl = sc.nextDouble();
                    System.out.println("enter doctor's monthly bonus");
                    double mb = sc.nextDouble();
                    Doctor D1 = new Doctor(fn, ls, age, add, idn, sub, msl, mb);
                    doc.add(D1);
                }
                catch (Exception e) {

                    System.out.println("Wrong Data");
                    sc.next();
                }
            } else if (x == 3) {
                try {
                    System.out.println("enter technician's first name");
                    String fn = sc.next();
                    System.out.println("enter technician's last name");
                    String ls = sc.next();
                    System.out.println("enter technician's age");
                    int age = sc.nextInt();
                    System.out.println("enter technician's address");
                    String add = sc.next();
                    System.out.println("enter technician's id number");
                    int idn = sc.nextInt();
                    System.out.println("enter technician's lab");
                    int lab = sc.nextInt();
                    System.out.println("enter technician's weekly salary");
                    double ws = sc.nextDouble();
                    System.out.println("enter technician's number of weeks");
                    int nw = sc.nextInt();
                    technicians t1 = new technicians(fn, ls, age, add, idn, lab, ws, nw);
                    tech.add(t1);
                }catch (Exception e) {

                    System.out.println("Wrong Data");
                    sc.next();
                }
            } else if (x == 4) {
                try {
                    System.out.println("enter worker's first name");
                    String fn = sc.next();
                    System.out.println("enter worker's last name");
                    String ls = sc.next();
                    System.out.println("enter worker's age");
                    int age = sc.nextInt();
                    System.out.println("enter worker's address");
                    String add = sc.next();
                    System.out.println("enter worker's id number");
                    int idn = sc.nextInt();
                    System.out.println("enter worker's daily salary");
                    int ds = sc.nextInt();
                    System.out.println("enter worker's number of day");
                    int nd = sc.nextInt();
                    Worker w1 = new Worker(fn, ls, age, add, idn, ds, nd);
                    wk.add(w1);
                }catch (Exception e) {

                    System.out.println("Wrong Data");
                    sc.next();
                }
            } else if (x == 5) {
                try {
                    System.out.println("enter instructor's first name");
                    String fn = sc.next();
                    System.out.println("enter instructor's last name");
                    String ls = sc.next();
                    System.out.println("enter instructor's age");
                    int age = sc.nextInt();
                    System.out.println("enter instructor's addres");
                    String add = sc.next();
                    System.out.println("enter instructor's id number");
                    int idn = sc.nextInt();
                    System.out.println("enter instructor's hour salary");
                    int hs = sc.nextInt();
                    System.out.println("enter instructor's number of hour");
                    int nh = sc.nextInt();
                    System.out.println("enter instructor's section");
                    String sec = sc.next();
                    instructors ins1 = new instructors(fn, ls, age, add, idn, hs, nh, sec);
                    inst.add(ins1);
                }catch (Exception e) {

                    System.out.println("Wrong Data");
                    sc.next();
                }
            } else if (x == 6) {
                try {
                    System.out.println("enter administrator's first name");
                    String fn = sc.next();
                    System.out.println("enter administrator's last name");
                    String ls = sc.next();
                    System.out.println("enter administrator's age");
                    int age = sc.nextInt();
                    System.out.println("enter administrator's address");
                    String add = sc.next();
                    System.out.println("enter administrator's id number");
                    int idn = sc.nextInt();
                    System.out.println("enter administrator's yearly salary");
                    double ys = sc.nextDouble();
                    System.out.println("enter administrator's yearly bonus");
                    double yb = sc.nextDouble();
                    adminstrators admn1 = new adminstrators(fn, ls, age, add, idn, ys, yb);
                    admin.add(admn1);
                }catch (Exception e) {

                    System.out.println("Wrong Data");
                    sc.next();
                }
            } else if (x == 7) {
                System.out.println("Enter student's first name");
                String fName = sc.next();
                System.out.println("Enter student's last name");
                String lName = sc.next();
                boolean exist = false;
                for (student i : st) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        break;
                    }
                }
                if (exist)
                    System.out.println("Found");
                else
                    System.out.println("Not found");
            } else if (x == 8) {
                System.out.println("Enter doctor's first name");
                String fName = sc.next();
                System.out.println("Enter doctor's last name");
                String lName = sc.next();
                boolean exist = false;
                for (Doctor i : doc) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        break;
                    }
                }
                if (exist)
                    System.out.println("Found");
                else
                    System.out.println("Not found");
            } else if (x == 9) {
                System.out.println("Enter technician's first name");
                String fName = sc.next();
                System.out.println("Enter technician's last name");
                String lName = sc.next();
                boolean exist = false;
                for (technicians i : tech) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        break;
                    }
                }
                if (exist)
                    System.out.println("Found");
                else
                    System.out.println("Not found");
            } else if (x == 10) {
                System.out.println("Enter worker's first name");
                String fName = sc.next();
                System.out.println("Enter worker's last name");
                String lName = sc.next();
                boolean exist = false;
                for (Worker i : wk) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        break;
                    }
                }
                if (exist)
                    System.out.println("Found");
                else
                    System.out.println("Not found");
            } else if (x == 11) {
                System.out.println("Enter instructor's first name");
                String fName = sc.next();
                System.out.println("Enter instructor's last name");
                String lName = sc.next();
                boolean exist = false;
                for (instructors i : inst) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        break;
                    }
                }
                if (exist)
                    System.out.println("Found");
                else
                    System.out.println("Not found");
            } else if (x == 12) {
                System.out.println("Enter administrator's first name");
                String fName = sc.next();
                System.out.println("Enter administrator's last name");
                String lName = sc.next();
                boolean exist = false;
                for (adminstrators i : admin) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        break;
                    }
                }
                if (exist)
                    System.out.println("Found");
                else
                    System.out.println("Not found");
            } else if (x == 13) {
                System.out.println("Enter student's first name");
                String fName = sc.next();
                System.out.println("Enter student's last name");
                String lName = sc.next();
                boolean exist = false;
                for (student i : st) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        i.PrintDetails();
                        break;
                    }
                }
                if (!exist)
                    System.out.println("This student doesn't exist");
            } else if (x == 14) {
                System.out.println("Enter doctor's first name");
                String fName = sc.next();
                System.out.println("Enter doctor's last name");
                String lName = sc.next();
                boolean exist = false;
                for (Doctor i : doc) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        i.PrintDetails();
                        break;
                    }
                }
                if (!exist)
                    System.out.println("This doctor doesn't exist");
            } else if (x == 15) {
                System.out.println("Enter technician's first name");
                String fName = sc.next();
                System.out.println("Enter technician's last name");
                String lName = sc.next();
                boolean exist = false;
                for (technicians i : tech) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        i.PrintDetails();
                        break;
                    }
                }
                if (!exist)
                    System.out.println("This technician doesn't exist");
            } else if (x == 16) {
                System.out.println("Enter worker's first name");
                String fName = sc.next();
                System.out.println("Enter worker's last name");
                String lName = sc.next();
                boolean exist = false;
                for (Worker i : wk) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        i.PrintDetails();
                        break;
                    }
                }
                if (!exist)
                    System.out.println("This worker doesn't exist");
            } else if (x == 17) {
                System.out.println("Enter instructor's first name");
                String fName = sc.next();
                System.out.println("Enter instructor's last name");
                String lName = sc.next();
                boolean exist = false;
                for (instructors i : inst) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        i.PrintDetails();
                        break;
                    }
                }
                if (!exist)
                    System.out.println("This instructor doesn't exist");
            } else if (x == 18) {
                System.out.println("Enter administrator's first name");
                String fName = sc.next();
                System.out.println("Enter administrator's last name");
                String lName = sc.next();
                boolean exist = false;
                for (adminstrators i : admin) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        i.PrintDetails();
                        break;
                    }
                }
                if (!exist)
                    System.out.println("This administrator doesn't exist");
            } else if (x == 19) {
                System.out.println("Enter student's first name");
                String fName = sc.next();
                System.out.println("Enter student's last name");
                String lName = sc.next();
                boolean exist = false;
                for (student i : st) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        st.remove(i);
                        System.out.println("The removal process is done successfully");
                        break;
                    }
                }
                if (!exist)
                    System.out.println("This student doesn't exist");
            } else if (x == 20) {
                System.out.println("Enter doctor's first name");
                String fName = sc.next();
                System.out.println("Enter doctor's last name");
                String lName = sc.next();
                boolean exist = false;
                for (Doctor i : doc) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        doc.remove(i);
                        System.out.println("The removal process is done successfully");
                        break;
                    }
                }
                if (!exist)
                    System.out.println("This doctor doesn't exist");
            } else if (x == 21) {
                System.out.println("Enter technician's first name");
                String fName = sc.next();
                System.out.println("Enter technician's last name");
                String lName = sc.next();
                boolean exist = false;
                for (technicians i : tech) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        tech.remove(i);
                        System.out.println("The removal process is done successfully");
                        break;
                    }
                }
                if (!exist)
                    System.out.println("This technician doesn't exist");
            } else if (x == 22) {
                System.out.println("Enter worker's first name");
                String fName = sc.next();
                System.out.println("Enter worker's last name");
                String lName = sc.next();
                boolean exist = false;
                for (Worker i : wk) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        wk.remove(i);
                        System.out.println("The removal process is done successfully");
                        break;
                    }
                }
                if (!exist)
                    System.out.println("This worker doesn't exist");
            } else if (x == 23) {
                System.out.println("Enter instructor's first name");
                String fName = sc.next();
                System.out.println("Enter instructor's last name");
                String lName = sc.next();
                boolean exist = false;
                for (instructors i : inst) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        inst.remove(i);
                        System.out.println("The removal process is done successfully");
                        break;
                    }
                }
                if (!exist)
                    System.out.println("This instructor doesn't exist");
            } else if (x == 24) {
                System.out.println("Enter administrator's first name");
                String fName = sc.next();
                System.out.println("Enter administrator's last name");
                String lName = sc.next();
                boolean exist = false;
                for (adminstrators i : admin) {
                    if (i.getFirstName().equals(fName) && i.getLastName().equals(lName)) {
                        exist = true;
                        admin.remove(i);
                        System.out.println("The removal process is done successfully");
                        break;
                    }
                }
                if (!exist)
                    System.out.println("This administrator doesn't exist");
            } else
                break;
        }
    }
}
