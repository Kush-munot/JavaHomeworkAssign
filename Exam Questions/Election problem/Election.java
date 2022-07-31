public class Election{
    static String Voters[] = {"Kush", "Jay", "Veer", "Vidya"};
    static int Votes[] = {0,0,0,0};

    static void updateVotes(String n){
        for (int i = 0; i < Voters.length; i++) {
            if(Voters[i].equals(n)){
                Votes[i]++;
            }
        }
    }

    static void countVotes(){
        for (int i = 0; i < Voters.length; i++) {
            System.out.println("Candidate : " + Voters[i] + " Votes : " + Votes[i]);
        }
    }
}