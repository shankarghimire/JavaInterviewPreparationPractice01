package com.shankar.datastructure.tree.binarytree;

public class Solution {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        d.left = h;
        /*

                1
               /  \
              2     3
             /  \   / \
            4    5  nl  6
         */

        //calls traversTree function
        traverseTree(a);
        System.out.println();
        System.out.println("Min Height: " + minHeight(a));
    }
    public  static  void traverseTree(Node head){
        Node current  = head;
        if (current == null){
            return;
        }
        System.out.print(current.key + " ");
        traverseTree(current.left);
        traverseTree((current.right));
    }
    public  static  int minHeight(Node head){
        Node current = head;
        if(current == null){
            return 0;
        }
        int leftPath = minHeight(current.left);
        int rightPath = minHeight(current.right);
        return Math.max(leftPath, rightPath) + 1;
    }
}
