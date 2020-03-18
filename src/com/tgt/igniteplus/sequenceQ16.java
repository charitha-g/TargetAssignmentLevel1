package com.tgt.igniteplus;

import java.util.Scanner;

public class sequenceQ16
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n,i,j,k;
        n=sc.nextInt();
        for(i=1,j=1;i*4<=n&&j<=n;i++)
        {
            if (i % 3 != 0)
            {
                k = 4 * i;
                System.out.print(j+" ");
                j=j+k;
            }
        }
    }
}