import java.util.Comparator;

public class sortByCost implements Comparator<Product> {
    public int compare(Product a, Product b){
        if(a.getCost() > b.getCost())
            return 1;
        else if(a.getCost() < b.getCost())
            return -1;
        else
            return 0;
    }
}
