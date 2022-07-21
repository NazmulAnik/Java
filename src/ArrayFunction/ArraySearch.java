/*1. Take input from a user and check if the number exists in the array
        let the array is [1,3,5,7,2,4,6,8]
        Input: 7
        Output: Found in the position 3
        Input: 9
        Output: Found no element*/

package ArrayFunction;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8};
        int check = 0;
        System.out.println("input the number to be searched:");
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                System.out.println(" Found in the position " + i);
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("Found no element");
        }
    }
}
