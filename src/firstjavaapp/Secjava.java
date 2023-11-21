/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp;

import java.awt.font.TextAttribute;
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author B-20
 */
public class Secjava {

    static public int num = 5;
    static protected int num1 = 5;
    static private int num3 = 5;
    static int num4;
    public static Integer radi = 105;

    public void rad(Integer abc) {
        System.out.println("radius " + abc);
        System.out.println(abc * abc * 3.14159);
    }

    public static void circ(double r) {
        double area;
        area = r * r *  3.14159;
        System.out.println("area " + area);
    }

//   public int num5 = 5;
//   public boolean sss = false;
//   public Integer num2 = 5;
//   public String abc = "";
//
//   public void func(){
//   
//   }
    int age = 5;
    String name = "abc";

    public void printval(int abc) {
        System.out.println(Secjava.num3);
        System.out.println(abc);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Firstjavaapp obb = new Firstjavaapp();
        Firstjavaapp.method();
        System.out.println(Firstjavaapp.method());
        obb.methodb();
        System.out.println(obb.methodb());
        System.out.println(obb.vard);
        obb.vard = 500;
        System.out.println(obb.vard);
        System.out.println("    J    A    V     V    A");
        System.out.println("    J   A  A   V   V    A  A");
        System.out.println("J   J   AAAAA   V V     AAAAA");
        System.out.println(" J J   A     A   V     A     A");
        Secjava cir = new Secjava();
        cir.rad(105);
        Scanner inp = new Scanner(System.in);
        double r = inp.nextDouble();
        Secjava.circ(r);
//        Scanner inp1 = new Scanner(System.in);
//        double p = inp1.nextDouble();
//        secjava.circ(p);
        

    }

}
