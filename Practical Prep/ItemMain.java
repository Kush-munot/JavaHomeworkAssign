import java.util.*;

public class ItemMain {
    public static void main(String[] args) {
        ArrayList<Item> a = new ArrayList<>();
        a.add(new Item("Dant Kanti", 60));
        a.add(new Item("Nike Air", 6000));
        a.add(new Item("Puma Shoes", 5000));
        a.add(new Item("Lenskart Clip ons", 4000));

        Collections.sort(a, new sortByCost());

        Iterator<Item> itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\n\n\n");
        Collections.sort(a, new sortByName());

        itr = a.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
