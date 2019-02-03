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

    public static void main(String[] args) {
        SinglyLinkedList singly = new SinglyLinkedList();
        singly.head = new ListNode(10);
        ListNode secondNode = new ListNode(1);
        ListNode thirdNode = new ListNode(8);
        ListNode fourthNode = new ListNode(15);

        singly.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
    }
}
