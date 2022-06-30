package com.company;

class bowbow
{
    protected int something=99;
    public void show()
    {
        System.out.println(something);
    }
}

class meow extends  bowbow
{
    int something=9821473;
}

class rando extends meow
{
    int something=240;
    public void supershow()
    {
        System.out.println(super.something);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        rando pp=new rando();
        pp.supershow();

    }
}
