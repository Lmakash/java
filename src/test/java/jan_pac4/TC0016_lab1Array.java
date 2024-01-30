package jan_pac4;

import java.util.Arrays;

public class TC0016_lab1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String arr1[]= {"Pen","Notebook","Book","Laptop"};
   System.out.println("-----------Before sorting----------");
   for(String s:arr1)
   {
	   System.out.println(s);
   }
   System.out.println("-----------After sorting----------");
   Arrays.sort(arr1);
   for(String s:arr1)
   {
	   System.out.println(s);
   }
   
	}

}
