public class GenericSwap<T extends Number> {
    T a, b;

    GenericSwap(T c, T d) {
        a = c;
        b = d;
    }

    void swap() {
        T temp = a;
        a = b;
        b = temp;
    }

    public String toString() {
        return ("value of a = " + a + " value of b = " + b);
    }
}
