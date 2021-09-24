package com.practice.rajtraining.listcompare;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class ListCompare {

    int n, i, data, j;

    public void listCompare() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first list");
        n = sc.nextInt();

        System.out.println("Enter element of first list");
        for (i = 0; i < n; i++) {
            data = sc.nextInt();
            list1.add(data);
        }

        System.out.println("");
        System.out.println("Enter size of second list");
        n = sc.nextInt();
        System.out.println("Enter element of second list");
        for (i = 0; i < n; i++) {
            data = sc.nextInt();
            list2.add(data);
        }

        System.out.println("");
        System.out.println("list1 data not common in list2");
        printListFirst(list1, list2);
        System.out.println("");
        System.out.println("list2 data not common in list1");
        printListSecond(list1, list2);
        System.out.println("");
        System.out.println("common data");
        printCommonData(list1, list2);
    }

    public void printListFirst(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        for (i = 0; i < list1.size(); i++) {
            for (j = 0; j < list2.size(); j++) {
                if (Objects.equals(list1.get(i), list2.get(j))) {
                    break;
                } else if (!Objects.equals(list1.get(i), list2.get(j)) && j == list2.size() - 1) {
                    System.out.print(list1.get(i) + "\t");
                }
            }
        }
    }

    public void printListSecond(ArrayList<Integer> list1, ArrayList<Integer> list2) {

        for (i = 0; i < list2.size(); i++) {
            for (j = 0; j < list1.size(); j++) {
                if (Objects.equals(list2.get(i), list1.get(j))) {
                    break;
                } else if (!Objects.equals(list2.get(i), list1.get(j)) && j == list1.size() - 1) {
                    System.out.print(list2.get(i) + "\t");
                }
            }
        }
    }

    public void printCommonData(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (i = 0; i < list1.size(); i++) {
            for (j = 0; j < list2.size(); j++) {
                if (Objects.equals(list1.get(i), list2.get(j))) {

                    System.out.print(list1.get(i) + "\t");
                }
            }
        }
    }
}
