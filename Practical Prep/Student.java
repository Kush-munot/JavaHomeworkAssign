public class Student {
    String name,rollNo,city;

    Student(String name, String rollNo, String city){
        this.city = city;
        this.name = name;
        this.rollNo = rollNo;
    }

    public String toString(){
        return("Name = " + name + " City = " + city + " Roll Number = " + rollNo);
    }
}
