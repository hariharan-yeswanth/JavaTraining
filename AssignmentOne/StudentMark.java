package AssignmentOne;
class Student{
	String Name="Hari";
	int RollNo=39;
}
class Exam extends Student{
	int maths=100;
	int tamil=90;
	int english=95;
}
class Result extends Exam{
	int totalMarks;
	public int CalculateMarks() {
		return this.totalMarks+=super.maths+super.tamil+super.english;
	}
	
}
public class StudentMark {
	public static void main(String[] args) {
		Result result=new Result();
		System.out.println("The total marks is ");
		System.out.println(result.CalculateMarks());
	}
}
