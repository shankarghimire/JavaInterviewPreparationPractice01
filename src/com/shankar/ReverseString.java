package com.shankar;

public class ReverseString {
    /*
    Reverse a String
    input : Hello
    Output : olleH
                            Hello
                               |
                               ello + H
                               |
                               llo + e
                               |
                               lo + l
                               |
                               o + l
                               |
                               "" + 0
Calls Stack
            reverseString("") + o
            reverseString("o") + l
            reverseString("lo") + l
            reverseString("llo") + e
            reverseString("ello") + H
     */
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);
        String res = reverseString(s);
        System.out.println(res.length());
        System.out.println(res);
    }
    public static String  reverseString(String s){
        //Base Case
        if(s.equals("")){
            return "";
        }
        //Recusrive Call
        return (reverseString(s.substring(1)) + s.charAt(0));
    }
}
