import java.io.*;

public class SerializeDemo {
   public static void main(String[] args) {
      Employee e = new Employee();
      e.name = "ABC";
      e.address = "xyz,pqr";
      e.id = 10;
      try {
         FileOutputStream fileOut = new FileOutputStream("Employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         System.out.print("Serialized data is saved in Employee.ser");
      } catch (IOException ioe) {
         ioe.printStackTrace();// method of Throwable class which prints information about exception
      }
   }
}
