package com.bridgelabz.generic;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {

        FindMax max = new FindMax();
        Scanner scan = new Scanner(System.in);
            System.out.print("Enter First Value: ");
            Integer first = scan.nextInt();

            System.out.print("Enter Second Value: ");
            Integer second = scan.nextInt();

            System.out.print("Enter Third Value: ");
            Integer third = scan.nextInt();

	    max.findMax(first,second,third);
  }
}
