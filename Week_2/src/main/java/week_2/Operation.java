package week_2;

import java.util.ArrayList;
import java.util.Collections;

public class Operation {
	Student search(ArrayList<Student> list,String parameter,int value)
	{
		for(int index=0;index<list.size();index++) {
			Student student;
			//System.out.println(list.get(i).getFirstName());
			if(value==1 && list.get(index).getFirstName().equals(parameter)) {
				student=list.get(index);
				return student;
			}
			else if(value==2 && list.get(index).getLastName().equals(parameter)) {
				student=list.get(index);
				return student;
			}
			else if(value==3 && list.get(index).getIdNo()==Integer.parseInt(parameter)) {
				student=list.get(index);
				return student;
			}
			else if(value==4 && list.get(index).getYear()==Integer.parseInt(parameter)) {
				System.out.println("The student details are:");
				System.out.println("First Name = "+list.get(index).getFirstName());
				System.out.println("Last Name = "+list.get(index).getLastName());
				System.out.println("IdNo = "+list.get(index).getIdNo());
				System.out.println("Year = "+list.get(index).getYear());
				System.out.println("Department = "+list.get(index).getDepartment());
				System.out.println();
				
			}
			else if(value==5 && list.get(index).getDepartment().equals(parameter)) {
				System.out.println("The student details are:");
				System.out.println("First Name = "+list.get(index).getFirstName());
				System.out.println("Last Name = "+list.get(index).getLastName());
				System.out.println("IdNo = "+list.get(index).getIdNo());
				System.out.println("Year = "+list.get(index).getYear());
				System.out.println("Department = "+list.get(index).getDepartment());
				System.out.println();
				
			}
		}
		return null;
	}
	ArrayList<Student> sort(ArrayList<Student> list,int value) {
		if(value==1) {
			Collections.sort(list,Student.StuFNameComparator);
			return list;
			}
		else if(value==2) {
			Collections.sort(list,Student.StuLNameComparator);
			return list;
		}
		else if(value==3) {
			Collections.sort(list,Student.StuIdComparator);
			return list;
		}
		else {
			return null;
		}
	}
}
