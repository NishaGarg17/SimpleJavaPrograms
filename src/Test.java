import java.util.Arrays;

class Student{  
	int rollno;  
	static String name;  
	float fee; 
	final int data;
	{
		data = 100;
	}
	Student(int rollno,String name,float fee){  
		this.rollno=rollno;  
		Student.name=name;  
		this.fee=fee;  
		System.out.println(rollno+" "+name+" "+fee+"data: " + data);
	}  
	static {
		System.out.println("Hello");
		name = "ITS";
	}
	Student() {
		
	}
	void display(){System.out.println(rollno+" "+name+" "+fee);
	}  
}  
class Test{  

	static {
		System.out.println("Hifi");

	}
public static void main(String args[]){  
	System.out.println("Hiiiis");
Student s1=new Student(111,"ankit",5000f);  
Student s2=new Student(112,"sumit",6000f);  
s1.display();  
s2.display();  
int[] a = {1,2};
System.out.println(a);
System.out.println(String.valueOf(a));
System.out.println(Arrays.toString(a));

}}  

class Test1 extends Student {
	
}