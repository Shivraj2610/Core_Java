
import java.util.Scanner;

public class H{
    public static void main(String arr[]) {
        Scanner scan = new Scanner(System.in);

        int n;

        System.out.println("Enter the number of row");
        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == (n - 1) / 2) {
                    System.out.print("*");
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
