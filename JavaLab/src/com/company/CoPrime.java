package com.company;
import java.util.Scanner;

class NotPrimeException extends RuntimeException
{
    public String toString()
    {
        return "Not a prime bruh";
    }
}

class Prime
{
    int number;
    boolean ref;
    Scanner sc;
    Prime()
    {
        number=0;
        ref=false;
        sc=new Scanner(System.in);
    }
    void prime(int k)
    {
        number=k;
        ref=false;
        for(int i=2;i<=number/2;i++)
            if(number%i==0)
            {
                ref=true;
                break;
            }
        if(ref)
            throw new NotPrimeException();
    }
}


class NotTwinException extends RuntimeException
{
    public String toString()
    {
        return "Not a twin bruh";
    }
}

public class CoPrime extends Prime
{
    void go()
    {
        int n=sc.nextInt();
        int k=sc.nextInt();
        prime(n);
        prime(k);
        if(java.lang.Math.abs(k-n)!=2)
        {
            throw new NotTwinException();
        }
        System.out.println("They are co-primes");
    }
}
