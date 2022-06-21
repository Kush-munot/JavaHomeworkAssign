public class Main {
    public static void main(String[] args) {
        Message m1 = new SMS("123@abc", "123456789", "987654321", 3, 4);
        Message m2 = new SMS("123@abc", "123456789", "987654321", 3, 2);

        m1.compose("Hey there!!", 2000);
        m2.compose("Hey there!!", 20);

        System.out.println();
        
        Message s1 = new MMS("123@abc", "123456789", "987654321", "Audio", 400);
        Message s2 = new MMS("123@abc", "123456789", "987654321", "GIF", 20);

        s1.compose("Hey there!!", 2000);
        s2.compose("Hey there!!", 20);

        System.out.println();

        System.out.println("SMS toStrings");
        System.out.println(m1);

        System.out.println();
        
        System.out.println("MMS toStrings");
        System.out.println(s1);


    }
}
