
import java.util.*;

public class HandlingException {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        try {
            int result = a / 0;
        } catch (Exception e) {
            System.out.println("Exception Handled by catch block: " + e);
        } finally {
            sc.close();
        }
    }
}
