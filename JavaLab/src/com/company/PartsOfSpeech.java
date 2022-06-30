package com.company;

import java.io.*;
import java.util.*;

public class PartsOfSpeech
{
    static Scanner sc;
    static void pos() throws Exception
    {
        FileReader fr= new FileReader("pain.txt");
        File f= new File("pain.txt");
        char[] pp=new char[(int)f.length()];
        fr.read(pp);
        String[] pain=new String(pp).split("\n");
        String[][] hehe=new String[pain.length][];
        for(int i=0;i<pain.length;i++)
        {
            hehe[i]=pain[i].split("\\(");
            hehe[i][1]=hehe[i][1].substring(0,hehe[i][1].length()-1);
        }
        Map <String, Set<String>> everything=new TreeMap<>();
        everything.put("aux",null);
        everything.put("n",null);
        everything.put("v",null);
        everything.put("adj",null);
        everything.put("det",null);
        for(int i=0;i<pain.length;i++)
        {
            String[] left=hehe[i][0].split(" ");
            String[] right=hehe[i][1].split(" ");
            for(int j=0;j<left.length;j++)
            {
                if(left[j].contains("?"))
                    left[j]=left[j].substring(0,left[j].length()-1);
                left[j]=left[j].toLowerCase();
                right[j]=right[j].toLowerCase();
                if(everything.get(right[j])==null)
                {
                    Set<String> pkay=new HashSet<>();
                    pkay.add(left[j]);
                    everything.put(right[j],pkay);
                }
                else
                {
                    Set<String> pkay= everything.get(right[j]);
                    pkay.add(left[j]);
                    everything.put(right[j],pkay);
                }
            }
        }
        sc=new Scanner(System.in);
        String[] cat= sc.nextLine().split(" ");
        String[] key= sc.nextLine().split(" ");
        String[][] compar= new String[cat.length][];
        boolean fag=true;
        for(int i=0;i<cat.length;i++)
        {
            int count=0;
            cat[i]=cat[i].toLowerCase();
            key[i]=key[i].toLowerCase();
            Iterator <String> itr= everything.keySet().iterator();
            Set <String> kol=new HashSet<>();
            while(itr.hasNext())
            {
                String q=itr.next();
                if(everything.get(q).contains(cat[i]))
                {
                    kol.add(q);
                    count++;
                }
            }
            String[] temp=new String[count];
            if(!kol.contains(key[i]))
                fag=false;
            kol.toArray(temp);
            compar[i]=temp;
        }
        System.out.println(everything);
        for(String[] p: compar)
        {
            for(String q: p)
                System.out.print(q+" ");
            System.out.println();
        }
        if(fag)
            System.out.println("Accepted");
        else
            System.out.println("Rejected");
    }
}
