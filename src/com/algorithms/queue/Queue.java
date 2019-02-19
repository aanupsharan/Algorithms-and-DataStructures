package com.algorithms.queue;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    Queue(){
        front = null;
        rear = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public static void main(String[] args){

    }
}
