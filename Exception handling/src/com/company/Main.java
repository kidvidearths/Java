package com.company;

class fault
{
    int a=0;
    int b=0;
    public int mistaker()
    {
        return a/b;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        fault lol=new fault();
        try
        {
            int kar=lol.mistaker();
            if (kar==2)
                throw new lollipopException();
            System.out.println(kar);
        }
        catch(lollipopException e)
        {
            System.out.println(e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("UNKNOWN ERROR");
        }
        finally
        {
            System.out.println("Lollipop eaten");
        }
    }
}