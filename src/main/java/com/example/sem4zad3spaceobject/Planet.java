package com.example.sem4zad3spaceobject;

import javafx.scene.paint.Color;

public class Planet extends SpaceObject {

    private double uhol = 0.0;
    private double radiusOrbit = 60.0;
    private double rychlost = 0.03;
    private double centerX;
    private double centerY;

    public Planet(double x, double y, double sceneWidth, double sceneHeight, Color color) {
        super(x, y, 60, 60, sceneWidth, sceneHeight, color);
        this.centerX = x;
        this.centerY = y;
    }

    @Override
    protected void vykresly() {
        gc.setFill(color);
        gc.fillOval(0,0, getWidth(), getHeight());
    }

    @Override
    public void pohyb() {
        uhol += rychlost;
        x = centerX + radiusOrbit * Math.cos(uhol);
        y = centerY + radiusOrbit * Math.sin(uhol);
        setLayoutX(x);
        setLayoutY(y);

    }
}