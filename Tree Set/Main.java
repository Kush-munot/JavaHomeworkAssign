import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> t = new TreeSet<Student>();
        t.add(new Student(47, 4, "Kush Munot", "123456789"));
        t.add(new Student(48, 4, "Jai Munot", "123456719"));
        t.add(new Student(49, 4, "Zayan Munot", "123456729"));
        t.add(new Student(40, 4, "Wish Munot", "123456739"));
        t.add(new Student(40, 6, "Wishey Munot", "123256739"));

        System.out.println(t);
    }

}
