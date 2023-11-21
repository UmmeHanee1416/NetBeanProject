/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author B-20
 */
public class Dateprac {

    public static void methodObject(Employee e) {
        System.out.println("value employee: " + e.getAge() + " " + e.getId() + " " + e.getName());
    }

    public static void methodObject(Employee e, Employee c) {
        System.out.println("value employee: " + e.getAge() + " " + e.getId() + " " + e.getName());
    }

    public static void sameType(String a, String b, String c) {
        System.out.println(a + b + c);
    }

    public static void printobj(Employee e, Employee a, int c) {
        System.out.println("1st param: " + "\n\tName: " + e.getName() + "\n\tAge: " + e.getAge() + "\n\tID: " + e.getId());
        System.out.println("1st param: " + "Name: " + a.getName() + " Age: " + a.getAge() + " ID: " + a.getId());
        System.out.println(c++);
    }

    public static void main(String[] args) {
         String str1 = "tutorials", str2 = "point";
      // comparing str1 and str2
      int retval = str1.compareTo(str2);
      

        Employee emp = new Employee(567744);
        emp.setAge(30);
        emp.setName("ABC");
//        System.out.println("Age "+emp.getAge());
//        methodObject(emp);
//        sameType("Abul", "Kalam", "Azad");
        Employee emp1 = new Employee(134572, "AAA", 43);
//        System.out.println("ID "+emp1.getId());
//        System.out.println("Age "+emp1.getAge());
//        methodObject(emp, emp1);
        printobj(emp, emp1, 7);
        Employee[] objarr = new Employee[5];
        objarr[0] = emp;
        objarr[1] = emp1;
        System.out.println(objarr[0].getName());
        for (int i = 0; i < objarr.length; i++) {
//            //to handle error or error handler
            try {
                System.out.println(objarr[i].getName());
                
            } catch (Exception e) {
//                System.out.println(e.getMessage());
//                e.printStackTrace();
                System.out.println("aaa");
            }
        }
    }
}
//        System.out.println("la la land");

//        employee[] dyar = {};
//        employee emp2 = new employee();
//        emp2.setName("Abc");
//        emp2.setAge(35);
//        emp2.setId(49330012);
//        System.out.println("Name "+emp2.getName());
//        System.out.println("Age "+emp2.getAge());
//        System.out.println("ID "+emp2.getId());
//        java.util.Date date = new java.util.Date();
//        System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime() + " milliseconds");
//        System.out.println(date.toString());
//        System.out.println(date.getTime());
//        System.out.println((date.getTime()) / 1000);
//        System.out.println(((date.getTime()) / 1000) / 60);
//        System.out.println((((date.getTime()) / 1000) / 60) / 60);
//        System.out.println(((((date.getTime()) / 1000) / 60) / 60) / 24);
//        System.out.println((((((date.getTime()) / 1000) / 60) / 60) / 24) / 365);
//        DateFormat d = new SimpleDateFormat();
