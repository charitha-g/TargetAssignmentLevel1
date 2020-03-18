package com.tgt.igniteplus;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array length");
        int n=sc.nextInt();
        int i,s,flag=0; int[] a=new int[100];
        System.out.println("Enter array elements:");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter search element");
        s=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==s) {
                System.out.println("Element found at position "+i);
                flag = 1;
            }
        }
        if(flag==0)
            System.out.println("Not found");

    }
}