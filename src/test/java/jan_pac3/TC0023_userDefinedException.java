package jan_pac3;

import java.util.Scanner;

class AgeException extends Exception
{
	private int age;
	AgeException(int a)
	{
		age=a;
	}
	public  String toString() {
		return age+"is an invalid age";
	}
	}
class emp{
	String name;
	int age;
	void getempdetails() throws AgeException {
		System.out.println("enter your name");
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		System.out.println("enter your Age");
		age=sc.nextInt();
		if(age<16) {
			throw new AgeException(age);
		}
	}
}

public class TC0023_userDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	emp e1=new emp();
	e1.getempdetails();
}catch(AgeException e){
	System.out.println(e);
}
	}

}
