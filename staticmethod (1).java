class student
{
	 int rollno;
 	String name;
 	static String college="srm";
 	//stasic method to change the value of static variable
 	static void change()
	{
		college="crr";
	}
	student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class staticmethod
{
	public static void main(String args[])
	{
		student.change();
		student s1=new student(101,"rani");
		student s2=new student(102,"gopi");
		student s3=new student(103,"ganesh");
		s1.display();
		s2.display();
		s3.display();
	}
}