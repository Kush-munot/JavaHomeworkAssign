import java.util.Comparator;

public class sortByName implements Comparator<Item> {
    public int compare(Item a, Item b){
        return(a.name.compareTo(b.name));
    }
}
