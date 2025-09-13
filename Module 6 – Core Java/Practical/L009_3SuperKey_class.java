package java_lab;


class human{
	
	String name;
	
	public human(String name){
		this.name=name;
		
		System.out.println("Constructor of human is called ");
		
	}
	
	public void work() {
		
		System.out.println(name+" work ");
	}
	
}


class Company extends human{
	    String company;
	    
	    
	    public Company(String name, String Comapny) {
	    	
	    	super(name);
	    	this.company=company;
	    	
	    	System.out.println("constructor of company is called");
	    	
	    	}
	    
	    public void work() {
	    	
	    	super.work();
			
			System.out.println(name+" work in " +company);
		}
		
	    }



		public class L009_3SuperKey_class {
	public static void main(String[] args) {
		
		Company LT=new Company("Rahul","Google");
		
		LT.work(); 
		
		
	}

}
