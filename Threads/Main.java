public class Main {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        PrintThread th1 = new PrintThread("*", p1);
        PrintThread th2 = new PrintThread("=", p1);
        PrintThread th3 = new PrintThread("?", p1);
        th1.start();
        th2.start();
        th3.start();
    }
}
