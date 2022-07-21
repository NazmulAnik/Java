//7. Write a program to print prime numbers from 2 to n

package java_class_2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The number :");

        int n = input.nextInt();
        if (n <= 1) {
            System.out.println("no prime number.");
        } else if (n == 2) {
            System.out.println("prime nymbers : 2");
        } else {
            System.out.println("prime nymbers :\n2 ");
            for (int i = 3; i <= n; i = i + 2) {
                int check = 0;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        check = 1;
                    }

                }
                if (check == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}