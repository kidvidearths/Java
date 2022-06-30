package com.company;


import java.io.*;

public class IoTreams
{
    public static void kay() throws Exception
    {
        ByteArrayInputStream hehe= new ByteArrayInputStream("So Many Dreams".getBytes(),4,6);
        BufferedInputStream bs= new BufferedInputStream(hehe);

        int x = 0;
        do {
            x = bs.read();
            System.out.print((char)x);
        }
        while (x != -1);
        bs.close();
    }
}
