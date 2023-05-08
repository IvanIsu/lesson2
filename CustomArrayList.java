package lesson2;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 15;


    public CustomArrayList() {
        list = ((T[]) new Object[DEFAULT_CAPACITY]);
        size = 0;
    }

    public void add(T item) {
        if (size + 1 >= list.length) {
            T[] newList = Arrays.copyOf(list, list.length);
            list = newList;
        }
        list[size++] = item;
    }

    public void add(int index, T item) {
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
    }

    public void delete(int index) {
        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }
    }

    public void printArrayList() {
        for (T item : list) {
            if(item != null){
                System.out.print(item + " ");
            }
        }
    }
}
