package com.example.jfx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class Mouse extends Application
{
    Circle c=new Circle(50,100,50);
    public void start(Stage stage1) throws Exception
    {
        Pane root1 = new Pane();
        EventHandler<MouseEvent> me = new EventHandler<MouseEvent>()
        {
            public void handle(MouseEvent event)
            {
                System.out.println("PAIN");
            }
        };
        root1.getChildren().addAll(c);
        c.setOnMousePressed(me);
        c.setOnMouseDragged(me);
        Scene scene = new Scene(root1, 600, 400);
        stage1.setTitle("Sample application");
        stage1.setScene(scene);
        stage1.show();
    }
}