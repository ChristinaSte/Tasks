package com.stetsko;

import java.util.ArrayList;
import java.util.Random;

public class Task {

    public static void main(String[] args) {
        ArrayList<Integer> a = createArrayList();
        ArrayList<Integer> b = createArrayList();
        merge(a, b);
        System.out.println("First array: " + a);
        System.out.println("Second array: " + b);

    }

    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> newArray = new ArrayList<>(a.size());
        newArray.addAll(a);
        int resultSize = a.size() + b.size();

        int count = 0;
        for (int i = 0; i < resultSize; i++) {
            if (i % 2 != 0) {
                a.add(i, b.get(count));
                count++;
            }
        }
//        int indexA = 0;
//        int indexB = 0;
//        for (int i = 0; i < resultSize; i++) {
//            if (indexA >= newArray.size()) {
//                a.add(b.get(indexB++));
//            } else if (indexB >= b.size()) {
//                a.add(newArray.get(indexA++));
//            } else if (newArray.get(indexA) <= b.get(indexB)) {
//                a.add(newArray.get(indexA++));
//            } else {
//                a.add(b.get(indexB++));
//            }
//        }
    }

//    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
//        ArrayList resultSize = new ArrayList(a.size() * 2);
//
//        for (int i = 0; i < a.size(); i++) {
//            resultSize.add(a.get(i));
//            resultSize.add(b.get(i));
//        }
//        a.addAll(c);
//    }

    private static ArrayList<Integer> createArrayList() {
        ArrayList<Integer> result = new ArrayList<>();
        Random random = new Random();
        int minSize = 3;
        int value = 0;
        for (int i = 0; i < Math.max(minSize, random.nextInt(10)); i++) {
            value += random.nextInt(10);
            result.add(value);
        }
        System.out.println("List created. Size = " + result.size() + ". List: " + result + '\n');
        return result;
    }
}


