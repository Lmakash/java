package jan_pac3;

public class Lab5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lab5_SavingAccount2 obj1 = new Lab5_SavingAccount2("Akash", 7000);
		Lab5_CurrentAccount2 obj2 = new Lab5_CurrentAccount2("sh", 4000);
		
		obj1.display();
		obj2.display();
		
		obj1.withdraw(4000);
		obj2.withdraw(1000);
	}

}
