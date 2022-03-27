package com.bridgelabz.generic;

public class GenericDeck {

    public static void toPrint(Integer[] inputArray) {
        for (int element : inputArray) {
            System.out.println(element);
        }
        System.out.println(" ");
    }

    public static void toPrint(Double[] inputArray)
    {
        for (double element : inputArray){
            System.out.println(element);
        }
        System.out.println(" ");
    }

    public static void toPrint(Character[] inputArray)
    {
        for (char element : inputArray){
            System.out.println(element);
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5};
        Character[] charArray = {'A', 'B', 'C', 'D'};


        PrintArray.toPrint(intArray);
        PrintArray.toPrint(doubleArray);
        PrintArray.toPrint(charArray);
    }
}

