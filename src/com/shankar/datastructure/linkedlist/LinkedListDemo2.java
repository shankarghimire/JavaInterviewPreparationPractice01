package com.shankar.datastructure.linkedlist;

import java.util.ArrayList;
import java.util.List;

class MyNode{
    public String data;
    public MyNode next = null;
    public  MyNode(String data){
        this.data = data;
    }
    public MyNode(){}
}
public class LinkedListDemo2 {
    public static void main(String[] args) {
        MyNode a = new MyNode("A");
        MyNode b = new MyNode("B");
        MyNode c = new MyNode("C");
        MyNode d = new MyNode("D");
        a.next = b;
        b.next = c;
        c.next = d;
        //print forward
        //printForward(a);
        //reverse nodes
        System.out.println("Reverse LinkedList : ");
        MyNode rev = reverseNode(a);
        printForward(rev);
    }
    public static  void printForward(MyNode head){
        MyNode current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }


    public static  MyNode reverseNode(MyNode head){
        MyNode prev = null;
        MyNode current = head;
        MyNode ref= head.next;
        while (current != null){
            ref = current.next;
            current.next = prev;
            prev = current;
            current = ref;
        }

        return prev;
    }

    //LinkedList values
    public static List<String> linkedListValues(Node head){
        List<String> values = new ArrayList<>();

        return values;
    }
    //helper function
    private void fillValues(Node head, List<String> values){
       Node current = head;
        if(current == null){
            return;
        }
        //values.add(current.value);
        fillValues(current.next, values);
    }
}
