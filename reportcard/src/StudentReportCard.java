

public class StudentReportCard extends Student {

	int total_subjects;
	int points_earned;
	float gpa;
	float cgpa;
	StudentReportCard(int studentID, String studentName, String departmentName, int semesterNo, int total_subjects, int points_earned) {
		super(studentID,studentName,departmentName,semesterNo);
		this.total_subjects=total_subjects;
		this.points_earned=points_earned;
		
	}
	float gpaCalculator()
	{
		gpa=(float)(total_subjects*points_earned)/7;
		return gpa;
	}
	float cgpaCalculator(float gpa)
	{
		cgpa=gpa/semesterNo;
		return cgpa;
	}
	void display()
	{
		float GRADEPOINTAVERAGE=gpaCalculator();
		float CUMULATIVE=cgpaCalculator( GRADEPOINTAVERAGE );
		System.out.println("Student ID : "+ studentID);
		System.out.println("Name of the student : "+ studentName);
		System.out.println("Department Name : "+ departmentName);
		System.out.println("Semester Number : "+ semesterNo);
		System.out.println("GPA Computed : "+GRADEPOINTAVERAGE);
		System.out.println("CGPA Computed : "+CUMULATIVE);
	}
}
