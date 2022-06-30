package com.company;

class ofcourse_i_still_loveyou
{
    int bowbow=20;
    int meowmeow=40;
    static int low=99;
}

public class Main {

    public static void main(String[] args)
    {
	    ofcourse_i_still_loveyou[] something=new ofcourse_i_still_loveyou[5];
	    for (int i=0;i<5;i++)
        {
            something[i]=new ofcourse_i_still_loveyou();
            something[i].bowbow=i*2;
            something[i].meowmeow=i*4;
        }
        for (int i=0;i<5;i++)
        {
            System.out.println(something[i].bowbow=i*2);
            System.out.println(something[i].meowmeow=i*4);
            System.out.println(ofcourse_i_still_loveyou.low);
        }
    }
}
