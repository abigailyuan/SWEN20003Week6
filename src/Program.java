package week6;
import java.util.*;


public class Program {
	
	public static void main(String args[]){
		
		Student student1 = new Student(1, "Alice");
		System.out.println("Number of students: " + Student.getNumStudent());
	
		Student student2 = new Student(2);
		System.out.println("Number of students: " + Student.getNumStudent());
	
		student1.setName("Bob");
		
		
		
		Student student3 = new Student(2);
		
		Student student4 = student3;
		
		System.out.println(student3 == student4);
		System.out.println(student3.equals(student2));
		
		String s1 = "aaa";
		String s2 = new String("aaa");
		System.out.println(s1.equals(s2));
	}

	
	
}
