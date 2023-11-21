/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp;

import java.util.Scanner;

/**
 *
 * @author B-20
 */
public class Student {

    public static Integer id = 1;
    public static String name = "Abul Kalam";
    public static String address = "Dhaka";

    public static void func() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
    }

    public static void param(Integer num) {
        System.out.println(num);
    }

    public static void param1(String str) {
        System.out.println(str);
    }

    public static void param2(String add) {
        System.out.println(add);
    }

    public static void inpparam(Integer id, String name, String addresss) {
        Integer i;
        i = id;
        String n;
        n = name;
        String a;
        a = addresss;
        System.out.println("ID: " + i + "\nName: " + n + "\nAddress: " + a);
    }

    public static void arr() {
        int[] aaa = new int[10];
        aaa[0] = 00;
        aaa[1] = 10;
        aaa[2] = 20;
        aaa[6] = 60;
        aaa[9] = 100;
        for (int i = 0; i < aaa.length; i++) {
            int j = aaa[i];
            System.out.println("Array 1--" + j);
        }
    }

    ;
    
    public static void arr1() {
        int[] bbb = {2, 4, 70, 00, 60};
        for (int i = 0; i < bbb.length; i++) {
            int j = bbb[i];
            System.out.println("Array 2--" + j);

        }
    }

    public static int arr2(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 != 0) {
                System.out.println("Array odd--" + ar[i]);
            };
        }
        return ar.length;
    }

    public static void arr3(String[] sh) {
//        for (int i = 0; i < sh.length; i++) {
//            if (sh[i] == "Ruma") {
//                System.out.println("found " + sh[i]);
//            }
//            else {
//            System.out.println("did not need " + sh[i]);
//            };

//            if (sh[i].equals("Ruma")) {
//                System.out.println("found " + sh[i]);
//            }
//        }
        for (String string : sh) {
            if (string.equals("Ruma")) {
                System.out.println("found " + string);

            };
        };
    }

    public static void arr4(String[] xyz, String name) {
        for (String abc : xyz) {
            if (abc.equals(name)) {
                System.out.println("found " + abc);

            }
        }
    }

    public static void main(String[] args) {
//        func();
//        param(2);
//        param1("basar");
//        param2("Khulna");
//        Scanner ina = new Scanner(System.in);
//        Integer id = ina.nextInt();
//        String name = ina.next();
//        String addresss = ina.next();
//        inpparam(id, name, addresss);
//        arr();
//        arr1();
//        int[] aa = {1, 2, 3, 45, 88, 55, 91};
//        student.arr2(aa);
//
//        String[] shuvo = new String[]{"Abir", "Tanvir", "Maria", "Ruma", "Elma", "Polin"};
//        arr3(shuvo);
//        arr4(shuvo, "Abir");

        Student adv = new Student();
//        adv.addval();
//        double total = 0;
//        double total = array[0];
//        for (int i = 0; i < adv.array.length; i++) {
//            total += adv.array[i];
//        }
//        System.out.println("total--"+total);

//        double min = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }
//        System.out.println("\nmin --" + min);
//        double total = 0;
//        for (int i = 0; i < array1.length; i++) {
//            total += array1[i];
//        }
//        System.out.println(total);
//        double ma = minmax(array, "max");
//        double mi = minmax(array, "min");
//
//        System.out.println(ma + " " + mi);
//        System.out.println(secmax(array1));
        System.out.println(findseclar(array2));
    }
    static int[] array2 = {100,40,3,89,50,22,55};
    
    

    public static double secmax(double[] mylarge) {
        double large = mylarge[0]; //2 //0,5 //1,
        double large1 = mylarge[1]; //5

        for (int i = 1; i < mylarge.length; i++) {
            if (mylarge[i] > large && mylarge[i] < large1) {
                large = mylarge[i];
            }
        }
        return large;
//        for(int i = 0; i < mylarge.length; i++){
//        if(large1 ){}
//        }
    }

    public static double findseclar(int[] arr) {
        if (arr.length < 2) {
            System.out.println("array shoul be two elements.");
            return -1;
        }
        int firstlarge = Integer.MIN_VALUE;
        int seclarge = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstlarge) {
                seclarge = firstlarge;
                firstlarge = num;
            } else if (num > seclarge && num != firstlarge) {
                seclarge = num;
            }
        }
        return seclarge;
    }
    static double[] array = new double[5];
    static double[] array1 = {2, 5, 7, 1, 8, 6, 9};

    public void addval() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();

        }
        for (double i : array) {
//            System.out.print(i + "/");
        }
    }

    public static double minmax(double[] mylist, String val) {
        double output = mylist[0];
        if (val.toUpperCase().equals("MIN")) {
            for (int i = 1; i < mylist.length; i++) {
                if (mylist[i] < output) {
                    output = mylist[i];
                }

            }

            return output;
        } else if (val.toUpperCase().equals("MAX")) {

            for (int i = 1; i < mylist.length; i++) {
                if (mylist[i] > output) {
                    output = mylist[i];
                }

            }
            return output;
        }
        return 0.0;
    }

//        Scanner inp = new Scanner(System.in);
//        int ar1. = inp.nextInt();
}
