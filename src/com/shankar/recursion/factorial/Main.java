package com.shankar.recursion.factorial;

public class Main {
    public static void main(String[] args) {
        Factorial fact = new Factorial();
        int num;
        num = 1;
        System.out.println("Factorial of " + num + "! is " + fact.commputeFactorial(num));

        num = 2;
        System.out.println("Factorial of " + num + "! is " + fact.commputeFactorial(num));

        num = 3;
        System.out.println("Factorial of " + num + "! is " + fact.commputeFactorial(num));

        num = 4;
        System.out.println("Factorial of " + num + "! is " + fact.commputeFactorial(num));

        num = 7;
        System.out.println("Factorial of " + num + "! is " + fact.commputeFactorial(num));
    }
}
