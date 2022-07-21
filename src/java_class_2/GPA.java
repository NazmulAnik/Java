//2. Write a program to calculate GPA and find grade

package java_class_2;

import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        int n, i, avg, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Total number of subject : ");
        n = input.nextInt();
        int subject[] = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Enter marks of Subject " + (i + 1) + " :");
            subject[i] = input.nextInt();
            if (subject[i] > 100 || subject[i] < 0) {
                System.out.println("Input is not Valid. Enter valid marks");
                i--;
            }
        }

        for (i = 0; i < n; i++) {
            total = total + subject[i];
        }


        avg = total / n;

        if (avg >= 80) {
            System.out.print("GPA : A+");
        } else if (avg >= 70 && avg < 80) {
            System.out.print("GPA : A");
        } else if (avg >= 60 && avg < 70) {
            System.out.print("GPA : A-");
        } else if (avg >= 50 && avg < 60) {
            System.out.print("GPA : B");
        } else if (avg >= 40 && avg < 50) {
            System.out.print("GPA : C");
        } else {
            System.out.print("GPA : F");
        }


    }
}
