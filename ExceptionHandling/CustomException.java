import java.util.*;

class MyException extends Exception {
    MyException() {
    }

    MyException(String msg) {
        super(msg);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int num = sc.nextInt();

        try {
            if (num < 0) {
                Exception e = new MyException("Negative number");
                throw e;
            } else {
                System.out.println("The positive number is: " + num);
            }
        } catch (Exception e) {
            System.out.println("Invalide number: " + e);
        }

    }
}
