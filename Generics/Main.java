public class Main {
    public static void main(String[] args) {
        Generics<Integer> i1 = new Generics<Integer>(100);

        Generics<String> i2 = new Generics<String>("Kush here!!");

        UpperBoundGen<Double> u1 = new UpperBoundGen<Double>(12.2, 15.3);

        i1.print();
        i2.print();

        u1.sum();
    }
}
