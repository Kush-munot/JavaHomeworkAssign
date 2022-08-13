public class Item {
    String name;
    int cost;

    Item(String n, int c) {
        name = n;
        cost = c;
    }

    public String toString() {
        return ("Item Name = " + name + " Cost = " + cost);
    }
}
