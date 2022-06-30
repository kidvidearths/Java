package com.company;

class betterthannothing
{
    int kar;
    int rat;
    static char pp;
    public void printer()
    {
        System.out.println(kar+rat);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        betterthannothing test = new betterthannothing();
        test.kar=22;
        test.rat=55;
        test.printer();
    }
}
