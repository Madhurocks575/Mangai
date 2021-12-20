/**
 * 
 */

/**
 * @author balaj
 *
 */
class Bank
{
	float getRateOfInterest()
	{
		return 0;
	}
	
}
class SBI extends Bank
{

	float getRateOfInterest()
	{
		return 7.9f;
	}
}
class ICIC  extends Bank
{
	float getRateOfInterest()
	{
		return 7.6f;
	}
}

public class Poly
{

	public static void main(String[] args) 
	{
		Bank obj=new ICIC();
		System.out.println(obj.getRateOfInterest());
		Bank obj2=new SBI();
		System.out.println(obj2.getRateOfInterest());


	}

}