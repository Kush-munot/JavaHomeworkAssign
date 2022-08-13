public class MainProducerConsumer {
    public static void main(String[] args) {
        Container a = new Container(10);
        Producer p = new Producer(a);
        Consumer c = new Consumer(a);
        p.start();
        c.start();
    }
}
