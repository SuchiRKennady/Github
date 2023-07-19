package com.bl.DataStruct;

public class LinkedList {
    Node head;
    Node tail;

    void inestAtEnd(int data){
        Node temp = new Node(data);
        if (head == null){
            head = temp;
        }
        else{
            tail.next = temp;
        }
        tail = temp;
    }
    void display(){
        Node temp = head;
        while (temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    int getSize(){
        Node temp = head;
        int count = 0;
        while (temp.next != null){
            count++;
            temp = temp.next;
        }
        count++;
        return count;
    }

    void inserAtStart(int data){
        Node temp = new Node(data);
        if (head == null){
            head = tail = temp;
// tail = temp;
        }else {
            temp.next = head;
            head = temp;
        }
    }

    void insertBetween(int index , int data){
        Node t = new Node(data);

        Node temp = head;
        for (int i = 1; i<= index-1; i++){
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next =t;
    }
}
