package ru.romzhel.homeworks.lesson_2;

import java.util.Arrays;

public class MyArrayList<E> implements MyCollection<E> {
    private final int INIT_CAPACITY = 10;
    private E[] array;
    private int itemsCount;
    private int currentCapacity;

    public MyArrayList() {
        array = (E[]) new Object[INIT_CAPACITY];
        currentCapacity = INIT_CAPACITY;
    }

    public void addItem(E item) {
        if (itemsCount == currentCapacity) {
            currentCapacity *= 2;
            array = Arrays.copyOf(array, currentCapacity);
        }
        array[itemsCount++] = item;
    }

    public E getItem(int index) throws RuntimeException {
        checkIndex(index);
        return array[index];
    }

    public E deleteItem(int index) throws RuntimeException {
        checkIndex(index);

        E deletedItem = array[index];

        int movedItemsCount = itemsCount - index - 1;
        if (movedItemsCount > 0) {
            System.arraycopy(array, index + 1, array, index, movedItemsCount);
        }

        itemsCount--;

        return deletedItem;
    }

    private void checkIndex(int index) throws RuntimeException {
        if (index > itemsCount) {
            throw new RuntimeException("list size exceeded");
        }
    }

    public int getSize() {
        return itemsCount;
    }
}
