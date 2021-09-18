package com.array;

public class NullPException {

    public static void main(String[] args) {
      String s=null;
        try {
            if (s.equals("raj")) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        } catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("NullPointerException cought");

        }

    }
}
