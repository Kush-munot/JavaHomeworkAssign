public class Main {
    public static void main(String[] args) {
        Generics<Integer> i1 = new Generics<Integer>(100);

        Generics<String> i2 = new Generics<String>("Kush here!!");

        i1.print();
        i2.print();
    }
}
