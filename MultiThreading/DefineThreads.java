
//Creating thread by Thread class
class MyThread extends Thread {
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("The name of current thread is: " + name);
        for (int i = 10; i > 0; i--) {
            System.out.println("the value of is:" + i);

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
    }
}

// Creating thread using Runnable interface
public class DefineThreads implements Runnable {

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println("The name of current thread is: " + name);
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i is: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }

        }

    }

    public static void main(String[] args) {

        String name = Thread.currentThread().getName();
        System.out.println("The name of current thread is:" + name);
        DefineThreads t1 = new DefineThreads();
        Thread thr = new Thread(t1);
        thr.start();
        thr.setName("First");
        boolean flag = thr.isAlive();
        System.out.println("the thread is alive " + flag);

        try {

            thr.join();
        } catch (Exception e) {
            // TODO: handle exception
        }

        MyThread t2 = new MyThread();
        t2.start();
        t2.setName("second");

        boolean flag1 = thr.isAlive();
        System.out.println("the thread is alive " + flag1);
    }
}
