package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<Number>();

        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);
        list.add(88);
        list.add(99);

        shuffle(list);

        System.out.println(list.toString());
    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int switchValue = (int) (Math.random() * list.size());
            Number temp = list.get(switchValue);
            list.set(switchValue, list.get(i));
            list.set(i, temp);
        }
    }
}
