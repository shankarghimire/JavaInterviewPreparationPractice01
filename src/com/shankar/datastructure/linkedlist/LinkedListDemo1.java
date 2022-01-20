package com.shankar.datastructure.linkedlist;

class Node{
    public int value;
    public Node next;
    public Node(int value){
        this.value = value;
        this.next =null;
    }
    public Node(){}
}
public class LinkedListDemo1 {
    public static void main(String[] args) {
        Node n1 = new Node(5);
        Node n2 = new Node(10);
        Node n3 = new Node(15);
        Node n4 = new Node(20);

        n1.next = n2;
        n2.next  = n3;
        n3.next = n4;
        printNodes2(n1);
        //System.out.println(n1.value);
    }
    public  static  void printNodes(Node n){
        Node current = new Node();
        current = n;
        current.value = 300;
       while (current != null){
           System.out.println(current.value);
           current = current.next;
       }
//        if(n == null){
//            return;
//        }
//        System.out.println(n.value);
//        printNodes(n.next);

    }

    public  static  void printNodes2(Node n){
        Node current = new Node();
        current = n;
        if(current == null){
            return;
        }

        printNodes2(current.next);
        System.out.println(current.value);

    }
}

