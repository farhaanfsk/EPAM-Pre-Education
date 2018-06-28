package week_2;

import java.util.Comparator;

public class Student{
	private String firstName;
	private String lastName;
	private int idNo;
	private int year;
	private String department;
	Student(String firstName, String lastName, int idNo, int year, String department){
		this.firstName=firstName;
		this.lastName=lastName;
		this.idNo=idNo;
		this.year=year;
		this.department=department;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public static Comparator<Student> StuFNameComparator = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			   String StudentName1 = s1.getFirstName().toUpperCase();
			   String StudentName2 = s2.getFirstName().toUpperCase();

			   //ascending order
			   return StudentName1.compareTo(StudentName2);
		}
	};
	public static Comparator<Student> StuLNameComparator = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			   String Name1 = s1.getLastName().toUpperCase();
			   String Name2 = s2.getLastName().toUpperCase();

			   //ascending order
			   return Name1.compareTo(Name2);
		}
	};	
	public static Comparator<Student> StuIdComparator = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			   
			   return s1.getIdNo()-s2.getIdNo();
		}
	};
}
