package com.company;

abstract class animal
{
    protected Integer fur=1000;
    public abstract void sound();
}

class doggie extends animal
{
    doggie(Integer lel)
    {
        fur=lel;
    }
    public void getter()
    {
        System.out.println(fur);
    }
    public void sound()
    {
        System.out.println("BOW BOW");
    }
}

class cat extends animal
{
    cat(Integer lel)
    {
        fur=lel;
    }
    public void getter()
    {
        System.out.println(fur);
    }
    public void sound()
    {
        System.out.println("MEOW MEOW");
    }
}

class unrelated
{
    int bs=420;
}

class slut
{
    public void printer(animal kk)
    {
        System.out.println(kk.fur);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        int a=500;
        doggie adhabowli=new doggie(a);
        cat creambell= new cat(250);
        slut something= new slut();
        something.printer(adhabowli);
    }
}
