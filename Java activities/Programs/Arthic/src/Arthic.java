/**
 * 
 */

/**
 * @author balaj
 *
 */
public class Arthic
{
static void checkAge(int age)
{
	if(age<18)
	{
		throw new ArithmeticException("Access deneid atleast 18 year");
	}
	else
	{
		System.out.println("Access granted");
	}
}
public static void main(String[] args)
{
	checkAge(5);
}
}
