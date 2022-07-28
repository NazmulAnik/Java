/*3. Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?
*/

package String_Manipulation;

public class Laptop {
    public static void main(String[] args) {
        String str = "Core i 7 HP laptop price is 76000 tk and cash payment discount 10%";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        double laptop = Double.parseDouble(arr[1]);
        double dis = Double.parseDouble(arr[2]);
        double total = laptop - (laptop * dis / 100);
        System.out.println("The purchase price on cash payment is " + total);
    }
}
