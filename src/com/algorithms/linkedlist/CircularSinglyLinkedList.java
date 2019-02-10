package com.algorithms.linkedlist;

public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;// We can do the implementation as last == null
    }

    public void createCircularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
        length = 4;
    }

    public void display() {
        if(last == null){
            return;
        }

        ListNode first = last.next;
        while(first != last){
            System.out.print(first.data+" --> ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    //Inserting the node at the beginning of linked list
    public void insertAtStart(int data){
        ListNode current = new ListNode(data);
        if(last != null){
            current.next = last.next;
        } else {
            last = current;
        }

        last.next = current;
        length++;
    }
    
    public static void main(String[] args){
        CircularSinglyLinkedList clink = new CircularSinglyLinkedList();
        //clink.createCircularLinkedList();
        clink.insertAtStart(1);
        clink.insertAtStart(2);
        clink.insertAtStart(3);
        clink.insertAtStart(4);

        System.out.println("-- Printing the circular linked list --");
        clink.display();
    }
}
