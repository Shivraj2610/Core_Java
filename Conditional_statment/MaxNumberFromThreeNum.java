import java.util.*;

public class MaxNumberFromThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter three numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is Msximum");
            } else {
                System.out.println(c + " is Maximum");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is Maximum");
            } else {
                System.out.println(c + " is Maximum");
            }
        }
    }
}