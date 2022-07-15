import java.io.*;

public class UsingBufferedWriter {
    public static void main(String[] args) {
        try{
            BufferedWriter o = new BufferedWriter(new FileWriter("file.txt"));
            String s = "Hi There : )";
            o.write(s);

            System.out.println(s);       
            o.close();
        }catch(Exception e){e.printStackTrace();}
    }
}
