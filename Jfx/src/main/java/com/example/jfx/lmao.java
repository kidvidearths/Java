package com.example.jfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class lmao extends Application
{
    @Override
    public void start(Stage stg1) throws IOException
    {
        Button b1= new Button("yooo");
        Group root=new Group(b1);
        Scene sc=new Scene(root,600,500);
        stg1.setScene(sc);
        stg1.show();
    }
}