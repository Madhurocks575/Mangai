/**
 * 
 */

/**
 * @author balaj
 *
 */
public class Casting{
public static void main(String[] args)
	{
	cas();
		int x=5;
		long y=x;
		float z=y;
		System.out.println("Int value"+x);
		System.out.println("long value"+y);
		System.out.println("Float value"+z);
		}
	static void cas()
	{
		double myDouble=18.3d;
		int myInt=(int)myDouble;//manual casting
		System.out.println(myInt);
		System.out.println(myDouble);
	}
}
