import java.util.*;

public class sortByCost implements Comparator<Item> {
    public int compare(Item a, Item b) {
        if (a.cost > b.cost) {
            return 1;
        } else if (a.cost < b.cost) {
            return -1;
        } else {
            return 0;
        }
    }
}
