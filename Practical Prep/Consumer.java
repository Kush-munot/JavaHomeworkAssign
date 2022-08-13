public class Consumer extends Thread {
    Container q;

    Consumer(Container w) {
        q = w;
    }

    public void run() {
        synchronized (q) {
            while (true) {
                try {
                    if (q.available == false) {
                        q.wait();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("Read = " + q.getN());
                q.available = false;
                q.notify();
            }
        }
    }
}
