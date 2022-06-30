package com.company;

interface animal
{
    void fur();
    void color();
    void sound();
}

class dog
{
    protected int tailwagrpm;
    public void getter(Integer lol)
    {
        tailwagrpm=lol;
    }
}

class cat implements animal
{
    public void fur()
    {
        System.out.println("YEP,I do have fur");
    }
    public void color()
    {
        System.out.println("YEP,I am colorful too");
    }
    public void sound()
    {
        System.out.println("meow meow");
    }
}

class adhabowli extends dog implements animal
{
    public void spinner()
    {
        System.out.println("Tail spin is"+tailwagrpm+ "RPM");
    }
    public void fur()
    {
        System.out.println("YEP,I do have fur");
    }
    public void color()
    {
        System.out.println("YEP,I am colorful");
    }
    public void sound()
    {
        System.out.println("bowbow");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        adhabowli pichidi=new adhabowli();
        pichidi.getter(67);
        pichidi.spinner();

    }
}
