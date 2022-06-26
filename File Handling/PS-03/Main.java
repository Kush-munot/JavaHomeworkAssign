import java.io.*;
class Main{
    public static void main(String[] args) {
        try{
            File f = new File("abc.txt");
            f.createNewFile();
            System.out.println(f);

            System.out.println(f.canRead());
            System.out.println(f.canWrite());
            System.out.println(f.canExecute());

            System.out.println(f.getName());
            System.out.println(f.getParent());
            
            System.out.println(f.toPath());
        }catch(Exception e){
            System.out.println(e);
        }

    }
}