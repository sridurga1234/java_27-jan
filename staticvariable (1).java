class student
{
	int rollno;
	String name;
	static String college="srm university";
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
public class staticvariable{
public static void main(String args[])
{
	student s1=new student(101,"rani");
	student s2=new student(102,"gopi");
	s1.display();
	s2.display();
}
}
	