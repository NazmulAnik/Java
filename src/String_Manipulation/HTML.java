/*1. Extract the transaction ID from the HTML body
<html>
<title>Test</title>
<body>
Your trnx is successful. Trnx Id is: TXN123456
</body>
</html>
Output: TXN123456
*/

package String_Manipulation;


public class HTML {
    public static void main(String[] args) {
        String HTML = "<html> <title>Test</title> <body> Your trnx is successful. Trnx Id is: TXN123456 </body> </html>";

        String[] words = HTML.split(" ");
        for (int i = 0; i < words.length; i++) {
            int flag = 0;
            String check = words[i];
            char[] ch = check.toCharArray();
            for (char c : ch) {
                if (Character.isDigit(c)) {
                    flag = 1;
                }
            }
            if (flag == 1) {
                System.out.println(check);
            }

        }

    }
}
