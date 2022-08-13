public class SwapMain {
    public static void main(String[] args) {
        GenericSwap<Integer> i = new GenericSwap<Integer>(10, 100);
        System.out.println(i);
        i.swap();
        System.out.println(i);

        GenericSwap<Double> d = new GenericSwap<Double>(1.90, 10.80);
        System.out.println(d);
        d.swap();
        System.out.println(d);
    }
}
