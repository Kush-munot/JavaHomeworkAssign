import java.util.*;
class ArrayBasics{
    public static void main(String[] args) {        
        ArrayList<Double> d = new ArrayList<Double>();

        Scanner sc= new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            double s = sc.nextDouble();
            d.add(s);
        }
        
        d.add(3,9.99999);

        int l = d.lastIndexOf(9.99999);
        System.out.println("Last Index = " + l);

        Iterator<Double> itr = d.iterator();
        while(itr.hasNext()){
            double x = itr.next();
            System.out.print(x + " ");
        }        
        sc.close();
    }

}