/*8. Write a program to generate 2 random numbers which will not be shown to the user.
Take a user input and match it with any of the random numbers. If correct give it 1 point
and if incorrect, do not give it any point. Finally, repeat this for 10 times and count
the point user achieved.*/

package java_class_2;

import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        int score = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input your number from 1 To 10 , 10 times :");
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * (10) + 1);
            int b = (int) (Math.random() * (10) + 1);
            int n = input.nextInt();
            if (n == a || n == b) {
                score++;
            }
        }
        System.out.println("Your score is= " + score);
    }
}
