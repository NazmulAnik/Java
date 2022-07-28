/*5. Write a program that will count how many vowels in the given string:
"roadtosdet"
Output: 4
*/
package String_Manipulation;

public class Vowel {
    public static void main(String[] args) {
        String str = "roadtosdet";
        char[] arr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'A' ||
                    arr[i] == 'e' || arr[i] == 'E' ||
                    arr[i] == 'i' || arr[i] == 'I' ||
                    arr[i] == 'o' || arr[i] == 'O' ||
                    arr[i] == 'u' || arr[i] == 'U'
            ) {
                count++;
            }
        }
        System.out.println(count);
    }
}
