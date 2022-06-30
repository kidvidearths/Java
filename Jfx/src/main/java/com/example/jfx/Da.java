package com.example.jfx;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Da extends Application
{
    Pane root;
    ToggleGroup pain;
    ScrollBar scr,scr1,scr2;
    RadioButton rb1,rb2,rb3,rb4;
    Rectangle r1,r2,r3;
    Line l1,l2;
    Scene sc;
    TextField tf;
    Label lb1,lb2,lb3;
    @Override
    public void start(Stage stg1)
    {
        double factor=489/60.0;
        root= new Pane();
        scr= new ScrollBar();
        scr1= new ScrollBar();
        scr2= new ScrollBar();
        rb1=new RadioButton("MAGENTA");
        rb2=new RadioButton("GREEN");
        rb3=new RadioButton("CYAN");
        rb4= new RadioButton("PINK");
        pain= new ToggleGroup();
        rb1.setToggleGroup(pain);
        rb2.setToggleGroup(pain);
        rb3.setToggleGroup(pain);
        rb4.setToggleGroup(pain);
        rb1.setLayoutX(170);
        rb1.setLayoutY(120);
        rb2.setLayoutX(280);
        rb2.setLayoutY(120);
        rb3.setLayoutX(170);
        rb3.setLayoutY(160);
        rb4.setLayoutX(280);
        rb4.setLayoutY(160);
        scr.setMin(0);
        scr.setMax(60);
        scr1.setMin(0);
        scr1.setMax(60);
        scr2.setMin(0);
        scr2.setMax(60);
        scr.setLayoutX(170);
        scr1.setLayoutX(170);
        scr2.setLayoutX(170);
        scr1.setLayoutY(30);
        scr2.setLayoutY(60);
        lb1=new Label("0-10");
        lb2=new Label("11-20");
        lb3=new Label("21-30");
        lb1.setLayoutX(280);
        lb2.setLayoutX(280);
        lb2.setLayoutY(30);
        lb3.setLayoutX(280);
        lb3.setLayoutY(60);
        tf=new TextField();
        tf.setLayoutX(170);
        tf.setLayoutY(90);
        r1= new Rectangle(20,0,30,0);
        r2= new Rectangle(70,0,30,0);
        r3= new Rectangle(120,0,30,0);
        l1=new Line(10,0,10,500);
        l2=new Line(0,489,489,489);
        root.getChildren().addAll(r1,r2,r3,l1,scr,scr1,rb1,scr2,l2,tf,lb1,lb2,lb3,rb2,rb3,rb4);
        sc= new Scene(root, 500,500);
        stg1.setScene(sc);
        stg1.show();
        EventHandler<MouseEvent> me = new EventHandler<MouseEvent>()
        {
            public void handle(MouseEvent event)
            {
                Rectangle r=(Rectangle)event.getSource();
                int x=(int)((489-r.getY())/factor);
                float y=(x/60f)*100;
                tf.setText(x+"/60 and "+y+"%");
            }
        };
        EventHandler<MouseEvent> me1 = new EventHandler<MouseEvent>()
        {
            public void handle(MouseEvent event)
            {
                tf.setText("");
            }
        };
        r1.setOnMouseEntered(me);
        r2.setOnMouseEntered(me);
        r3.setOnMouseEntered(me);
        r1.setOnMouseExited(me1);
        r2.setOnMouseExited(me1);
        r3.setOnMouseExited(me1);
        EventHandler<ActionEvent> rbb = new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent actionEvent)
            {
                RadioButton r=(RadioButton)pain.getSelectedToggle();
                String k=r.getText();
                Paint p;
                switch (k)
                {
                    case "MAGENTA":
                    {
                        p=Color.MAGENTA;
                        break;
                    }
                    case "GREEN":
                    {
                        p=Color.GREEN;
                        break;
                    }
                    case "CYAN":
                    {
                        p=Color.CYAN;
                        break;
                    }
                    default:
                    {
                        p=Color.PINK;
                        break;
                    }
                }
                r1.setFill(p);
                r2.setFill(p);
                r3.setFill(p);
            }
        };
        rb1.setOnAction(rbb);
        rb2.setOnAction(rbb);
        rb3.setOnAction(rbb);
        rb4.setOnAction(rbb);
        scr.valueProperty().addListener(new ChangeListener<Number>()
        {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1)
            {
                double k=t1.doubleValue()*factor;
                r1.setY(489-k);
                r1.setHeight(k);
            }
        });
        scr1.valueProperty().addListener(new ChangeListener<Number>()
        {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1)
            {
                double k=t1.doubleValue()*factor;
                r2.setY(489-k);
                r2.setHeight(k);
            }
        });
        scr2.valueProperty().addListener(new ChangeListener<Number>()
        {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1)
            {
                double k=t1.doubleValue()*factor;
                r3.setY(489-k);
                r3.setHeight(k);
            }
        });
    }
}
