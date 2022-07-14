import java.io.Serializable;

public class Employee implements Serializable {
    String name,address;
    int id;

    Employee(){}
    Employee(String name,String address, int id){
        this.address = address;
        this.id = id;
        this.name = name;
    }

}
