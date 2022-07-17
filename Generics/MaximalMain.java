public class MaximalMain {
    public static void main(String[] args) {
        Integer[] intArray = { 1, 12, 3, 4, 15, 6, 71, 8, 19, 10 };

        FindMaximal<Integer> i = new FindMaximal<>(intArray);
        i.findMaximal(1,7);
    }
}
