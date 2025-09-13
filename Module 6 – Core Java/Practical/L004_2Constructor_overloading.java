package java_lab;


class student{
	
	String name;
	int age;
	String course;
	
	student(){
		
		name="TEST";
		age=20;	
		course="JAVA";
	}
		
		student(String name,int age ){
			
			this.name=name;
			this.age=age;
			}
		
		student(String name, int age, String course){
			
			
			this.name=name;
			this.age=age;
			this.course=course;
	}
		
		public void display() {
			
			System.out.println("name: "+name+" age: "+age+" course: "+course);
		}
}

public class L004_2Constructor_overloading {
	public static void main(String[] args) {
		
		student s1=new student();
		s1.display();
		
		student s2 = new student("test1",21);
		s2.display();

        student s3= new student("test2",20,"java");
        s3.display();
		
	}

}
