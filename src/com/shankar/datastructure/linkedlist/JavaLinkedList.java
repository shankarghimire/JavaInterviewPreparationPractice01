package com.shankar.datastructure.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        System.out.println(list1);
        list1.addFirst(5);
        list1.addLast(25);
        System.out.println(list1);
        Iterator it = list1.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
        System.out.println();

        Iterator it2 = list1.descendingIterator();
        while (it2.hasNext()){
            System.out.print(it2.next() + " ");
        }
        System.out.println();

        ///Clone method
        LinkedList<Integer> list2 = (LinkedList<Integer>) list1.clone();
        System.out.println(list2);
        list2.add(33);
        list1.add(44);
        System.out.println(list1);
        System.out.println(list2);

    }
}
