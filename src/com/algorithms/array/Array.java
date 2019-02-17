package com.algorithms.array;

public class Array {

    public int minumum(int[] a){
        if(a == null || a.length == 0){
            System.out.println("Invalid Input");
        }

        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    public static void main(String[] args){
        Array arr = new Array();
        int[] a ={5,3,2,1,7,6};
        System.out.println("Minimum element in the array is "+arr.minumum(a));
    }
}
