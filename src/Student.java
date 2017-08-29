package week6;

public class Student {
	
	private int id;
	private String name;
	
	private static int numStudent = 0;

	public Student(int id, String name){
		this.id = id;
		this.name = name;
		
		numStudent++;
	}
	
	public Student(int id){
		this.id = id;
		
		//numStudent++;
	}
	
	public static int getNumStudent(){
		return numStudent;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Boolean equals(Student student){
		if(this.id == student.id){
			return true;
		}
		return false;
	}
}
