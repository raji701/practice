package package1;

class Parent{
	
	public void hi ()
	{
		System.out.println("hi");
	}
	
	public void morning()
	{
		System.out.println("morning");

	}
}
public class Child extends Parent {

	public void hi ()
	{
		System.out.println("hello");
	}
	
	public void hell()
	{
		System.out.println("hell");
		
	}
	
	public static void main(String args[])
	{
		
		Parent p = new Child();
		p.hi();
		
		Child c = (Child) p ;
		c.hell();
		
	
		c.morning();
	}
}
