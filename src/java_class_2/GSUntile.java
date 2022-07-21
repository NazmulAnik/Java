/*10. Write a program to enter the numbers till the user wants and at the end,
the program should display the largest and smallest numbers user entered.*/

package java_class_2;

import java.util.Scanner;

public class GSUntile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = 'c';
        int min = 999999, max = 0, n;
        while (c != 'e' && c == 'c') {
            System.out.println("Enter a number: ");
            n = input.nextInt();
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
            System.out.println(" press c continue or e to exit");
            char ch = input.next().charAt(0);
            c = ch;

        }
        System.out.println("Maximum = " + max + "\nMinimum = " + min);
    }


}
