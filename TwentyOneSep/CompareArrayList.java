package TwentyOneSep;

import java.util.ArrayList;
import java.util.Objects;

public class CompareArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(15);
        list1.add(16);
        list1.add(18);
        list1.add(80);
        System.out.println(list1);
        System.out.println("");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(15);
        list2.add(80);
        list2.add(22);
        list2.add(30);
        System.out.println(list2);
        System.out.println("");

        int i, j;
        System.out.println("data from list1");
        for (i = 0; i < list1.size(); i++) {
            for (j = 0; j < list2.size(); j++) {
                if (Objects.equals(list1.get(i), list2.get(j))) {
                    break;
                } else {
                    if (!Objects.equals(list1.get(i), list2.get(j)) && j == list2.size() - 1) {
                        System.out.println(list1.get(i));
                    }
                }
            }
        }

        System.out.println("");
        System.out.println("data from list2");
        for (i = 0; i < list2.size(); i++) {
            for (j = 0; j < list1.size(); j++) {

                if (Objects.equals(list2.get(i), list1.get(j))) {
                    break;
                } else {
                    if (!Objects.equals(list2.get(i), list1.get(j)) && j == list1.size() - 1) {
                        System.out.println(list2.get(i));
                    }
                }
            }
        }

        System.out.println("");
        System.out.println("common data from both list");
        for (i = 0; i < list1.size(); i++) {
            for (j = 0; j < list2.size(); j++) {
                if (Objects.equals(list1.get(i), list2.get(j))) {
                    System.out.println(list1.get(i));
                }
            }
        }
    }
}