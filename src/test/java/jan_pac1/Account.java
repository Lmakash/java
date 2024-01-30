package jan_pac1;

import java.util.UUID;

public class Account {
	
		private String accnum;
		private double balance;
		  private String person;
		  
		  public Account(String accholdername, double initalbal)
		  {
			  this.accnum=UUID.randomUUID().toString();
			  this.person=accholdername;
			  this.balance=initalbal;
		  }
		  
		  public void deposite(double amount)
		  {
			  balance+=amount;
			  System.out.println(amount+"is deposited to your accountnumber"+accnum);
		  }
		  
		  public void withdraw(double amount)
		  {
			  if(balance>=amount) {
				  balance=amount;
				  System.out.println(amount+"is withdrwan to your accountnumber"+accnum);
			  }
			  else {
				  System.out.println("Insufficiant Balance");
			  }
		  }
		  public void displaybalance() {
			  System.out.println("Accountholder:"+accnum);
			  System.out.println("Accountholdername:"+person);
			  System.out.println("balance"+balance);
		  }
	}


