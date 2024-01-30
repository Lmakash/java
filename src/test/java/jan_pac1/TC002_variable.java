package jan_pac1;

public class TC002_variable {
	private double dblwdth;
	private double dblheight;
	private double dbldepth;

	private static int boxid=3;
	
	public double voulme() {
		dblwdth=10;
		dblheight=10;
		dbldepth=10;
		double deltemp;
		deltemp =dblwdth*dblheight*dbldepth;
		return deltemp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TC002_variable obj=new TC002_variable();
		System.out.println(obj.voulme());
		System.out.println("boxid="+boxid);

	}

}
