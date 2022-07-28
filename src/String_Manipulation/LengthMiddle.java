/*4. Writea program that will give following output:
Input: chattogram
Output: C8M
*/

package String_Manipulation;

import java.util.Scanner;

public class LengthMiddle {
    public static void main(String[] args) {
        System.out.println("Your word:");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println(str);
        int l=str.length();
        char[]arr=str.toCharArray();
        char a=Character.toUpperCase(arr[0]);
        char b=Character.toUpperCase(arr[l-1]);
        System.out.println(a+""+(l-2)+""+b);
    }
}
