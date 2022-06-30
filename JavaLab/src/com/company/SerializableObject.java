package com.company;

import java.io.Serializable;

public class SerializableObject implements Serializable
{
    int kat, dog;
    SerializableObject(int kat, int dog)
    {
        this.kat=kat;
        this.dog=dog;
    }
}
