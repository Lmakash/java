package jan_pac1;
import java.util.Scanner;
public class lab_10 {
	public boolean checkString()
	{
	// TODO Auto-generated method stub
			System.out.println("Enter the Statement");
			Scanner sc = new Scanner(System.in);
			String message = sc.nextLine();
			for(int i = 0 ;i < message.length() - 1;i++)
			{
				int a = (int)message.charAt(i);
				int b = (int)message.charAt(i + 1);
				if(a > b)
				{
					System.out.println("String is negative");
					return false;
				}	
			}
	
			return true;
	}
	public static void main(String[] args) {
		lab_10 aa = new lab_10();
		   boolean v = aa.checkString();
			if(v == true)
			{
				System.out.println("String is positive");
			}	// TODO Auto-generated method stub

	}

}
