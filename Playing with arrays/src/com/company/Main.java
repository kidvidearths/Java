package com.company;


public class Main
{
    public static void main(String[] args)
    {
        int[][] billi=
                {
                        {2,5,6,7},
                        {2,9,1},
                        {8,1,5,1,2}
                };
        for (int[] i : billi)
        {
            for(int k : i)
            {
                System.out.print(" "+k);
            }
            System.out.print("\n");
        }
    }
}
