import java.util.*;
import java.time.*;

public class voterId {
	public static void main(String[] args) {
		String name, dobs, city;
		int day,month,year;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name: ");
		name = sc.nextLine();
		System.out.println("Enter city: ");
		city = sc.nextLine();
		System.out.println("Enter date of birth's date: dd/mm/yy ");
		dobs = sc.nextLine();

		String arr[] = dobs.split("/");
		day = Integer.parseInt(arr[0]);
		month = Integer.parseInt(arr[1]);
		year = Integer.parseInt(arr[2]);

		LocalDate dob =  LocalDate.of(year,month,day);
		LocalDate curD = LocalDate.now();

		Period period = Period.between(dob, curD);
		int diff = period.getYears();
		System.out.println(diff);

	}
}