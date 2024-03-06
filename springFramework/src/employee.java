/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package springframework;

/**
 *
 * @author Aakash
 */
public class employee {

    private int id;
    private String name;

    public employee() {

    }

    public employee(int id) {
        this.id = id;
    }

    public employee(String name) {
        this.name = name;
    }

    public employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void show(){
        System.out.println("ID is "+id+" and the name of employee is "+name);
    }
}
