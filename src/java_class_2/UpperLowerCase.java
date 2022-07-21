//1. Write a program to check if inputted letter is small or capital

package java_class_2;

import java.util.Scanner;

public class UpperLowerCase {

    public static void main(String[] args) {
        System.out.println("Enter your character: ");
        char ch;
        Scanner input = new Scanner(System.in);
        ch = input.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is a uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter");
        } else {
            System.out.println(ch + " is not an Alphabet");
        }

    }
}

