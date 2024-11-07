/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aqul.pbolaundry;

/**
 *
 * @author LENOVO
 */
public class Service {
    int id;
    String name;
    int price;

    public Service(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " (Rp. " + price + ")";
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
