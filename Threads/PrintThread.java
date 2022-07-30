public class PrintThread extends Thread {
    String name;
    Printer p;

    PrintThread(String name, Printer p){
        this.name = name;
        this.p = p;
    }
    public void run(){
        Printer.printName(name);
    }
}
