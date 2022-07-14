import java.io.*;

public class UsingBufferedWriter {
    public static void main(String[] args) {
        try{
            File f = new File("file.txt");
            FileWriter t = new FileWriter(f);
            BufferedWriter o = new BufferedWriter(t);
            String s = "Hi There : )";
            o.write(s);

            System.out.println(s);       
            o.close();
        }catch(Exception e){e.printStackTrace();}
    }
}
