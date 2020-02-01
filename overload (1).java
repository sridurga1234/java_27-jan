class overload
{
	int id;
	String name;
	int age;
	overload(int i,String n)
	{
		id=1;
		name=n;
	}
	overload(int i,String n,int a)
	{
		id=1;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String args[])
	{
		overload s1=new overload(101,"rani");
		overload s2=new overload(102,"gopi",76);
		s1.display();
		s2.display();
	}
}