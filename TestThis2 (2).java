class student
{
	int rollno;
	String name;
	float fee;
	student(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
}
	class TestThis2{
	public static void main(String args[])
	{
		student s1=new student(101,"rani",10000f);
		student s2=new student(102,"gopi",7000f);
		s1.display();
		s2.display();
	}
	}
