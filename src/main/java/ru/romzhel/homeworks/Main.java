package ru.romzhel.homeworks;

import ru.romzhel.homeworks.lesson_1.task_1.Person;
import ru.romzhel.homeworks.lesson_1.task_1.PersonBuilder;
import ru.romzhel.homeworks.lesson_1.task_2.LightWeightCar;
import ru.romzhel.homeworks.lesson_1.task_2.Lorry;
import ru.romzhel.homeworks.lesson_1.task_3.Circle;
import ru.romzhel.homeworks.lesson_1.task_3.Rectangle;
import ru.romzhel.homeworks.lesson_1.task_3.Shape;
import ru.romzhel.homeworks.lesson_1.task_3.Triangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //----- task 1 --------
        Person person = PersonBuilder.create()
                .setFirstName("Bob")
                .setLastName("Russian")
                .setAge(35)
                .setPhone("")
                .setGender("M")
                .setAddress("Russia")
                .setCountry("RU")
                .build();

        System.out.println(person + "\n");

        //----- task 2 --------
        System.out.println("LightWeightCar");
        LightWeightCar lightWeightCar = new LightWeightCar();
        lightWeightCar.open();
        lightWeightCar.move();
        lightWeightCar.stop();
        System.out.println();

        System.out.println("Lorry");
        Lorry lorry = new Lorry();
        lorry.move();
        lorry.stop();
        System.out.println();

        //----- task 3 --------
        Shape[] shapes = {new Circle(), new Rectangle(), new Triangle()};
        Arrays.stream(shapes).forEach(Shape::printName);
    }
}
