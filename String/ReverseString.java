import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String str = sc.next();

        String ans = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            ans += str.charAt(i);
        }

        System.out.println("The reverse String is: " + ans);
    }
}
