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
public class Employee {
    public Employee(){};
    public Employee(long id){
        this.id = id;
        System.out.println("ID "+this.id);
    };
    public Employee(long id, String name, int age){
        this.age = age;
        this.id = id;
        this.name = name;
    }
//    id,name,age
    private long id;
    private String name;
    private int age;

    public void setUser(long i, String n, int a) {
        this.setId(i);
        this.setName(n);
        this.setAge(a);
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
