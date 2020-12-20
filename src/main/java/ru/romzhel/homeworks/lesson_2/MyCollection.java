package ru.romzhel.homeworks.lesson_2;

public interface MyCollection<E> {
    E getItem(int index);

    int getSize();

    E deleteItem(int index);

    void addItem(E item);

}
