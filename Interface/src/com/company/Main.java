package com.company;

interface travel
{
    void move();
}

class car implements travel
{
    public void test()
    {
        
    }
    public void move()
    {
        System.out.println("YAY, i have a car");
    }
}

class bike implements travel
{
    public void move()
    {
        System.out.println("BRUH, i have a bike");
    }
}

class RTC_bus implements travel
{
    public void move()
    {
        System.out.println("You guys are mean dicks");
    }
}

class finder_outer
{
    public void how(travel someway)
    {
        someway.move();
    }
}

public class Main
{
    public static void main(String[] args)
    {
        travel alto=new car();
        travel yamaha= new bike();
        travel bus =new RTC_bus();
        finder_outer lala=new finder_outer();
        lala.how(yamaha);
    }
}
