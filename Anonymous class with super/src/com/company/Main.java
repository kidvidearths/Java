package com.company;

abstract class human
{
    int men,women;
    public void gender_change()
    {
        System.out.println("DON'T");
    }
    public abstract void whichone();
}

class man extends human
{
    public void printer()
    {
        System.out.println(women);
    }
    public void whichone()
    {
        men=1;
        System.out.println("I have PP");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        man wamen=new man()
        {
            int seee,women;
            public void whichone()
            {
                women=420;
                super.women=44;
                System.out.println("I have something else");
            }
        };
        wamen.whichone();
        wamen.printer();

    }
}
