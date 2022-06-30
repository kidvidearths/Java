package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FloatCount
{
    Scanner sc;
    int count;
    public FloatCount()
    {
        count=0;
        sc=new Scanner(System.in);
    }
    void floatCount()
    {
        for(int i=0;i<10;i++)
        {
            try
            {
                sc.nextInt();
            }
            catch(InputMismatchException ae)
            {
                count++;
                sc.nextFloat();
            }
        }
        System.out.println("The number of floats are "+count);
        System.out.println("The number of integers are "+(10-count));
    }
}
