import java.io.*;

public class DeserializeDemo {
   public static void main(String[] args) {
      Employee e = null;
      try {
         FileInputStream fileIn = new FileInputStream("Employee.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);

         e = (Employee) in.readObject();

         in.close();
      } catch (IOException ioe) {
         ioe.printStackTrace();
      } catch (ClassNotFoundException c) {
         System.out.println("Employee class not found");
         c.printStackTrace();
      }
      System.out.println("Deserialized Employee...");
      System.out.println("Name: " + e.name);
      System.out.println("Address: " + e.address);
      System.out.println("Id: " + e.id);
   }
}
