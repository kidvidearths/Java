package com.company;

class countah
{
    int count=0;
    public synchronized void counter()
    {
        count=count+1;
    }
}

public class Thread_counter
{
    public static void main(String[] args)
    {
        countah clock=new countah();
        Thread t1=new Thread
                (
                new Runnable()
                {
                    @Override
                    public void run()
                    {
                        for (int i=0;i<1000;i++)
                            clock.counter();
                    }
                }
                );
        Thread t2=new Thread
                (
                        new Runnable()
                        {
                            @Override
                            public void run()
                            {
                                for (int i=0;i<1000;i++)
                                    clock.counter();
                            }
                        }
                );
        t1.start();
        t2.start();
        try{t1.join();} catch (Exception e){}
        try{t2.join();} catch (Exception e){}
        System.out.println(clock.count);
    }
}
