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
        return front == null && rear == null;
    }

    public void enqueue(int data){
        ListNode current = new ListNode(data);
        if(isEmpty()){
            front = current;
        } else {
            rear.next = current;
        }
        rear = current;
        length++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty...");
            return 0;
        }
        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
        return result;
    }

    public void printQueue(){
        if(isEmpty()) {
            System.out.println("Queue is empty... ");
            return;
        }
        ListNode current = front;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);

        queue.printQueue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.printQueue();

    }
}
