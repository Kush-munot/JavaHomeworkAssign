public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Kush", "Male", "Nagpur", "Indian", 47, 92);

        s1.takeAdmission(true, 154500, true);
        s1.takeAdmission(true, 124500, true);
        s1.takeAdmission(false, 154500, true);
        s1.takeAdmission(true, 154500, false);
    }
}
