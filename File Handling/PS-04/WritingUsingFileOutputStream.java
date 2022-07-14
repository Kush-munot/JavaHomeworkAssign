import java.io.*;

public class WritingUsingFileOutputStream {
    public static void main(String[] args) {
        try{
            FileOutputStream o = new FileOutputStream("./file.txt",true);
            String s = "Hey, This is written by Kush!!";
            for(int i = 0;i < s.length(); i++){
                char c = s.charAt(i);
                int j = Character.getNumericValue(c);
                o.write(j);
            }
            o.close();
        }catch(Exception e){e.printStackTrace();}
    }
}
