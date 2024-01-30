package jan_pac1;
import java.util.Scanner;
public class lab9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
	String s1=sc.nextLine();
	System.out.println("--Conctination String--");
	String s2=s1;
		System.out.println(s1+s1);
		                                                                 
		
	System.out.println(" ----repleace odd position #----");
	    for(int i=0;i<s1.length();i++)
		       {
		    	if(i%2!=0) {
		           System.out.print("#");
		    	   }  
		    	else {
		    		System.out.print(s1.charAt(i));
		    	}
		       }
			 System.out.println("-------duplicate remove character --");
	String str=new String();
	int length=s1.length();
	for(int i=0;i<length;i++)
	{
		char charAtPosition =s1.charAt(i);
		if(str.indexOf(charAtPosition)<0) {
			str+=charAtPosition;	
		}
	}
		System.out.println("after duplicate wordremove:"+str);
		
		System.out.println("-------odd number character replace UpperCase--");
		String newstr=new String();
		for(int j=0;j<s1.length();j++) {
			char ch=s1.charAt(j);
			if(j%2 != 0) {
				System.out.print(ch);
			}
			else {
				System.out.print(Character.toUpperCase(ch));
			}
		}
		}
	}


