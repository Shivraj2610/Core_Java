
interface Vehical {
    void how();
}

class Bike implements Vehical {
    public void how() {
        System.out.println("Travel by Bike");
    }
}

class Cycle implements Vehical {
    public void how() {
        System.out.println("Travel by Cycle");
    }
}

class Travel {
    public void how(Vehical v) {
        v.how();
    }
}

public class Interface {
    public static void main(String[] args) {
        Vehical c = new Cycle();
        Vehical b = new Bike();
        Travel tr = new Travel();
        tr.how(b);
    }
}
