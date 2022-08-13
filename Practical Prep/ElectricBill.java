public class ElectricBill {
    int units;

    ElectricBill(int u){
        units = u;
    }

    int calCost(){
        return(units*10);
    }

    public String toString(){
        return("The units are : " + units);
    }
}