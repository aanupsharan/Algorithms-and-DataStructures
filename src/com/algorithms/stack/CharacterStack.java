package com.algorithms.stack;

import java.util.EmptyStackException;

public class CharacterStack {
    private ListNode top;
    private int length;

    private class ListNode{
        private char data;
        private ListNode next;

        ListNode(char data){
            this.data = data;
            this.next = null;
        }

    }

    CharacterStack(){
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

    public void push(char element){
        ListNode node = new ListNode(element);
        node.next = top;
        top = node;
        length++;
    }

    public char pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

        char result = top.data;
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

    public String reverse(String word){
        if(word == null || word.length() < -1){
            return null;
        }
        char[] letters = new char[word.length()];
        CharacterStack reverseStack = new CharacterStack();

        for(int i=0; i < word.length(); i++){
            reverseStack.push(word.charAt(i));
        }
        for(int i=0; i < word.length(); i++){
            letters[i] = reverseStack.pop();
        }
        return new String(letters);
    }

    public static void main(String[] args){
        CharacterStack characterStack = new CharacterStack();
        String a = "ABCDEF";
        String rev = characterStack.reverse(a);
        System.out.println("The string is "+a);
        if(rev != null){
            System.out.println("Reverse of the String is "+rev);
        } else {
            System.out.println("Invalid String");
        }

    }
}
