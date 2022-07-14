public class UpperBoundGen<T extends Number> {
    T item1;
    T item2;

    UpperBoundGen(T o, T p){
            item1 = o;
            item2 = p;
        }

    public T getItem1() {
        return item1;
    }

    public T getItem2() {
        return item2;
    }

    public void sum() {
        Number add = this.item1.doubleValue() + this.item2.doubleValue();
        System.out.println("Sum is : " + add);
    }
}
