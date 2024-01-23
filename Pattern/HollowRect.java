
import java.util.Scanner;


public class HollowRect{

    public static void main(String arr[]) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Enter number");
        num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || j == 0 || i == num - 1 || j == num - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
