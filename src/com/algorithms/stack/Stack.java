package com.algorithms.stack;

import java.util.EmptyStackException;

public class Stack {
    private ListNode top;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }

    }

    Stack(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return top == null; //We can have the condition length == 0 also.
    }

    public int peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void push(int element){
        ListNode node = new ListNode(element);
        node.next = top;
        top = node;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public void printStack(){
        if(isEmpty())
            throw new EmptyStackException();
        ListNode temp = top;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        System.out.println("top of the element :: "+stack.peek());
        stack.push(15);
        stack.push(16);
        stack.push(17);
        System.out.println("top of the element :: "+stack.peek());
        stack.printStack();

        stack.pop();
        stack.pop();
        System.out.println("top of the element :: "+stack.peek());
        stack.printStack();

    }
}
