class student
{
	int id;
	String name;
}
class TestStudent
{
	public static void main(String args[])
	{
		student s1=new student();
		s1.id=101;
		s1.name="rani";
		System.out.println(s1.id+" "+s1.name);
	}
}