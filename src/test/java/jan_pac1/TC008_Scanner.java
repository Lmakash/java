package jan_pac1;

import java.util.Scanner;

public class TC008_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner=new Scanner("1 2 3 4 5 6 7 8 9");
   while(scanner.hasNextInt()) {
	   int num=scanner.nextInt();
	   if(num%2==0)
	   {
		   System.out.println("even number:"+num);
	   }
	   else
	   {
		   System.out.println("this is odd num:"+num);
	   }
   }
	}

}
