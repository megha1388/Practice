package com.excercise.second;

public class SecondClass {

    public void sub(int a, int b) {
        if (a > b) {
            System.out.println(a - b);
        } else if (b > a) {
            System.out.println(b - a);
        } else {
            System.out.println("values are equals");
        }


    }

    public int subReturn(int a, int b) {
        return a - b;
    }
}
