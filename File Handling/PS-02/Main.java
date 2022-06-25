import java.io.*;

class Main{
    public static void main(String[] args) {
        try{
            FileInputStream f = new FileInputStream("one.txt");
            FileOutputStream w = new FileOutputStream("two.txt");
            int i=0;
            while((i = f.read())!= -1){
                w.write(i);
            }
            f.close();
            w.close();
        }catch(IOException e){System.out.println(e);}
    }
}