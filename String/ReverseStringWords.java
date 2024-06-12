
import java.util.*;

public class ReverseStringWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = sc.nextLine();

        String arr[] = str.split(" ");

        String ans = "";
        for (String word : arr) {
            for (int i = word.length() - 1; i >= 0; i--) {
                ans += word.charAt(i);
            }
            ans += " ";
        }

        System.out.println("The answer is: " + ans);
    }
}
