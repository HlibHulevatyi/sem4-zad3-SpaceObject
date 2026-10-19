package com.example.sem4zad3spaceobject;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HelloController {

    @FXML
    private Pane root;

    private List<SpaceObject> vesmirneObjekty = new ArrayList<>();
    private Random random = new Random();

    @FXML
    public void initialize() {
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                for (SpaceObject obj : vesmirneObjekty) {
                    obj.pohyb();
                }
            }
        };
        timer.start();
    }

    @FXML
    public void pridajPlanet() {
        double minY = 110;
        double maxY = root.getPrefHeight() - 120;

        double minX = 60;
        double maxX = root.getPrefWidth() - 120;

        double startX = minX + random.nextDouble() * (maxX - minX);
        double startY = minY + random.nextDouble() * (maxY - minY);

        Planet planet = new Planet(startX, startY, root.getPrefWidth(), root.getPrefHeight(), Color.BLUE);
        vesmirneObjekty.add(planet);
        root.getChildren().add(planet);
    }

    @FXML
    public void pridajAsteroid() {
        double startX = random.nextDouble() * (root.getPrefWidth() - 40);
        double startY = 50 + random.nextDouble() * (root.getPrefHeight() - 40 - 50);

        Asteroid asteroid = new Asteroid(startX, startY, root.getPrefWidth(), root.getPrefHeight(), Color.GRAY);

        vesmirneObjekty.add(asteroid);
        root.getChildren().add(asteroid);
    }

    @FXML
    public void pridajSatelit() {
        double startX = random.nextDouble() * (root.getPrefWidth() - 30);
        double startY = 50 + random.nextDouble() * (root.getPrefHeight() - 30 - 50);

        Satellite satellite = new Satellite(startX, startY, root.getPrefWidth(), root.getPrefHeight(), Color.GREEN);

        vesmirneObjekty.add(satellite);
        root.getChildren().add(satellite);
    }

    @FXML
    public void zmenFarbu() {
        for (SpaceObject obj : vesmirneObjekty) {
            if (obj instanceof Asteroid) {
                ((Asteroid) obj).zmenFarbuNaCervenu();
            }
        }
    }

    @FXML
    public void posunSatelity() {
        for (SpaceObject obj : vesmirneObjekty) {
            if (obj instanceof Satellite) {
                ((Satellite) obj).posunDoPrava();
            }
        }
    }

}
