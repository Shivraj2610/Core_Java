import java.util.Scanner;

public class TernariOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int max = (a > b) ? ((a > c) ? a : c) : (b > c) ? b : c;

        System.out.println(max + " is Maximum");
    }
}
