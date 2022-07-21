/*4. Write a program to check balance and withdraw money from ATM booth using if else or switch case*/

package java_class_2;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        double balance = 10000.00, withdraw, rec;
        int pass = 1234, password, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        password = input.nextInt();
        if (pass == password) {
            System.out.println("Press 1 to check balance \n" +
                    "press 2 to withdraw money \n" +
                    "press 0 to exit \n");
            for (i = 1; i != 0; i++) {
                System.out.println("Enter your choice: ");
                int choice = input.nextInt();
                rec = choice;
                switch (choice) {
                    case 1:
                        System.out.println("Your Balance:" + balance);

                        break;
                    case 2:
                        System.out.println("Withdraw amount :");
                        withdraw = input.nextFloat();
                        if (withdraw < balance) {
                            System.out.println(withdraw + " is withdrawn");
                            balance = balance - withdraw;
                            System.out.println("Current Balance :" + balance);
                        } else {
                            System.out.println("Insufficient Balance!!!");
                            System.out.println("Your Balance:" + balance);
                        }
                        break;
                    case 0:
                        i = -1;
                        System.out.println("Thank You!!!");
                        break;
                }
            }

        } else {
            System.out.println("Incorrect Password!!!");
        }
    }
}
