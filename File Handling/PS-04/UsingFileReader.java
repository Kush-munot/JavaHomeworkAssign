import java.io.*;
public class UsingFileReader {
    public static void main(String[] args) {
        try{
            FileReader f = new FileReader("./file.txt");
            int i = 0;
            String s="";
            while((i=f.read())!= -1){
                s+=(char)i;
            }
            System.out.println(s);
            f.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
