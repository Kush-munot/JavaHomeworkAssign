public class Producer extends Thread {
    Container q;

    Producer(Container w) {
        q = w;
    }

    public void run() {
        int i = 0; //
        synchronized (q) {
            while (true) {
                if (q.available == true) {
                    try {
                        q.wait();
                    } catch (InterruptedException e) {

                    }
                }
                i++;
                q.setN(i);
                System.out.println("Put " + i);
                q.available = true;
                q.notify();
            }
        }
    }
}
