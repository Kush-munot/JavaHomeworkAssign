import java.io.*;

public class StudentMain {
    public static void main(String[] args) {
        try {
            File f = new File("student.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                String attr[] = line.split(",");
                System.out.println(attr[1]);
                if (attr[0].length() == 0 || attr[1].length() == 0 || attr[2].length() == 0) {
                    throw new NullValueException("One of the values is null :(");
                } else {
                    Student s = new Student(attr[0], attr[1], attr[2]);
                    System.out.println(s);
                }
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
