public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Atomic Habbits", "James Clear", "ABC Publisher House", 670, 750);
        Book b2 = new Book("Famous Five", "Ruskin Bond", "XYZ Publiser", 500, 1500);

        b1.displayInfo();
        b2.displayInfo();

        System.out.println();

        Book bks[] = new Book[10];
        for(int i=1;i<10;i++){
            bks[i] = new Book("Atomic Habbits"+i, "James Clear"+i, "ABC Publisher House"+i, 100*i, 150*i);
            bks[i].classifyBook();
        }
    }
}
