package com.bl.DataStruct;

public class MainDataSturct {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.inestAtEnd(10);
        ll.inestAtEnd(20);
        ll.inestAtEnd(30);
        ll.inestAtEnd(40);

        ll.inserAtStart(5);
        ll.insertBetween(3,15);

        ll.display();
        System.out.println(ll.getSize());

    }
}
