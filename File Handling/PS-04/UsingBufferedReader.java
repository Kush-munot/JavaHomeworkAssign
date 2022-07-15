import java.io.*;
class usingBufferedReader{
    public static void main(String[] args) {
        try{
            BufferedReader o = new BufferedReader(new FileReader("file.txt"));
            String s = o.readLine();

            System.out.println(s);       
            o.close();
        }catch(Exception e){e.printStackTrace();}
    }
}    