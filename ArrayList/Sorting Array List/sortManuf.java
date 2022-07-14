import java.util.Comparator;

public class sortManuf implements Comparator<Product> {
    public int compare(Product a, Product b) {
        return a.getManuf().compareTo(b.getManuf());
    }
}
