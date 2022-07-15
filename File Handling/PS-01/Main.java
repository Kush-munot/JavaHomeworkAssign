import java.io.*;

class Main {
    public static void main(String[] args) {

        try (BufferedReader r = new BufferedReader(new FileReader("file.txt"));
                BufferedWriter w = new BufferedWriter(new FileWriter("out.txt"));) {

            int space = 0, words = 0, chars = 0, lines = 0;
            String line;
            while ((line = r.readLine()) != null) {
                lines++;
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ' ')
                        space++;
                    if ((line.charAt(i) >= 'a' && line.charAt(i) <= 'z')
                            || (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z'))
                        chars++;
                }
            }
            words = space + 1;
            System.out.println(
                    "Characters = " + chars + " Words = " + words + " Lines = " + lines + " Spaces = " + space);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}