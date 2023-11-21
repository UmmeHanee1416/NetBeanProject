/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaapp;

/**
 *
 * @author B-20
 */
public class Firstjavaapp {

    /**
     * @param args the command line arguments
     */
    public static Integer method() {
        Integer var = 0;
        System.out.println(var);
        return 4;
    }
    
    final double pi = 3.14159;
    
    public boolean methodb() {
        int var = 2;
        System.out.println(var);
        return false;
    }
    
    public Integer vard = 100;
    
    public void methodd(Integer num) {
        this.vard = num;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        method();
        
        System.out.println(Firstjavaapp.method());
        
        Firstjavaapp obj = new Firstjavaapp();
        System.out.println(obj.methodb());
        obj.methodd(200);
        System.out.println("hello world");
        System.out.println("hello world 1");
        
        Secjava emp = new Secjava();
        emp.printval(200);
        
        System.out.println("2");
        
        System.out.println(obj.vard);
        obj.vard = 345;
        System.out.println(obj.vard);

//        System.out.println(Math.random());
//        System.out.println(Math.max(10, 5));
//        System.out.println(Math.min(2, 5));
//        System.out.println(Math.pow(2, 5));
//        System.out.println(Math.sqrt(25));
//        System.out.println(Math.round(2.55));
//        System.out.println(Math.ceil(2.1));
//        System.out.println(Math.floor(2.55));
//        System.out.println(true);
//        System.out.println(2 < 3);
//        System.out.println(2 == 3);
//        System.out.println(true || false);
//        System.out.println(true && false);
//        String sad = 2 < 3 && 400 > 500 ? "Satis" : "not";
//        System.out.println(sad);
//        int a = 2;
//        switch (a) {
//            case 1:
//                System.out.println("con 1 sat");
//            case 2:
//                System.out.println("con 2 sat");
//            case 3:
//                System.out.println("con 3 sat");
//                break;
//            case 4:
//                System.out.println("con 4 sat");
//                break;
//            default:
//                System.out.println("no con sat");
//        }
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        for (int i = 2; i <= 10; i += 2) {
//            System.out.println(i);
//        }
//        int i = 11;
//        while(i <= 10){
//        if(i == 5){
//            System.out.println("hello Bangladesh!!");
//            i++;
//            continue;
//        } else {
//            System.out.println("printed" + i);
//        }
//            System.out.println("---" + i);
//        i++;
//        
//        }
//        while(i <= 10){
//        if(i == 5){
//            System.out.println("hello Bangladesh!!");
//            break;
//        } else {
//            System.out.println("printed" + i);
//        }
//            System.out.println("---" + i);
//        i++;
//        
//        }
//        do{
//            System.out.println("printed" + i);
//            i++;
//        } while(i <= 10);
//        int a = 1;
//        for(int b = 1; b <= 5; b++){
//            System.out.println("class " + b);
//            for(int c = 1; c <= 5; c++){
//                System.out.println("stuedent "+c);
//            }
//        }
        String[] car = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String abc : car) {
            if (abc.equals("BMW")) {
                continue;
            }
            System.out.println(abc);
        }
    }

//    public void abc (){
//     System.out.println("hello world 2");
//        System.out.println("hello world 3");
//    }
}
