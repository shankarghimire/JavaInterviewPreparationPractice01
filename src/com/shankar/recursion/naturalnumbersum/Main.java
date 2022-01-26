package com.shankar.recursion.naturalnumbersum;

public class Main {
    public static void main(String[] args) {
        NaturalNumberSum obj1 = new NaturalNumberSum();
        int num ;
        num = 1;
        System.out.println("sum upto " + num + " is " + obj1.computeSum(num));
        num = 5;
        System.out.println("sum upto " + num + " is " + obj1.computeSum(num));
        num = 10;
        System.out.println("sum upto " + num + " is " + obj1.computeSum(num));
    }
}
