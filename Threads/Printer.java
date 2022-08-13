public class Printer{
    Printer(){}

    public static synchronized void printName(String Name){
        for (int i = 0; i < 10; i++) {
            try{
                Thread.sleep(50);
                /* System.out.println("Thread Sleeping"); */
            }catch(Exception e){
                System.err.println(e);
            }
            System.out.print(Name);
        }
    }
}