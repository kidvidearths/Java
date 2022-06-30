package com.company;
import java.util.Scanner;

class Line
{
    int x1,y1,x2,y2,fails;
    Scanner sc;
    Line()
    {
        fails=0;
        sc=new Scanner(System.in);
        while (true)
        {
            x1=sc.nextInt();
            y1=sc.nextInt();
            x2=sc.nextInt();
            y2=sc.nextInt();
            try
            {
                if(x1==x2 && y1==y2)
                    throw new NumberFormatException();
                break;
            }
            catch (NumberFormatException p)
            {
                fails++;
                System.out.println("Please try again");
            }
        }
    }
}


class TriangleNotPossible extends RuntimeException
{
    public String toString()
    {
        return "A Triangle ain't possible bruh";
    }
}

public class TrainglePoints extends Line
{
    Line line2,line3;
    void checker(Line a, Line b)
    {
        if(a.x2!=b.x1 || a.y2!=b.y1)
        {
            throw new TriangleNotPossible();
        }
    }
    void go()
    {
        while (true)
        {
            try
            {
                line2=new Line();
                checker(this, line2);
                break;
            }
            catch (TriangleNotPossible p)
            {
                fails++;
                System.out.println("Please try again");
            }
        }
        while (true)
        {
            try
            {
                line3=new Line();
                checker(line2,line3);
                checker(line3,this);
                break;
            }
            catch (TriangleNotPossible p)
            {
                fails++;
                System.out.println("Please try again");
            }
        }
        System.out.println("Your total attempts are "+(fails+line2.fails+line3.fails));
    }
}
