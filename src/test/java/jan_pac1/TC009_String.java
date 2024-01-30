package jan_pac1;

public class TC009_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str1=new String("Akash");
     String str2=new String("Shendage");
     System.out.println("String1:"+str1+"---String2:"+str2);
     String str3=new String("Akash");
     String str4=str3;
     System.out.println("String1:"+str3+"---String2:"+str4);
     
     
     System.out.println("length:"+str1.length());
     System.out.println("indexof:"+str1.indexOf("s"));
     String s1="this is beautiful day";
     System.out.println(s1.trim()+"gg");
     System.out.println(s1.trim()+s1.concat("hello"));
     System.out.println(s1.trim().concat("hello"));
     System.out.println(s1.substring(8,17));
     System.out.println(str1.toUpperCase());
     System.out.println(str1.toLowerCase());
     System.out.println(str1.equals(s1));
     System.out.println(str1==s1);
     
     
     StringBuffer s2=new StringBuffer("welcome");
     System.out.println(s2.append("to 2024"));
     System.out.println(s1.concat("to 2024"));
   
     System.out.println(s2.reverse());
     
     
	}

}
