
class Demo {
    public void method1() throws Exception {
        method2();
    }

    public void method2() throws Exception {
        int res = 10 / 0;
        System.out.println(res);
    }
}

public class DuckingException {
    public static void main(String[] args) {
        Demo d = new Demo();

        try {
            d.method1();
        } catch (Exception e) {
            System.out.println("Exception is accured: " + e);
        }

    }
}
