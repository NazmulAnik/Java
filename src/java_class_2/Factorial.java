//6. Write  a program to find the factorial of a given number
package java_class_2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The number :");
        int n = input.nextInt();
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        System.out.println(n + "! = " + fac);
    }
}
