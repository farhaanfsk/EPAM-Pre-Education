package week_2;

import java.util.ArrayList;
import java.util.Collections;
/**.
* Student operation class
* @author  Farhaan Ahmed
* @version 1.0
*/
public class Operation {
  /**.
  * Student search method that either returns the parameters of
  * Student bean or prints them
  * @return list of students
  * @param list - contains student objects
  * @param value - contains the search by value
  * @param parameter - search parameter
  */
  Student search(final ArrayList<Student> list, final String parameter, final int value) {
    for (int index = 0; index < list.size(); index++) {
      Student student;
      //System.out.println(list.get(i).getFirstName());
      if (value == 1 && list.get(index).getFirstName().equals(parameter)) {
        student = list.get(index);
        return student;
      } else if (value == 2 && list.get(index).getLastName().equals(parameter)) {
        student=list.get(index);
        return student;
      } else if (value == 3 && list.get(index).getIdNo() == Integer.parseInt(parameter)) {
        student = list.get(index);
        return student;
      } else if (value == 4 && list.get(index).getYear() == Integer.parseInt(parameter)) {
        System.out.println("The student details are:");
				System.out.println("First Name = " + list.get(index).getFirstName());
				System.out.println("Last Name = " + list.get(index).getLastName());
				System.out.println("IdNo = " + list.get(index).getIdNo());
				System.out.println("Year = " + list.get(index).getYear());
				System.out.println("Department = " + list.get(index).getDepartment());
				System.out.println();
			} else if (value == 5 && list.get(index).getDepartment().equals(parameter)) {
				System.out.println("The student details are:");
				System.out.println("First Name = " + list.get(index).getFirstName());
				System.out.println("Last Name = " + list.get(index).getLastName());
				System.out.println("IdNo = " + list.get(index).getIdNo());
				System.out.println("Year = " + list.get(index).getYear());
				System.out.println("Department = " + list.get(index).getDepartment());
				System.out.println();
			}
		}
		return null;
	}
	/**
	* sorts the student objects from the array list and
	* returns it.
	* @return list of students
	* @param list - contains student objects
	* @param value - contains the sort by value
	*/
	ArrayList<Student> sort(final ArrayList<Student> list, final int value) {
		if (value == 1) {
			Collections.sort(list, Student.StuFNameComparator);
			return list;
			} else if (value == 2) {
			Collections.sort(list, Student.StuLNameComparator);
			return list;
		} else if (value == 3) {
			Collections.sort(list, Student.StuIdComparator);
			return list;
		} else {
			return null;
		}
	}
}
