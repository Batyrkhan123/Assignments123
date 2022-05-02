package com.company;

public class Main {

    public static void main(String[] args) {
        Integer[] list = new Integer[20];
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }
        System.out.println(linearSearch(list, 11));
        System.out.println(linearSearch(list, 22));
        System.out.println(linearSearch(list, 33));
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E value) {

        for (int i = 0; i < list.length; i++) {
            if (list[i].compareTo(value) == 0) {
                return i;
            }
        }

        return -1;
    }
}
