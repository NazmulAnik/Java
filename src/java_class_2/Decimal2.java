/*3. Input 2 decimal numbers and check if they are both same or different up to two decimal places.
 E.g 120.546 & 120.241package java_class_2;*/

import java.util.Scanner;

public class Decimal2 {
    public static void main(String[] args) {
        float a, b;
        int m, n;
        System.out.println("input 2 decimal numbers");
        Scanner input = new Scanner(System.in);
        a = input.nextFloat();
        b = input.nextFloat();
        a = a * 100;
        b = b * 100;
        m = (int) a;
        n = (int) b;
        if (m == n) {
            System.out.println("Numbers are equal up to 2 decimal numbers");
        } else {
            System.out.println("Numbers are not equal up to 2 decimal numbers");
        }

    }
}
