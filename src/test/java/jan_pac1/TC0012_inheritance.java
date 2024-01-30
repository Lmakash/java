package jan_pac1;

class Base_Parent{
public void basemethod()
{
	System.out.println("This is parent");}
}
class Derived_Child extends Base_Parent{
	public void Derivedmethod() {
		super.basemethod();
		System.out.println("This is child");
	}
}

public class TC0012_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived_Child obj=new Derived_Child();
		obj.Derivedmethod();
		if(obj instanceof Base_Parent) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
