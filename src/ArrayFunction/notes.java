/*2. Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,100,50,20,10,5,2,1]
Input: 1256
Output:
1000 1
100 2
50 1
2 3*/

package ArrayFunction;

import java.util.Scanner;

public class notes {
    public static void main(String[] args) {
        int[] note = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        System.out.println("input amount :\n");
        Scanner input = new Scanner(System.in);
        int tk = input.nextInt();

        for (int i = 0; i < note.length; i++) {
            int count = 0;
            while (tk >= note[i]) {
                tk = tk - note[i];
                count++;
            }
            if (count > 0) {
                System.out.println(note[i] + " " + count);
            }
        }


    }
}
