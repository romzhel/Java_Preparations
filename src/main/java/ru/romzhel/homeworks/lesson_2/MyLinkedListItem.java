package ru.romzhel.homeworks.lesson_2;

import lombok.Data;

@Data
public class MyLinkedListItem<T> {
    private T item;
    private MyLinkedListItem<T> nextItem;
    private MyLinkedListItem<T> previousItem;

    public MyLinkedListItem(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "MyLinkedListItem{" +
                "item=" + item.toString() +
                ", nextItem=" + (nextItem != null ? nextItem.getItem().toString() : "null") +
                ", previousItem=" + (previousItem != null ? previousItem.getItem().toString() : "null") +
                '}';
    }
}
