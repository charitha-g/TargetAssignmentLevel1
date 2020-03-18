package com.tgt.igniteplus;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length");
        int l=sc.nextInt();
        int last=l-1;
        int first=0;
        int []arr=new int[l];
        System.out.println("Enter sorted array elements");
        for(int i=0;i<l;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter search element");
        int key=sc.nextInt();
        int mid = (first + last)/2;
        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                System.out.println("Element is found at position: " + mid);
                break;
            }
            else {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if ( first > last ){
            System.out.println("Element is not found!");
        }
    }
}
