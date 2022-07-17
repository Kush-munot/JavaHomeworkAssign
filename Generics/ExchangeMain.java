public class ExchangeMain{
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        ExchangeElements<Integer> i = new ExchangeElements<>(intArray);
        i.exchangeElement(4,9);

    }
}