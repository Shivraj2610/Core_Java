import java.util.*;

public class A {

    public static void main(String arr[]) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.println("Enter num");
        num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || j == 0 || j == num - 1 || i == (num - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
