
public class MethodOverloading {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int ans = sum(2, 4);
        System.out.println(ans);

        double res = sum(2.4, 4);
        System.out.println(res);

        // Automatic promotion in overloading
        char a = 'a';
        int ans1 = sum(2, a);
        System.out.println(ans1);
    }
}
