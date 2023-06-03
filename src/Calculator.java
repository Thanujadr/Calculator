
public class Calculator {

	public void add(int a , int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a , int b)
	{
		System.out.println(a-b);
	}
	public void div(int a , int b)
	{
		if(b!=0)
		{
			System.out.println(a/b);
		}
		else
		{
			System.out.println("Dinominator should not be Zero !!!");
		}
	}
	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add(10, 20);
		c.sub(10, 20);
		c.div(10, 20);
		c.div(10, 0);
	}
}
