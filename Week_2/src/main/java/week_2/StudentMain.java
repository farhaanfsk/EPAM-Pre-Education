package week_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line="";
		Student student;
		ArrayList<Student> list = new ArrayList<Student>();
		BufferedReader br;
		try {
		br = new BufferedReader(new FileReader("C:\\Users\\Farhaan\\Documents\\data.csv"));
		 while ((line = br.readLine()) != null) {
			// list.add(line.split(","));
			 String[] split= line.split(",");
			 student = new Student(null, null, 0, 0, null);
				 student.setFirstName(split[0]);
				 student.setLastName(split[1]);
				 student.setIdNo(Integer.parseInt(split[2]));
				 student.setYear(Integer.parseInt(split[3]));
				 student.setDepartment(split[4]);
			 list.add(student);
			 //System.out.println();
		 }
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//for(int i=0;i<list.size();i++) {
			//System.out.println(stud.getFirstName());
		//}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the option for operation: \n1.Search Student \n2.Sort Student");
		int operation=sc.nextInt();
		Operation op = new Operation();
		if(operation==1) {
			System.out.println("enter the option to search for: \n1.First Name \n2.Last Name \n3.IdNo \n4.year \n5.Branch\n");
			int searchValue= sc.nextInt();
			System.out.print("Enter the student detail to search : ");
			String name=sc.next();
			
			student=op.search(list, name, searchValue);
			if(student!=null && searchValue !=4 && searchValue!=5) {
				System.out.println("The student details are:");
				System.out.println("First Name = "+student.getFirstName());
				System.out.println("Last Name = "+student.getLastName());
				System.out.println("IdNo = "+student.getIdNo());
				System.out.println("Year = "+student.getYear());
				System.out.println("Department = "+student.getDepartment());
			}
			else if(searchValue !=4 && searchValue!=5){
				System.out.println("Student not found");
			}
		}
		else if(operation==2){
			System.out.println("Enter option to sort by: \n1.First Name \n2.Last Name \n3.IdNo");
			int sortValue=sc.nextInt();
			op.sort(list, sortValue);
			System.out.println("The student details are:");
			for(int index=0;index<list.size();index++) {
				System.out.println("First Name = "+list.get(index).getFirstName());
				System.out.println("Last Name = "+list.get(index).getLastName());
				System.out.println("IdNo = "+list.get(index).getIdNo());
				System.out.println("Year = "+list.get(index).getYear());
				System.out.println("Department = "+list.get(index).getDepartment());
				System.out.println();
				
			}
		}
		sc.close();
	}

}
