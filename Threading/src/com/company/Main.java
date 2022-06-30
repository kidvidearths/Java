package com.company;

public class Main
{
    public static void main(String[] args)
    {
        Runnable r1=()->
        {
            for(int i=0;i<8;i++)
            {
                System.out.println("HELLO");
                try{Thread.sleep(500);} catch (Exception e){}
            }
        };
        Runnable r2=()->
        {
            for(int i=0;i<8;i++)
            {
                System.out.println("NOT AGAIN");
                try{Thread.sleep(500);} catch (Exception e){}
            }
        };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        try{Thread.sleep(100);} catch (Exception e){}
        t2.start();


    }
}
