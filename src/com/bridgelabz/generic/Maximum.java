package com.bridgelabz.generic;
import java.util.Scanner;

public class Maximum {
     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        FindMaximum max;

        while(true) {
            System.out.println("1.Integers\n2.Float\n3.String\nSelect Your Choice: ");
            int ch = scan.nextInt();

            switch(ch) {
                case 1:
                {
                    System.out.print("Enter First Value: ");
                    Integer first = scan.nextInt();

                    System.out.print("Enter Second Value: ");
                    Integer second = scan.nextInt();

                    System.out.print("Enter Third Value: ");
                    Integer third = scan.nextInt();
                    max = new FindMaximum(first, second, third);
                    max.findMax();
                    break;
                }
                case 2:
                {
                    System.out.print("Enter First Value: ");
                    Float first = scan.nextFloat();

                    System.out.print("Enter Second Value: ");
                    Float second = scan.nextFloat();

                    System.out.print("Enter Third Value: ");
                    Float third = scan.nextFloat();
                    max = new FindMaximum(first, second, third);
                    max.findMax();
                    break;
                }
                case 3:
                {
                    System.out.print("Enter First Value: ");
                    String first = scan.next();

                    System.out.print("Enter Second Value: ");
                    String second = scan.next();

                    System.out.print("Enter Third value ");
                    String third = scan.next();
                    max = new FindMaximum(first, second, third);
                    max.findMax();
                    break;
                }
                default:
                    System.out.println("Enter Choice Between 1 And 3");
            }

        }
    }
}
