package ru.romzhel.homeworks.lesson_2;

public class MyLinkedList<E> implements MyCollection<E> {
    private MyLinkedListItem<E> head;
    private MyLinkedListItem<E> tail;
    private int size;

    public void addItem(E item) {
        MyLinkedListItem<E> newTail = new MyLinkedListItem<>(item);
        if (tail != null) {
            tail.setNextItem(newTail);
            newTail.setPreviousItem(tail);
            tail = newTail;
        } else {
            head = tail = newTail;
        }
        size++;
    }

    public E getItem(int index) throws RuntimeException {
        return getListItem(index).getItem();
    }

    public E deleteItem(int index) throws RuntimeException {
        MyLinkedListItem<E> deletedItem = getListItem(index);

        if (size == 1) {
            head = tail = null;
            size = 0;
            return deletedItem.getItem();
        }

        if (deletedItem == head) {
            deletedItem.getNextItem().setPreviousItem(null);
            head = deletedItem.getNextItem();
        } else if (deletedItem == tail) {
            deletedItem.getPreviousItem().setNextItem(null);
            tail = deletedItem.getPreviousItem();
        } else {
            deletedItem.getPreviousItem().setNextItem(deletedItem.getNextItem());
            deletedItem.getNextItem().setPreviousItem(deletedItem.getPreviousItem());
        }

        size--;
        return deletedItem.getItem();
    }

    private MyLinkedListItem<E> getListItem(int index) throws RuntimeException {
        if (index > size) {
            throw new RuntimeException("list size exceeded");
        }

        boolean isHeadNearer = index < size / 2;
        MyLinkedListItem<E> currentItem = isHeadNearer ? head : tail;
        int stepsCount = isHeadNearer ? index : (size - index - 1);
        for (int i = 0; i < stepsCount; i++) {
            currentItem = isHeadNearer ? currentItem.getNextItem() : currentItem.getPreviousItem();
        }

        return currentItem;
    }

    public int getSize() {
        return size;
    }
}
