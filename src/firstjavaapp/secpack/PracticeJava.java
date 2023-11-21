/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp.secpack;

import java.util.Scanner;

/**
 *
 * @author B-20
 */
public class PracticeJava {

    static Scanner num = new Scanner(System.in);

    public static void condsum() {
        int a = 0;
        for (int i = 0;; i++) {
            int b = num.nextInt();
            if (b != 0) {
                a += b;
            } else {
                break;
            }
        }
        System.out.println(a);
    }

    public static void trycatcharith() {
        int c = num.nextInt();
        int d = num.nextInt();
        int e = c / d;
        System.out.println(e);
    }

    public static void trycatchArr() {
        String f[] = new String[5];
        f[0] = "abc";
        f[1] = "def";
        System.out.println(f[3].length());
    }

    public static void main(String[] args) {
//        condsum();

        try {
//            trycatcharith();
            trycatchArr();
        } catch (ArithmeticException e) {
        } catch (ArrayIndexOutOfBoundsException e) {
        } catch (Exception e) {
        }
        System.out.println("hello");
    }
}
