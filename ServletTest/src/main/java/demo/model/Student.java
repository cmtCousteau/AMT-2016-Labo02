/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.model;

/**
 *
 * @author marco
 */
public class Student {
    private String name;
    private String lastName;
    
    public Student(String name, String lastName){
        this.name = name;
        this.lastName = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLastName(){
        return this.lastName;
    }
}
