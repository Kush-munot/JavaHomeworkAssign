import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;
        while(!((s = sc.nextLine()).equals("null"))){
            System.out.println("Entered Candidate is = "+ s);
            Election.updateVotes(s);
        }
        Election.countVotes();
        sc.close();
    }
}
