package ru.romzhel.homeworks.lesson_1.task_2;

import lombok.Data;

@Data
public abstract class Car implements Moveable {
    protected Engine engine;
    protected String color;
    protected String name;

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
