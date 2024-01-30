package jan_pac1;
import java.util.Scanner;
public class lab_constructor {
	String firstname;
	String Lastname;
	char gender;
	
	
	
	lab_constructor(String firstname,String Lastname, char gender){
		this.firstname=firstname;
		this.Lastname=Lastname;
		this.gender=gender;
		
	
	}
	public void showdata() {
		
		System.out.println("firstname:"+firstname);
		System.out.println("Lastname:"+Lastname);
		System.out.println("gender:"+gender);
		Scanner aa=new Scanner(System.in);
		System.out.println("enter the number");
		int num=aa.nextInt();
		System.out.println("number:"+num);
	}
}
