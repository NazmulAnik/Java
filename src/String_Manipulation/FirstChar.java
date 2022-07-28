/*8. Write a program to convert each 1st char to uppercase from a string
        Input: rahim lives in sylhet
        Output: Rahim Lives in Sylhet*/

package String_Manipulation;

import java.util.Scanner;
import java.util.StringJoiner;

public class FirstChar {
    public static void main(String[] args) {
        System.out.println("Enter a Sentence:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char[] l = arr[i].toCharArray();
            if (l[0] >= 'a' && l[0] <= 'z') {
                l[0] = Character.toUpperCase(l[0]);
            }
            arr[i] = String.valueOf(l);
        }
        StringJoiner sj = new StringJoiner(" ");
        for (String s : arr) sj.add(s);
        System.out.println(sj);
    }
}

