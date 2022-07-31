public class Main{
	public static void main(String[] args) {
		footballTeam f = new footballTeam(4);

		cricketTeam c = new cricketTeam(4,6);

		student s1 = new student(f);
		student s2 = new student(c);
		student s3 = new student(f, c);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}