package jan_pac3;

public class multipletry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a=args.length;
	int b=10/a;
	System.out.println("a="+a);
	try {
		if(a==1)
			a=a/(a-a);
		if(a==2) {
			int c[]= {1};
			c[42]=99;
		}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index Out-Of-BoundsException");
	}
}catch(ArithmeticException e) {
	System.out.println("Divide by 0:"+e);
}
	}

}
