/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.spaceballs;

import java.io.Serializable;

/**
 *
 * @author RamaReddi
 */
public class Student implements Serializable
{
    private int sno;
    private String name;
    public Student()
    {
        
    }
    public void setSno(int n)
    {
        sno=n;
    }
    public void setName(String s)
    {
        name=s;
    }
    public int getSno()
    {
        return sno;
    }
    public String getName()
    {
        return name;
    }
    
}
