
class Demo {

    Demo() {
        System.out.println("this is non-parameterised constructor in Demo Class");
    }

    Demo(int a) {
        this();
        System.out.println(a);
    }
}

class Fun extends Demo {
    Fun() {
        super();
        System.out.println("Constructor of Fun class");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Demo d = new Demo(5);
        Fun f = new Fun();
    }
}
