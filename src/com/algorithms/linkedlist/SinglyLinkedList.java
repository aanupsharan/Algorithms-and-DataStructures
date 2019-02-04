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

    //searching particular key is available or not in the LinkedList.
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

    //finding the middle of the node of LinkedList.
    public ListNode findMiddle(){
        if(head == null) return null;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        while(fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    //Returning the nth node from last of the LinkedList.
    public ListNode findNthNodeFromLast(int n){
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        if(n<=0){
            System.out.println("Invalid value: n"+ n);
            return null;
        }
        while(count < n){
            if(refPtr == null){
                System.out.println(n + " is greater the number of elements in list");
                return null;
            }
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }

    //Removing the duplicate elements from the SortedLinked List
    public void removeDuplicates(){
        if(head == null) return;
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.data == current.next.data){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void insertInSortingOrder(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }

        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        if(current == head)
            head = newNode;
        else
            temp.next = newNode;
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

        ListNode middleNode = singly.findMiddle();
        System.out.println("The element is "+(middleNode == null ? "not found" : middleNode.data));

        ListNode nthNodeFromLast = singly.findNthNodeFromLast(3);
        if(nthNodeFromLast != null){
            System.out.println("The element from the last is "+ nthNodeFromLast.data);
        }

        //Creating the sorted linked list
        SinglyLinkedList singly1 = new SinglyLinkedList();
        singly1.insertLast(10);
        singly1.insertLast(10);
        singly1.insertLast(10);
        singly1.insertLast(11);
        singly1.insertLast(12);
        singly1.insertLast(12);
        singly1.insertLast(13);
        singly1.insertLast(13);
        singly1.insertLast(13);

        //Printing the sorted elements
        System.out.println("----- Printing the list -----");
        singly1.display();
        System.out.println("----- Removing the duplicates from sorted linked list and print -----");
        singly1.removeDuplicates();
        singly1.display();

        System.out.println("----- Inserting the nodes in the Sorting Order -----");
        singly1.insertInSortingOrder(3);
        singly1.insertInSortingOrder(18);
        singly1.insertInSortingOrder(15);
        singly1.insertInSortingOrder(1);
        singly1.display();


    }
}
