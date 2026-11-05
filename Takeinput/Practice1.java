package Takeinput;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value firstnum");
        int firstnum = sc.nextInt ();
        System.out.println("enter the value secnum");
        int secnum = sc.nextInt ();
        int ans = firstnum + secnum ;
        System.out.println("answer is:"+ans);   
         
        sc.close();

    }



  
    
}