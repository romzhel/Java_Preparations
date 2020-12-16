package ru.romzhel.homeworks.lesson_1.task_2;

public class LightWeightCar extends Car implements Openable {
    @Override
    public void open() {
        System.out.println("Car is opened");
    }
}
