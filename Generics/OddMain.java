public class OddMain {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };

        FindOdd<Integer> i = new FindOdd<>(intArray);
        i.findOdd();

        FindOdd<Double> j = new FindOdd<>(doubleArray);
        j.findOdd();
    }
}
