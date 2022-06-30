package com.company;
class Numerator extends Thread
{
    int sum,low,high;
    int[] a;
    Numerator(int l, int h, int[] a)
    {
        low=l;
        high=h;
        this.a=a;
        start();
    }
    public void run()
    {
        sum=0;
        for(int i=low;i<high;i++)
            sum=sum+(i)*(a[i-1]);
    }
    int getSum()
    {
        return sum;
    }
}

class Denominator extends Thread
{
    int sum,low,high;
    int[] a;
    Denominator(int l, int h, int[] a)
    {
        low=l;
        high=h;
        this.a=a;
        start();
    }
    public void run()
    {
        sum=0;
        for(int i=low;i<high;i++)
            sum=sum+a[i-1];
    }
    int getSum()
    {
        return sum;
    }
}
