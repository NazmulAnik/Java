/*6. Replace "R" from Rahim with "F" from the given String:
Input: Ratul and Rahim lives in Rangpur
Output: Ratul and Fahim lives in Rangpur
*/

package String_Manipulation;

import java.util.StringJoiner;

public class ReplaceR {
    public static void main(String[] args) {
        String str = "Ratul and Rahim lives in Rangpur";
        String[] arr = (str.split(" "));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("Rahim")) {
                arr[i] = arr[i].replaceAll("R", "F");
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        for (String s : arr) sj.add(s);
        System.out.println(sj);
    }
}
