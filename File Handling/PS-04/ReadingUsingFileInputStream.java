import java.io.*;

public class ReadingUsingFileInputStream{
    public static void main(String[] args) {
        try{
            FileInputStream f = new FileInputStream("./file.txt");
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