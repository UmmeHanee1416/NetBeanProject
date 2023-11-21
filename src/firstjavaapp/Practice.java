/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import jdk.nashorn.internal.parser.Token;

public class Practice {

    public static int sort(int[] num) {
        int f1 = num[0];
        int f2 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > f1) {
                f1 = num[i];
                f2 = f1;
            }
        }
        return f1;
    }

    public static void sortArray(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int num = 0;
                if (arr[i] > arr[j]) {
                    num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }
            System.out.print(+arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50, 2, 50};
//        sortArray(numbers);

        Scanner n = new Scanner(System.in);
        String s = n.next();
        String a = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            a += (s.charAt(i));
        }
        System.out.println(a);
        if (s.equals(a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
//        System.out.println("");
//        for (int i = 1; n.hasNext(); i++) {
//            String s = n.next();
//            System.out.print(i + " " + s );
//        }
//        String a = n.nextLine();
//        boolean s = n.hasNext(a);
//        
//         System.out.println(1+a); 
//        System.out.println("welcome to JAVA");
//        System.out.println("welcome to Computer Science");
//        System.out.println("Programming is fun");
//        System.out.println("welcome to JAVA");
//        System.out.println("welcome to JAVA");
//        System.out.println("welcome to JAVA");
//        System.out.println("welcome to JAVA");
//        System.out.println("welcome to JAVA");
//        System.out.println("a    a^2    a^3");
//        System.out.println("1     1       1");
//        System.out.println("2     4       8");
//        System.out.println("3     9       27");
//        System.out.println("4     16      64");
//        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
//        System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
//        System.out.println(4.0 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0));
//        System.out.println(4.0 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0));
//        System.out.println(2 * 5.5 * 3.14159);
//        System.out.println(5.5 * 5.5 * 3.14159);
//        System.out.println(4.5 * 7.9);
//         double pi = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
//        System.out.println(pi);
//        double ak = ((1*14)/1.6);
//        
//        System.out.println(ak);
////        System.out.println(sort(numbers));
//        Arrays.sort(numbers);
////        System.out.println("the sorted array is: ");
//        for (int num : numbers) {
////            System.out.print(num + " ");
//
//        }
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers, Collections.reverseOrder());
//        System.out.println("\nmodified ayyars ()" + Arrays.toString(numbers));
//        int[] arr = {12, 5, 56, -2, 32, 2, -26, 9, 43, 94, -78};
//        System.out.print("sorted arrays; ");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                int temp = 0;
//                if (arr[i] > arr[j]) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//            System.out.print(+arr[i] + " ");
//        }
//        Scanner inpnum = new Scanner(System.in);
//        int sum = 0;
//        for (int i = 0;; i++) {
//            System.out.println("Enter a number");
//            int x = inpnum.nextInt();
//            if (x != 0) {
//                sum += x;
//            } else {
//                break;
//            }
//        }
//        System.out.println(sum);
    }
}
