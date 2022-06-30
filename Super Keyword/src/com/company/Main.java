package com.company;

class bowbow
{
    int insides;
    public void show()
    {
        System.out.println(insides);
    }
    bowbow()
    {
        insides=420;
        System.out.println("I am doggie");
    }
    bowbow(int i)
    {
        insides=42;
        System.out.println("I am " +i+ " doggie");
    }
}

class wilddog extends bowbow
{
    int insides;
    public void show()
    {
        System.out.println(super.insides);
    }
    wilddog()
    {
        insides=69;
        System.out.println("I am wild doggie");
    }
    wilddog(int i)
    {
        System.out.println("I am " +super.insides+ " wild dog");
        super.insides=99;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        wilddog cheow=new wilddog(10);
        cheow.show();
    }
}
