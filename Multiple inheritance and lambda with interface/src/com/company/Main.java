package com.company;

interface chocolate
{
    default void lollipop()
    {
        System.out.println("CHEW IT");
    }
    void coca();
}

interface candy
{
    default void lollipop()
    {
        System.out.println("CRUSH IT");
    }
    void kacha_mango();
}


class cadbury implements chocolate,candy
{
    public void coca()
    {
        System.out.println("I'm a plant, pls don't kill me");
    }
    public void kacha_mango()
    {
        System.out.println("Am cheap but pls don't leave me alone");
    }
    public void lollipop()
    {
        candy.super.lollipop();
        chocolate.super.lollipop();
    }
}

public class Main
{
    public static void main(String[] args)
    {
        chocolate dairymilk= new cadbury();
        dairymilk.lollipop();
        chocolate pp= ()->System.out.println("Cheap plant taken in a cheap way");
        pp.coca();
        pp.lollipop();
    }
}
