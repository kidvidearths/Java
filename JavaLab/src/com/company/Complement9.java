package com.company;

interface Start
{
    String[] data={"0101","0100","0000","1111","1000","1011","1001","0111","1010","0110"};
    class Value
    {
        String[][] k;
        Value()
        {
            k=new String[data.length][2];
        }
        String findValue(String q)
        {
            int sum=0;
            int[] kay={8,4,-2,-1};
            for(int i=0;i<4;i++)
            {
                if(q.charAt(i)=='1')
                    sum=sum+kay[i];
            }
            return String.valueOf(sum);
        }
        void filler()
        {
            for(int i=0;i<10;i++)
            {
                k[i][0]=data[i];
                k[i][1]=findValue(k[i][0]);
            }

        }
    }
}



class Code8421 extends Start.Value
{
    Code8421()
    {
        filler();
    }
    String to8421(String r)
    {
        for(int i=0;i<10;i++)
        {
            if(k[i][1].equals(r))
            {
               return k[i][0];
            }
        }
        return "K";
    }
    void converter(String pp)
    {
        for(int i=0;i<pp.length();i++)
        {
            System.out.print(to8421(String.valueOf(pp.charAt(i)))+" ");
        }
    }
}

public class Complement9 extends Code8421
{
    String flipper(String lol)
    {
        char[] fornow=lol.toCharArray();
        for(int i=0;i<4;i++)
        {
            if(fornow[i]=='1')
                fornow[i]='0';
            else
                fornow[i]='1';
        }
        return String.valueOf(fornow);
    }
    void find9Compliment(String everything)
    {
        String[] temp=everything.split(" ");
        for(String s:temp)
            System.out.print(flipper(s)+" ");
    }
    void findDecimal(String everything)
    {
        String[] temp=everything.split(" ");
        for(String s:temp)
        {
            for(int i=0;i<10;i++)
            {
                if(k[i][0].equals(s))
                {
                    System.out.print(k[i][1]);
                }
            }
        }
    }
}
