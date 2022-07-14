import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> a = new ArrayList<>();
        a.add(new Product("Nirma", "HUL", 200, 10));
        a.add(new Product("Medimix", "Patanjali", 90, 5));
        a.add(new Product("Nike Air", "Nike", 5000, 60));
        a.add(new Product("Puma Pegasus", "Puma", 7000, 70));
        a.add(new Product("Dell Laptop", "Dell", 70000, 50));
        a.add(new Product("T-Shirt", "Zudio", 999, 10));

        //PRINTING THE ARRAYLIST
        System.out.println("----------------------------------------------");
        System.out.println("Printing the ArrayList Using Iterator");
        System.out.println("----------------------------------------------");
        Iterator <Product> itr = a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //PRINTING THE ARRAYLIST OF ITEMS WITH DISCOUNT GREATER THAN 50%
        ArrayList<Product> fifty = new ArrayList<>();
        itr = a.iterator();
        while(itr.hasNext()){
            Product e = itr.next();
            if(e.getDisc() >= 50){
                fifty.add(e);
                double disCost = e.getCost() - ((e.getCost() * e.getDisc())/100);
                System.out.println("Discounted Cost : " + disCost);
            }
        }
        System.out.println("----------------------------------------------");
        System.out.println("Printing products with discount more than 50%");
        System.out.println("----------------------------------------------");
        itr = fifty.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //SORTING ACCORDING TO COST
        System.out.println("----------------------------------------------");
        System.out.println("Printing in Sorted Order According to Cost\n");
        System.out.println("----------------------------------------------");
        Collections.sort(a, new sortByCost());
        itr = a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //SORTING ACCORDING TO MANUFACTURER
        System.out.println("----------------------------------------------");
        System.out.println("Printing in Sorted Order According to Manufacturer\n");
        System.out.println("----------------------------------------------");
        Collections.sort(a, new sortManuf());
        itr = a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
