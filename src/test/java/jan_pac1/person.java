package jan_pac1;

class Person{
	  public String name;
	  public float age;
	public Person(String name, float age) {
		
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}

@Override
	public String toString() {
		return "Person2_1 [name=" + name + ", age=" + age + "]";
	}
}
