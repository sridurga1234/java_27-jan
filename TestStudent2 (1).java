class student
{
 	int rollno;
	String name;
	void insertData(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void displayInformation()
	{
		System.out.println(rollno+" "+name);
	}
}
	class TestStudent2
	{
		public static void main(String args[])
		{
			student s1=new student();
			student s2=new student();
			s1.insertData(101,"rani");
			s2.insertData(102,"gopi");
			s1.displayInformation();
			s2.displayInformation();
		}
	}