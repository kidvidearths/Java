package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class TheoryFAT
{
    void something() throws Exception
    {
        FileWriter kak= new FileWriter("hehe.txt");
        Scanner sc= new Scanner(new File("pain.txt"));
        while (sc.hasNext())
        {
            kak.write(sc.next());
            kak.write('\n');
        }
        kak.close();
    }
}
