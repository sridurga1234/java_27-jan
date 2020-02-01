class students
{
	int id;
	String name;
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		students s1=new students();
		students s2=new students();
	s1.display();
	s2.display();
	}
}