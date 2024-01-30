package jan_pac1;
class SwipeMachine{
	void readCard() {
		System.out.println("To read normal cards");
	}
}
class ChipMachine extends SwipeMachine{
	void readCard() {
		System.out.println("To read chip cards");
	}
}
public class TC0014_overiding {
	public static void main(String[] args) {
		
		SwipeMachine normal=new SwipeMachine();
		normal.readCard();
		normal=new ChipMachine();
		normal.readCard();
	}

}
