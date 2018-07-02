package week_2;

import java.util.Comparator;
/**.
* Student Bean class
* @author  Farhaan Ahmed
* @version 1.0
*/
public class Student {
  /**.
   * Student first name
   */
  private String firstName;
  /**.
   * Student last name
   */
  private String lastName;
  /**.
   * Student identification number
   */
  private int idNo;
  /**.
   * Student study year
   */
  private int year;
  /**.
   * Student department
   */
  private String department;
  /**.
   * Getter and Setter methods for each variables
   * @return
   */
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
	/**.
	 * Student First Name comparator method
	 */
	public static Comparator<Student> StuFNameComparator = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			   String StudentName1 = s1.getFirstName().toUpperCase();
			   String StudentName2 = s2.getFirstName().toUpperCase();

			   //ascending order
			   return StudentName1.compareTo(StudentName2);
		}
	};
	/**.
   * Student last Name comparator method
   */
	public static Comparator<Student> StuLNameComparator = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			   String Name1 = s1.getLastName().toUpperCase();
			   String Name2 = s2.getLastName().toUpperCase();

			   return Name1.compareTo(Name2);
		}
	};
	/**.
   * Student ID comparator method
   */
	public static Comparator<Student> StuIdComparator = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			   return s1.getIdNo() - s2.getIdNo();
		}
	};
}
