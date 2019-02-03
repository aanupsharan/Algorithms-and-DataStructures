package com.algorithms.linkedlist;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    //Displaying the Singly Linked List
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data +" --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    //length of the Singly Linked List
    public int length(){
        if(head == null) return 0;
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    //Inserting the listnode at the starting of the list
    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    //Inserting the node at the last of the List
    public void insertLast(int data){
        ListNode newNode = new ListNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean find(int data){
        if(head == null) return false;
        ListNode current = head;
        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        SinglyLinkedList singly = new SinglyLinkedList();
        /*singly.head = new ListNode(10);
        ListNode secondNode = new ListNode(1);
        ListNode thirdNode = new ListNode(8);
        ListNode fourthNode = new ListNode(15);

        singly.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        singly.display();
        System.out.println("length of the List = "+ singly.length());*/

        singly.insertFirst(10);
        singly.insertFirst(1);
        singly.insertFirst(8);
        singly.insertFirst(15);

        System.out.println("Inserting the List node at the beginning");
        singly.display();
        System.out.println("length of the List = "+ singly.length());

        singly.insertLast(90);
        singly.insertLast(92);
        System.out.println("Inserting the ListNode at last");
        singly.display();
        System.out.println("length of the List = "+ singly.length());

        System.out.println("element 92 is "+ ( singly.find(92) ? "Found" : "Not Found"));
        System.out.println("element 2 is "+ ( singly.find(2) ? "found" : "not found"));
    }
}
