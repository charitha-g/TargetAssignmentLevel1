package com.tgt.igniteplus;

import java.util.Scanner;

public class Xpowern
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x and n");
        int n,x,ans;
        x=sc.nextInt();
        n=sc.nextInt();
        ans=x;
        if(n==1)
            System.out.print(x);
        else
            {
                 for(int i=2;i<=n;i++)
                 {
                     ans=ans*x;
                 }
            System.out.print(ans);
        }
    }
}