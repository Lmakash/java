package jan_pac1;

 interface simplecalc {
		int add(int a,int b);
	}
	public class TC0017_Interface implements simplecalc{
		public int add(int a, int b) {
				return a+b;
		}
	public static void main(String[] args) {
		TC0017_Interface c1=new TC0017_Interface();
		System.out.println(c1.add(10,10));
	}

}
