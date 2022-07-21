/*5. Take 5 numbers from users in an array.
Then find out the average number, how many even and how many odd numbers using these
functions: average(), countEvenNumbers(), countOddNumbers()*/

package ArrayFunction;


import java.util.Scanner;

public class CallFunc {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println("Input 5 Integer number :\n");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        averege(arr);
        countEvenNumbers(arr);
        countOddNumbers(arr);

    }

    public static void averege(int[] a) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }
        int avg = sum / 5;
        System.out.println("Average : " + avg);
    }

    public static void countEvenNumbers(int[] a) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (a[i] % 2 == 0) {
                count++;
            }
            ;

        }
        System.out.println("Total even numbers are : " + count);
    }

    public static void countOddNumbers(int[] a) {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (a[i] % 2 != 0) {
                count++;
            }
            ;

        }
        System.out.println("Total odd numbers are : " + count);
    }

}
