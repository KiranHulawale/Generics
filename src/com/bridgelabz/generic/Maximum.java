package com.bridgelabz.generic;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {

        FindMax max = new FindMax();
        Scanner scan = new Scanner(System.in);
	    
           System.out.print("Enter First Value: ");
           Float first = scan.nextFloat();

           System.out.print("Enter First Value: ");
           String first = scan.next();

           System.out.print("Enter Second Value: ");
           String second = scan.next();

            System.out.print("Enter Third Value: ");
            String third = scan.next();

             max.findMax(first,second,third);
     }
}
