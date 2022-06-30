package com.company;

import java.util.Scanner;

public class Canteen
{
    int fag=0;
    int fac,mal,femal;
    synchronized void faculty() throws Exception
    {
        while(fag!=0)
        {
            wait();
        }
        for(int i=0;i<3;i++)
        {
            int c=serving();
            fac++;
            System.out.print("Faculty "+fac+" Served with bill ");
            System.out.println(c);
        }
        fag=1;
        notifyAll();
    }
    synchronized void man() throws Exception
    {
        while(fag!=1)
        {
            wait();
        }
        int c=serving();
        mal++;
        System.out.print("Male Student "+mal+" Served with bill ");
        System.out.println(c);
        fag=2;
        notifyAll();
    }

    synchronized void woman() throws Exception
    {
        while(fag!=2)
        {
            wait();
        }
        int c=serving();
        femal++;
        System.out.print("Female Student "+femal+" Served with bill ");
        System.out.println(c);
        fag=0;
        notifyAll();
    }

    int serving()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many dishes of Rs.50? ");
        int a=sc.nextInt();
        System.out.print("How many dishes of Rs.75? ");
        int b=sc.nextInt();
        System.out.print("How many dishes of Rs.100? ");
        int c=sc.nextInt();
        System.out.print("How many dishes of Rs.150? ");
        int d=sc.nextInt();
        return a*50+b*75+c*100+d*150;
    }
}

class Faculty extends Thread
{
    Canteen obj;
    int n;
    Faculty(Canteen obj,int n)
    {
        this.obj=obj;
        this.n=n;
        start();
    }
    public void run()
    {
        for(int i=0;i<n;i++)
        {
            try
            {
                obj.faculty();
            }
            catch(Exception e)
            {System.out.print("PAIN");}
        }
    }
}

class Male extends Thread
{
    Canteen obj;
    int n;
    Male(Canteen obj, int n)
    {
        this.obj=obj;
        this.n=n;
        start();
    }
    public void run()
    {
        for(int i=0;i<n;i++)
        {
            try
            {
                obj.man();
            }
            catch(Exception e)
            {System.out.print("PAIN");}
        }
    }
}

class Female extends Thread
{
    Canteen obj;
    int n;
    Female(Canteen obj, int n)
    {
        this.obj=obj;
        this.n=n;
        start();
    }
    public void run()
    {
        for(int i=0;i<n;i++)
        {
            try
            {
                obj.woman();
            }
            catch(Exception e)
            {System.out.print("PAIN");}
        }
    }
}