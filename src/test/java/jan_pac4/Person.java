package jan_pac4;


 class Person {
	private String fname;
	private String lname;
	public Person(String fname,String lname)
	{
		if(fname==null && lname==null)
		{
			throw new IllegalArgumentException("Both names cannot be Null");
			
		}else {
		this.fname=fname;
		this.lname=lname;
		}
	}
	public String getFullName() {
		String first = (this.fname != null)?this.fname:"?";
		String last=(this.fname !=null)?this.lname:"?";
		return first+" "+last;
	}
	public String getfname() {
		return this.fname;
	}
	public String setfname() {
		return this.fname=fname;
	}
	
	public String getlname() {
		return this.lname;
	}
	public String setlname() {
		return this.lname=lname;
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
      Person p=new Person("akash","shendage");
      System.out.println(p.getfname());
      System.out.println(p.getlname());
		System.out.println(p.getFullName());
	}*/

}
 
