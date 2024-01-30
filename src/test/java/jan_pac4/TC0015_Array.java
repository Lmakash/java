package jan_pac4;

import java.util.Arrays;

public class TC0015_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[];
      arr=new int[2];
      arr[0]=4;
      arr[1]=5;
      System.out.println(arr[0]);
      System.out.println(arr[1]);
     
      int arr1[]= {1000,500,3000,440,550};
      Arrays.sort(arr1);
      //foreach
      for(int i:arr1)
      {
    	  System.out.println(i);
      }
     //For loop 
      for(int i=0;i<arr1.length;i++)
      {
    	  System.out.println("for loop"+arr1[i]);
      }
      System.out.println(arr1.length);
      System.out.println(arr1[1]);
      
      //Two Dimenssion Array
      int twodim[][]=new int[2][2];
      System.out.println("Two dim length:"+twodim.length);
      String twodim1[][]=new String[2][2];
      twodim1[0][0]="Apple";
      twodim1[0][1]="Apple1";
      twodim1[1][0]="Apple2";
      twodim1[1][1]="Apple3";
      System.out.println(twodim1[0][1]);
      
	}

}
