import java.io.*;
class usingBufferedReader{
    public static void main(String[] args) {
        try{
            File f = new File("file.txt");
            FileReader t = new FileReader(f);
            BufferedReader o = new BufferedReader(t);
            String s = o.readLine();

            System.out.println(s);       
            o.close();
        }catch(Exception e){e.printStackTrace();}
    }
}    