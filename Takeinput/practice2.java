package Takeinput;

import java.math.BigInteger;
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter Bada value ");
        BigInteger bg = sc.nextBigInteger();
        
        
        System.out.println(" enter  the value of flag ");
        Boolean flag = sc.nextBoolean();

        sc.close ();
    }
}
