package com.bridgelabz.generic;

public class FindMax {
    public void maxInt(Integer first,Integer second,Integer third) {
        if(first.compareTo(second) >=0 && first.compareTo(third) >=0) {
            System.out.println("First Element is Largest");
        }else if(second.compareTo(first) >= 0 && second.compareTo(third) >=0) {
            System.out.println("Second Element is Largest");
        }else {
            System.out.println("Third Element is Largest");
        }
    }
}
