package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();
        list.add(22);
        list.add(44);
        list.add(55);
        list.add(33);
        list.add(11);
        list.add(66);
        list.add(99);
        list.add(77);
        list.add(88);

        System.out.println("Unsorted array: " + list.toString());
        sort(list);
        System.out.println("Sorted array: " + list.toString());
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            Number currentMin = list.get(i);
            int currentMinIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (currentMin.doubleValue() > list.get(j).doubleValue()) {
                    currentMin = list.get(j);
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list.set(currentMinIndex, list.get(i));
                list.set(i, currentMin);
            }
        }
    }
}
