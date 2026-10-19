package com.example.sem4zad3spaceobject;

import javafx.scene.paint.Color;

public class Satellite extends SpaceObject {

    private double dy = 3.0;

    public Satellite(double x, double y, double sceneWidth, double sceneHeight, Color color) {
        super(x, y, 30, 30, sceneWidth, sceneHeight, color);

    }
    @Override
    protected void vykresly() {
        gc.setFill(color);
        gc.fillRect(0,0,getWidth(), getHeight());
    }

    @Override
    public void pohyb() {
        y += dy;
        if (y <= 50 || y + getHeight() >= sceneHeight) {
            dy = -dy;
        }
        setLayoutY(y);

    }


    public void posunDoPrava() {
        x += 20;
        setLayoutX(x);
    }
}
