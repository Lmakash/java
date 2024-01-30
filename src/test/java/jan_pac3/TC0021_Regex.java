package jan_pac3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TC0021_Regex {

	public static void main(String[] args) {
		String str1="welcome";
		String pattern="welcome";
		boolean patternmatch=Pattern.matches(str1,pattern);
		System.out.println("Matching:"+patternmatch);

		String input="Shop,Mop,Hopping,Chopping";
		Pattern p1=Pattern.compile("pin");
		Matcher m1=p1.matcher(input);
		System.out.println(m1.matches());
		while(m1.find()){
			System.out.println(m1.group()+":"+m1.start()+":"+m1.end());
		}
		String email="akash1233@gmail.com";
		String n1="0123456789";
		String s1="Welcome to Amazon 12345";
		String Adharcardnumber="1234 8081 2089";
		Pattern Adharcard=Pattern.compile("^[0-9][0-9][0-9][0-9]\\s[0-9][0-9][0-9][0-9]\\s[0-9][0-9][0-9][0-9]");
		Pattern emailpattern=Pattern.compile("^(.+)@(\\S+)$");
		//Pattern emailpattern=Pattern.compile("^(.+)@(\\S+).com");
		//Pattern emailpattern=Pattern.compile("^(.+)@(\\S).*(.com)$");
		Pattern p2=Pattern.compile("^[A-Z].*[0-9]$");
		//Pattern p3=Pattern.compile("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d");
		Pattern p3=Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]");
		Matcher m2=p2.matcher(s1);
		Matcher m3=p3.matcher(n1);
		Matcher m4=emailpattern.matcher(email);
		Matcher m5=Adharcard.matcher(Adharcardnumber);
		if(m5.find()) {
			System.out.println("adhar number Pattern matched");
			
		}
		else {
			System.out.println("adhar number Pattern not matched");
		}
		if(m4.find()) {
			System.out.println("email Pattern matched");
			
		}
		else {
			System.out.println("email Pattern not matched");
		}
		if(m3.find()) {
			System.out.println("phone number Pattern matched");
			
		}
		else {
			System.out.println("phone numberPattern not matched");
		}
		if(m2.find()) {
			System.out.println("Pattern matched");
			
		}
		else {
			System.out.println("Pattern not matched");
		}
	}

}
