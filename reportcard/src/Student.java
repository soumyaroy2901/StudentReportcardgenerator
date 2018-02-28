

public class Student {
	int studentID;
	String studentName;
	String departmentName;
	int semesterNo;
	
	Student(int studentID, String studentName, String departmentName, int semesterNo)
	{
		this.studentID=studentID;
		this.studentName=studentName;
		this.departmentName=departmentName;
		this.semesterNo=semesterNo;
	}
	void display()
	{
		System.out.print("Student ID :"+ studentID);
		System.out.print("Name of the student :"+ studentName);
		System.out.print("Department Name :"+ departmentName);
		System.out.print("Semester Number :"+ semesterNo);
	}
}
