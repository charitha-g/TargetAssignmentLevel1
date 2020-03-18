package com.tgt.igniteplus;

import java.util.Scanner;

public class sequenceQ13
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("Enter the value of n");
        n=sc.nextInt();
        for(i=1;Math.pow(i,i)<=n;i++)
        {
            int p=(int)Math.pow(i,i);
            System.out.print(p+" ");
        }
    }
}