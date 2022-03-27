package com.bridgelabz.generic;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {

        FindMax max = new FindMax();
        Scanner scan = new Scanner(System.in);
	    
           System.out.print("Enter First Value: ");
           Float first = scan.nextFloat();

           System.out.print("Enter Second Value: ");
           Float second = scan.nextFloat();

           System.out.print("Enter Third Value: ");
           Float third = scan.nextFloat();

            max.findMax(first,second,third);
        }
 }

