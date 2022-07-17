public class ExchangeElements<T extends Number> {
    T[] arr;

    ExchangeElements(T a[]) {
        arr = a;
    }

    void exchangeElement(int ind1, int ind2) {
        System.out.println("=================================================");
        System.out.println("Exchanging " + arr[ind1] + " with " + arr[ind2]);
        System.out.println("=================================================");

        T t = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = t;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
