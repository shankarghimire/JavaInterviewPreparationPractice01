package com.shankar;

public class CallStackDemo {
    public static void main(String[] args) {
        String res = MethodA();
        System.out.println(res);
    }
    public static String MethodA(){
        return "Hello, " + MethodB();
    }
    public  static  String MethodB(){
        return "my " + MethodC();
    }
    public static String MethodC(){
        return "friends!";
    }
}
