package com.company;


class lollipop
{
    private String kat;
    public void changer(String pp)
    {
        kat=pp;
    }
    public void printer()
    {
        System.out.println(kat);
    }

}

public class Main
{
    public static void main(String[] args)
    {
	    lollipop[] dick=new lollipop[3];
	    dick[1]=new lollipop();
	    dick[1].changer("TESTTTT");
	    dick[1].printer();
    }
}
