class MyThread extends Thread {
    public void run() {
        // Task for the Thread
        System.out.println("This is User defined Thread");
    }
}

public class ThreadOperation {
    public static void main(String[] args) {
        System.out.println("Program is started...");
        int a = 26;
        System.out.println("The value of a is: " + a);

        Thread.currentThread().setName("MyMain");
        String name = Thread.currentThread().getName();
        System.out.println("The Running thread is: " + name);

        // Start User defined thread
        MyThread t = new MyThread();
        t.start();

        System.out.println("Program is ended..");
    }
}
