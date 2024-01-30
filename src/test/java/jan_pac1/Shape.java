package jan_pac1;
abstract class shapes{
	abstract void draw() ;
}
class Rectange extends shapes{
	@Override
	void draw() {
		System.out.println("Draw rhe Rectange");
	}
}
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectange r1=new Rectange();
		r1.draw();
	}

}
