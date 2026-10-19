package com.example.sem4zad3spaceobject;

import javafx.scene.paint.Color;

public class Asteroid extends SpaceObject {

    private double dx = 2.0;
    private double dy = 2.0;

    public Asteroid(double x, double y, double sceneWidth, double sceneHeight, Color color) {
        super(x, y, 40, 40, sceneWidth, sceneHeight, color);


    }

    @Override
    protected void vykresly () {
        gc.setFill(color);
        gc.fillOval(0,0, getWidth(), getHeight());

    }

    @Override
    public void pohyb () {
        x += dx;
        y += dy;

        if (x <= 0 || x + getWidth() >= sceneWidth) {
            dx = -dx;
        }

        if (y <= 50 || y + getHeight() >= sceneHeight) {
            dy = -dy;
        }

        setLayoutX(x);
        setLayoutY(y);

    }
    public void zmenFarbuNaCervenu() {
        this.color = Color.RED;
        vykresly();
    }
}
