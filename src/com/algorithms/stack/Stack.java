package com.algorithms.stack;

import java.util.EmptyStackException;
import java.util.List;

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
        return length;
    }

    public void push(int element){
        ListNode node = new ListNode(element);
        node.next = top;
        top = node;
        length++;
    }
}