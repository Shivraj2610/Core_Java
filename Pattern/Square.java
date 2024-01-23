
import java.util.Scanner;

public class Square {

    public static void main(String arr[]) {

        int n;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number");
        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
