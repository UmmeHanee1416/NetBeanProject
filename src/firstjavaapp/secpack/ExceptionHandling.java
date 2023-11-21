/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp.secpack;

/**
 *
 * @author B-20
 */
public class ExceptionHandling {

    static int x[];

    static {
        x[0] = 1;
    }
    public static String name;
    private static String address;

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String aAddress) {
        address = aAddress;
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 1;
        int a = 10;
        String b = "abc";
        int c = 0;
        try {
//            System.out.println(name.length());
            System.out.println(a / c);
//            System.out.println(arr[4]);
//            System.out.println(getAddress());
        } //        catch (NullPointerException e) {
        //            e.printStackTrace();
        //            System.out.println("NullPointerException");
        //        } 
        //        catch (ArrayStoreException e) {
        //            e.printStackTrace();
        //        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
