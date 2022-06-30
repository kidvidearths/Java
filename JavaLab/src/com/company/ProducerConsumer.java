package com.company;

class ProducingTheard extends Thread
{
    ProducerConsumer pain;
    ProducingTheard(ProducerConsumer pain)
    {
        this.pain=pain;
        start();
    }
    public void run()
    {
        for(int i=0;i<10;i++)
            pain.producer();
    }
}

class ConsumingThread extends Thread
{
    ProducerConsumer pain;
    ConsumingThread(ProducerConsumer pain)
    {
        this.pain=pain;
        start();
    }
    public void run()
    {
        for(int i=0;i<10;i++)
            pain.consumer();
    }
}


public class ProducerConsumer
{
    boolean fag;
    int i,j;
        void producer ()
        {
            synchronized(this)
            {
                while (fag) {
                    try
                    {
                        wait();
                    }
                    catch (Exception pain)
                    {}
                }
                System.out.println("PRODUCED" + i);
                i++;
                fag = true;
                notify();
            }
        }

        void consumer ()
        {
            synchronized (this)
            {
                while (!fag) {
                    try
                    {
                        wait();
                    }
                    catch (Exception pain)
                    {}
                }
                System.out.println("CONSUMED" + j);
                j++;
                fag = false;
                notify();
            }
        }
}
