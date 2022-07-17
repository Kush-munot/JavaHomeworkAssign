public class RelativeMain {
    public static void main(String[] args) {
        Integer[] li = {3, 4, 6, 8, 11, 15, 28, 32};
        Integer[] c = {7, 18, 19, 25};

        RelativePrime<Integer> r = new RelativePrime<>(li);

        r.findFirst(c, 4, 5);
    }
}
