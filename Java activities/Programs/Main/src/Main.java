/**
 * 
 */

/**
 * @author balaj
 *
 */
public class Main 
{

	public static void main(String[] args) 
	{
		try
		{
			int [] mynum= {1,2,3,4};
			System.out.println(mynum[8]);
		
		}
		catch(Exception e)		{
			System.out.println("wrong");
		}
		finally //excute all the code
		{
			System.out.println("finally result");
		}
	}
}