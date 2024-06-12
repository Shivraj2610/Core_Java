class Animal {
    public void type() {
        System.out.println("Mainaly animals has to types");
    }
}

class Cat extends Animal {
    public void type() {
        System.out.println("Cat is Domestic Animal");
    }
}

class tiger extends Animal {
    public void type() {
        System.out.println("Tiger is Wild Animal");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.type();

        a = new Cat();
        a.type();

        a = new tiger();
        a.type();
    }
}
