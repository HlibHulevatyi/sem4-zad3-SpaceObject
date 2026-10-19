package com.example.sem4zad3spaceobject;

import javafx.scene.canvas.*;
import javafx.scene.paint.Color;

public abstract class SpaceObject extends Canvas {

    protected double x;
    protected double y;
    protected double sceneWidth;
    protected double sceneHeight;
    protected Color color;
    protected GraphicsContext gc;

    public SpaceObject(double x, double y, double width, double height, double sceneWidth, double sceneHeight, Color color) {
        super(width, height);
        this.x = x;
        this.y = y;
        this.sceneWidth = sceneWidth;
        this.sceneHeight = sceneHeight;
        this.color = color;
        this.gc = getGraphicsContext2D();
        setLayoutX(x);
        setLayoutY(y);
        vykresly();

    }
    protected abstract void vykresly();
    public abstract void pohyb();


}