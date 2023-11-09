package org.jesusfercan.kyu8;

/*
* Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
* https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/train/java
* */
public class EvenOrOdd {
    public static String evenOrOdd(int number) {
        return number%2==0 ? "Even" : "Odd"; // Place code here;
    }
}
