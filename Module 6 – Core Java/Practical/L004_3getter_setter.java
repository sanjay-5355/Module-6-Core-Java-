package java_lab;

class persondetails{
	
	private String name;
	private int age;
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getname() {
		return name;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	
	public int getage() {
	   return age;
	}
	
}

public class L004_3getter_setter {
	 public static void main(String[] args) {
		
		 persondetails p1= new persondetails();
		 p1.setname("Java");
		 p1.setage(21);
		 
		 System.out.println("Here is your name: "+p1.getname());
		 System.out.println("Here is the age: "+p1.getage());
	} 

}
