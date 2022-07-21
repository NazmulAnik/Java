/*6. Suppose a software system excepts valid credentials from user to logged in to the system.
 if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked".
 Let the username: admin, password: adm1n
 */

package ArrayFunction;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        String username = "admin";
        String password = "adm1n";
        Scanner input = new Scanner(System.in);
        int i, count = 0;
        for (i = 0; i < 3; i++) {
            System.out.println("Username :\n");
            String str1 = input.nextLine();
            System.out.println("Password :\n");
            String str2 = input.nextLine();
            if (password.equals(str2) && username.equals(str1)) {
                System.out.println("Successfully logged in");
                count++;
                i = 3;
            } else {
                System.out.println("Try again");
            }
        }
        if (count == 0) {
            System.out.println("Your user has been temporary locked");
        }
    }
}
