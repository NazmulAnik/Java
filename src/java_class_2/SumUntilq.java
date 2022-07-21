//9. Write a program to sum of user input until users input ‘q’ from keyboard

package java_class_2;

import java.util.Scanner;

public class SumUntilq {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = 'n';
        int sum = 0, n;
        while (c != 'q' && c == 'n') {
            System.out.println("Enter a number: ");
            n = input.nextInt();
            sum = sum + n;
            System.out.println(" press n to continue or q to exit");
            char ch = input.next().charAt(0);
            c = ch;

        }
        System.out.println("The sum of entered numbers = " + sum);
    }


}

