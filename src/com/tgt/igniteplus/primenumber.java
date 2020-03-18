package com.tgt.igniteplus;

import java.util.Scanner;

public class primenumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i=0,num=0;
        System.out.println("Enter the value of n and m");
        n=sc.nextInt();
        m=sc.nextInt();
        String prime="";
        for(i=n;i<=m;i++)
        { int counter=0;
            for(num=i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter=counter+1;
                }
            }
            if(counter==2)
            {
                prime=prime+ i +" ";
            }
        }
        System.out.println("Prime numbers from "+n+" to "+m+" are:");
        System.out.println(prime);
    }
}
