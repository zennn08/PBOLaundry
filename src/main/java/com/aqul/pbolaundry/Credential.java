/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aqul.pbolaundry;

/**
 *
 * @author LENOVO
 */
public class Credential {
    private int id;
    private String username;
    private boolean isOwner;
    
    public Credential(int id, String username, boolean isOwner) {
        this.id = id;
        this.username = username;
        this.isOwner = isOwner;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setIsOwner(boolean isOwner) {
        this.isOwner = isOwner;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public boolean getIsOwner() {
        return this.isOwner;
    }
}
