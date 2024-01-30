package jan_pac1;
import java.time.LocalDate;
import java.util.Scanner;
public class lab13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date of purchase in format yyyy-mm-dd: ");
		String s1 = sc.next();
		sc.close();
		LocalDate date = LocalDate.parse(s1);
		
		LocalDate expdate = date.plusMonths(12);
		
		System.out.println("Your product warranty expire date is: "+ expdate);

	}

}
