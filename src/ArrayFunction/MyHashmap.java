/*4. Create your todays bazar list/pocket expenditure which includes the item name and price.
Then create a function named searchItem(String item) which will be used to search any item
 from your HashMap and return the price. If found no item, then print message as "No item
 found" and another function named totalSum() which will return total price of items.*/

package ArrayFunction;

import java.util.HashMap;
import java.util.Scanner;

public class MyHashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("rice", 60);
        hashmap.put("fish", 500);
        hashmap.put("salt", 40);
        hashmap.put("sugar", 70);
        System.out.println("The item to be searced ;\n");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        SearchItem(hashmap, str);
        totalSum(hashmap);
    }

    public static void SearchItem(HashMap<String, Integer> map, String s) {
        if (map.containsKey(s)) {

            int a = map.get(s);
            System.out.println("Price is: " + a);

        } else {
            System.out.println("No item found");
        }
    }

    public static void totalSum(HashMap<String, Integer> map) {
        int sum = 0;
        for (int a : map.values()) {
            sum = sum + a;
        }
        System.out.println("Total Sum= " + sum);
    }
}
