package com.example.realsnakeladder;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle{
    public Tile (int width,int height){
        setWidth(width);
        setHeight(height);
        setFill(Color.RED);
        setStroke(Color.BLACK);
    }
}
