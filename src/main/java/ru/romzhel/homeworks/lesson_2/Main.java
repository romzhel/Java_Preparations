package ru.romzhel.homeworks.lesson_2;

public class Main {
    public static void main(String[] args) {
        MyCollection<Integer>[] myCollections = new MyCollection[]{new MyLinkedList<>(), new MyArrayList<>()};
        for (MyCollection<Integer> myCollection : myCollections) {
            for (int i = 0; i < 10; i++) {
                myCollection.addItem(i);
            }

            printItems(myCollection);
            myCollection.deleteItem(5);
            printItems(myCollection);
        }
    }

    public static void printItems(MyCollection list) {
        System.out.println(list.getClass().getSimpleName() + ", элементов: " + list.getSize());
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(i + " - " + list.getItem(i));
        }

        System.out.println();
    }
}
