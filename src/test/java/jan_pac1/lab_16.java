package jan_pac1;




public class lab_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Account smith=new Account("Smith",2000);
   Account kathy=new Account("kathy",3000);
   smith.deposite(2000);
   kathy.withdraw(2000);
   
   smith.displaybalance();
   kathy.displaybalance();
	}

}
