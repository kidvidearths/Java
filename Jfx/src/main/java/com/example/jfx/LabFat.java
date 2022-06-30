package com.example.jfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.input.MouseEvent;



public class LabFat extends Application
{
    public void start(Stage stg1)
    {
        MenuBar mb1= new MenuBar();
        Menu m1=new Menu("BRUH");
        Menu m2=new Menu("OKAY");
        MenuItem ok= new MenuItem("option 1");
        MenuItem okk= new MenuItem("option 2");
        m1.getItems().addAll(ok);
        m2.getItems().addAll(okk);
        mb1.getMenus().addAll(m1,m2);
        FlowPane root= new FlowPane(mb1);
        Scene sc= new Scene(root,600,500);
        stg1.setScene(sc);
        stg1.show();
        class lamo implements EventHandler<MouseEvent>
        {
            public void handle(MouseEvent me)
            {
                Circle c1=new Circle();
                c1.setCenterX(me.getX());
                c1.setCenterY(me.getY());
                c1.setRadius(50);
                root.getChildren().addAll(c1);
            }
        }
       root.addEventHandler(MouseEvent.MOUSE_DRAGGED,new lamo());
    }
}
