/*3. Suppose, in a company , here are some employee salaries in an array
[35000, 25000, 28000, 32500, 44000, 32800]
Find out the 3rd highest salary*/

package ArrayFunction;

public class ThirdHighest {
    public static void main(String[] args) {
        int[] salary = {35000, 25000, 28000, 32500, 44000, 32800};
        for (int i = 0; i < salary.length; i++) {
            for (int j = i + 1; j < salary.length; j++) {
                if (salary[i] < salary[j]) {
                    int temp = salary[i];
                    salary[i] = salary[j];
                    salary[j] = temp;
                }
            }
        }
        System.out.println("3rd highest salary: " + salary[2]);
    }
}

