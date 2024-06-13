class Company {
    int n;
    boolean flag = false;

    synchronized public void produce_item(int n) throws Exception {

        if (flag)
            wait();

        this.n = n;
        System.out.println("Produce: " + this.n);
        flag = true;
        notify();
    }

    synchronized public int consume_items() throws Exception {

        if (!flag)
            wait();
        System.out.println("Consume: " + this.n);
        flag = false;
        notify();
        return this.n;
    }
}

class Producer extends Thread {
    Company c;

    Producer(Company c) {
        this.c = c;
    }

    public void run() {
        int i = 1;
        while (true) {

            try {
                this.c.produce_item(i);
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
            i++;
        }
    }
}

class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;
    }

    public void run() {

        while (true) {

            try {
                this.c.consume_items();

                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Company com = new Company();

        Producer p = new Producer(com);
        Consumer c = new Consumer(com);

        p.start();
        c.start();
    }
}
