class students1
{
	int id;
	String name;
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		students1 s1=new students1(12,"rani");
		students1 s2=new students1(16,"gopi");
	s1.display();
	s2.display();
	}
}