package com.tgt.igniteplus;

import java.util.*;
public class numberinwords
{
    public static void main(String[] args)
    {
        String []nos={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int no=sc.nextInt();
        int r;
        String res=" ";
        while(no>0) {
            r = no % 10;
            res = nos[r] + " " + res;
            no /= 10;
        }
        System.out.print("\n"+res);
    }
}
