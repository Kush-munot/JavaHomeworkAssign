import java.util.*;

public class Electricity {
    public static void main(String[] args) {
        ArrayList<ElectricBill> arr = new ArrayList<>();
        String months[] = {"Jan", "Feb", "March", "April", "May", "June", "July"};
        arr.add(new ElectricBill(100));
        arr.add(new ElectricBill(120));
        arr.add(new ElectricBill(130));
        arr.add(new ElectricBill(140));
        arr.add(new ElectricBill(160));

        int i=0;
        Iterator<ElectricBill> itr = arr.iterator();
        while(itr.hasNext()){
            System.out.println("Electric Bill of " + months[i] + " month is "+itr.next().calCost());
            i++;
        }

    }
}
