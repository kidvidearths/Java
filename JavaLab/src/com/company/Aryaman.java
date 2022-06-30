package com.company;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Aryaman
{
        static void pain() throws IOException
        {
            File f= new File("j.txt");
            byte[] pain= new byte[(int)f.length()];
            DataInputStream dis=new DataInputStream(new FileInputStream("j.txt"));
            dis.read(pain);
            String hairy= new String(pain);
            String[] lol= hairy.split("\t");
            for(String ac:lol)
            {
                char[] fc=ac.toCharArray();
                int i=0;
                while(!Character.isDigit(fc[i]))
                    i++;
                String team=ac.substring(0,i);
                String won=ac.substring(i+2,i+4);
                String lost=ac.substring(i+4,i+6);
                System.out.println(team+" "+won+" "+lost);
            }
        }
}
