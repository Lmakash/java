package jan_pac3;
class InvalidNameException extends Exception{
	public InvalidNameException(String massage){
		super(massage);
	}
	
}
 class Employee{
	private String firstName;
	private String lastName;
	public Employee(String firstName,String lastName ) throws InvalidNameException {
		validateName(firstName,"first Name");
		validateName(lastName,"last Name");
	}
	private void validateName(String name,String fieldName) throws InvalidNameException {
		if(name.trim().isEmpty()) {
			throw new InvalidNameException(fieldName+"cannot be blank");
		}
	}
}
public class lab24InvalidNameException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Employee e1=new Employee("","swami");
}catch(InvalidNameException e) {
	System.out.println("Error:"+e.getMessage());
}
	}

}
