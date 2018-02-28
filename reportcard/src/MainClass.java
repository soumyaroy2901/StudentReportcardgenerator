
import java.util.*;
public class MainClass {
	static int ch=0;
	static boolean validateInputs(int studentID, int semNumber, int total_subjects, int points_earned)
	{
		if(studentID<999||studentID>10000)
		{
			ch=1;
		}
		if(semNumber<1 || semNumber>7)
		{
			ch=1;
		}
		if(total_subjects<1 || total_subjects>7)
		{
			ch=1;
		}
		if(points_earned<1 || points_earned>20)
		{
			ch=1;
		}
		
		if(ch==1)
		return false;
		else
			return true;
	}
	@SuppressWarnings("resource")
	public static void main(String abcd[]) {
		Scanner sc=new Scanner(System.in);
		int stID=sc.nextInt();
		String name=sc.next();
		int sem=sc.nextInt();
		String deptname=sc.next();
		int sub=sc.nextInt();
		int points=sc.nextInt();
		
		boolean b=validateInputs(stID,sem,sub,points);
		if (b==true)
		{
			StudentReportCard reportObject =new StudentReportCard(stID,name,deptname,sem,sub,points);
			reportObject.display();
		}
		else
			System.out.println("Invalid Request");

	}

}
