package jan_pac1;

class Parent{
	void show() {
		System.out.println("this is parent show");
	}
}
class child extends Parent{
	@Override
	void show() {
		System.out.println("this is child show");	
	}
}
public class TC00_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent obj1=new Parent();
		obj1.show();
		child obj2=new child();
		obj2.show();
		
	}

}
