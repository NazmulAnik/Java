/*2. Price of a formal shirt is 1200 tk and Sharee is 3500 tk. If you buy 2 shirt and 1 sharee, then 400 tk will be discounted.
After your purchase what will be your total cost?*/

package String_Manipulation;

public class Replace {
    public static void main(String[] args) {
        String str = "Price of a formal shirt is 1200 tk and Sharee is 3500 tk";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        String[] arr = (str.split(" "));
        double shirt_price = Double.parseDouble(arr[0]);
        double sharee_price = Double.parseDouble(arr[1]);
        double total = shirt_price * 2 + sharee_price - 400;
        System.out.println("If you buy 2 Shirts and 1 Sharee then total price is " + total);

    }
}
