package com.tgt.igniteplus;

import java.util.*;
public class sequenceQ14
{
    public static void main(String[] args)
    {
        int i=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=in.nextInt();
        int a[]=new int [n+3];
        a[0]=1;
        a[1]=4;
        a[2]=7;
        for(i=3;i<=n;i++)
            a[i]=a[i-1]+a[i-2]+a[i-3];
        for(i=0;i<=n;i++)
            System.out.print(a[i]+" ");
    }
}