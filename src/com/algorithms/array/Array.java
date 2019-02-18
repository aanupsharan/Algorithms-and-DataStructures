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

    //Algorithm 1: reversing the array
    public int[] reverse(int a[], int start, int end){
        int temp;
        while(start < end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        return a;
    }

    //Algorithm 2: reversing the array
    public int[] reverse(int a[]){
        if(a == null || a.length == 0){
            System.out.println("Invalid Input");
            return null;
        }

        int temp;
        for(int i = 0; i < a.length; i++){
            if(i < a.length/2){
                temp = a[i];
                a[i] = a[a.length-i-1];
                a[a.length-i-1] = temp;
            } else {
                break;
            }
        }
        return a;
    }

    public static void main(String[] args){
        Array arr = new Array();
        int[] a ={5,3,2,1,6};
        System.out.println("Minimum element in the array is "+arr.minumum(a));
        System.out.println("Elememts in array a:");
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Reversed elememts in array a:");
        int[] b = arr.reverse(a,0, a.length-1);
        if(b != null){
            for(int i : b){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
