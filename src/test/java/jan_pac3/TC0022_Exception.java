package jan_pac3;

public class TC0022_Exception {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		try{
		String str=null;
		str.equals("hello");
		}
		catch(Exception e) {
			System.out.println("Exception is:"+e);
		}
		finally {
			System.out.println("Hello");
		}
		Thread.sleep(300);
		System.out.println("welcome");

	}

}
