/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author B-20
 */
public class Arrmult {

//    String[][] classes = {{"A", "B"}, {"C", "D"}, {"E"}};
//
//    public static int minval(int[][] minn) {
//        int mini = minn[5][0];
//        for (int i = 1; i < minn[5].length; i++) {
//            if (minn[5][i] < mini) {
//                mini = minn[5][i];
//            }
//        }
//        return mini;
//    }
//
//    ;
//    public static void fib(int a) {
//        int f = 0;
//        for (int i = 1; i < a + 1; i++) {
//            f = f + i;
//            
//        }
//    }
//    public static int prime(int p) {
//        int pr = p;
//        for (int i = 2; i <= pr; i++) {
//            if (pr % i == 0) {
//                System.out.println("not prime");
//
//            } else {
//                if (pr % i != 0) {
//                    System.out.println(" prime");
//                    break;
//                }
//            }
//        }
//        return pr;
//    }
//    public static int fact(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        int f = 1;
//        for (int i = 1; i <= n; i++) {
//            f *= i;
//        }
//        return f;
//    }
//    int x;
//    double y;
//
//    void add(int a, int b) {
//        x = a + b;
//    }
//
//    void add(double c, double d) {
//        y = c + d;
//    }
//
//    void Overload() {
//        this.x = 0;
//        this.y = 0;
//    }
//    public static void da(int l) {
//        Scanner arr = new Scanner(System.in);
//        l = arr.nextInt();
//        int array[] = new int[l];
//        for (int i = 0; i < l; i++) {
//            System.out.println("array is " + i);
//            array[i] = arr.nextInt();
//        }
//        System.out.println(Arrays.toString(array));
//    }
//    public static int p1(int a) {
//        for (int i = 2; i <= a; i++) {
//            if (i == a) {
//                System.out.println(a + " is a prime number");
//            } else {
//                if (a % i == 0) {
//                    System.out.println(a + " is not a prime number");
//                    break;
//                }
//            }
//        }
//        return 0;
//    }
    public static int arrsum(int[] arr) {
        int array[] = arr;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        return 0;
    }

    public static int _sort(Integer[] arr) {
//        int arr1[] = arr;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return 0;
    }
    

    public static int dessort(Integer[] arr2) {
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr2));
        return 0;
    }

    public static int pr(int n) {

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("not prime");

            }
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i != 0) {
                System.out.println("prime");
            }
            break;
        }
        return 0;
    }

    public static void consum() {
        Scanner num = new Scanner(System.in);
        int sum = 0;
        int a = num.nextInt();
        for (int i = 0;; i++) {
            if (a != 0) {
                sum = sum + a;
            }
        }
    }

    public static int prime(int n) {
        if (n < 2) {
            System.out.println("enter a number more than 2");
        } else {
            for (int i = 2; i <= n; i++) {
                if (n == i) {
                    System.out.println("prime");
                } else {
                    if (n % i == 0) {
                        System.out.println("not");
                        break;
                    }
                }
            }
        }
        return 0;
    }

    public static int sort(Integer[] a) {
//        int[] ar = a;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
        return 0;
    }

    public static int condsum() {
        Scanner num = new Scanner(System.in);
        int sum = 0;
        for (int i = 0;; i++) {
            int nm = num.nextInt();
            if (nm != 0) {
                sum += nm;
            } else {
                break;
            }

        }
        System.out.println(sum);
        return sum;
    }

    public static void multarr(Integer[][] arr) {
        for (Integer[] a : arr) {
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
//            Arrays.sort(a, Collections.reverseOrder());
//            System.out.println(Arrays.toString(a));
        }
        for (Integer[] a : arr) {
            Arrays.sort(a, Collections.reverseOrder());
            System.out.println(Arrays.toString(a));
        }
    }

    public static int f(int num) {
        int fa = 1;
        for (int i = 1; i <= num; i++) {
            fa *= i;
        }
        System.out.println(fa);
        return fa;
    }

    int dup[] = new int[10];
    int count = 0, dupcount = 0;

    private void generateDuplicate() {
        int randomvalue = 0;
        for (;;) {
            randomvalue = (int) (Math.random() * 100);
            if (duplicateCheck(randomvalue) == 1) {
                dup[count] = randomvalue;
                System.out.print(dup[count] + " ");
                count++;
            }
            if (count == 10) {
                break;
            }
        }
        System.out.println("");
    }

    int duplicateCheck(int x) {
        for (int i = 0; i < 10; i++) {
            if (dup[i] == x) {
                dupcount++;
                return 0;
            }
        }
        return 1;
    }

    public static void rand() {
        for (int i = 0; i < 10; i++) {
//            int a = (Math.round(Math.random() * 100));
            System.out.print(Math.round(Math.random() * 100) + " ");
        }
    }

    public static int pri() {
        Scanner n = new Scanner(System.in);
        int num = n.nextInt();
        if (num < 2) {
            return 1;
        } else {
            for (int i = 2; i <= num; i++) {
                if (num == i) {
                    System.out.println("prime");
                } else {
                    if (num % i == 0) {
                        System.out.println("not prime");
                        break;
                    }
                }
            }
        }
        return 0;
    }

    public static void condisum(Integer[][] arr) {
        for (Integer[] a : arr) {
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
        }
        for (Integer[] a : arr) {
            Arrays.sort(a, Collections.reverseOrder());
            System.out.println(Arrays.toString(a));
        }
    }

    public static int threenum(int a, int b, int c) {
        int[] ar = {a, b, c};
        int max = ar[0];
        for (int i = 0; i < 3; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println(max);
        return 0;
    }

    public static void main(String[] args) {
        Integer[][] distances = {
            {0, 983, 787, 714, 1375, 967, 1087},
            {983, 0, 214, 1102, 1763, 1723, 1842},
            {787, 214, 0, 888, 1549, 1548, 1627},
            {714, 1102, 888, 0, 661, 781, 810},
            {1375, 1763, 1549, 661, 0, 1426, 1187},
            {967, 1723, 1548, 781, 1426, 0, 239},
            {1087, 1842, 1627, 810, 1187, 239, 0}};
//        condisum(distances);
//        threenum(60,1113,100);
//        arrmult rn = new arrmult();
//        rn.generateDuplicate();
//        rand();
//        pri();
//        multarr(distances);
//        f(5);
//        System.out.println(Math.pow(3, 4));
//        System.out.println(minval(distances));
//        System.out.println(prime(4));
//        arrmult obj = new arrmult();
//        int a = 2;
//        double b = 3.2;
//        obj.add(a, a);
//        obj.add(b, b);
////        System.out.println(obj.x + " " + obj.y);
//
//        System.out.println(fact(6));
//        da(5);
////        p1(9);
//        Scanner num = new Scanner(System.in);
//        int n = num.nextInt();
//        pr(n);
        Integer[] ar = {300, 10, 30, 20, 40, 50, 70, 200, 100};
//        arrsum(ar);
//        _sort(ar);
//        dessort(ar);
//        consum();
//        prime(1);
//        sort(ar);
        condsum();

    }
}
