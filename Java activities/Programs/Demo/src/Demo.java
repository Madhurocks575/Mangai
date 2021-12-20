/**
 * 
 */

/**
 * @author balaj
 *
 */
class Calcu
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(double a,double b)
	{
		System.out.println(a+b);
	}
	
}


public class Demo
{

	public static void main(String[] args) 
	{
		Calcu obj=new Calcu();
		obj.add(8.1, 4.6);
		obj.add(3, 6);

	}

}

