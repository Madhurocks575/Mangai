/**
 * 
 */

/**
 * @author balaj
 *
 */
class B
{
	void eat()
	{
		System.out.println("eating");
	}
}
class C extends B
{
	void sleep()
	{
		System.out.println("Sleeping");
	}
}
class D  extends C    //C,B mutiple will no support
{
	void yeild()
	{
		System.out.println("Yeiling");
	}
}

public class A {

	public static void main(String[] args) 
	{
		
       D me=new D();
       me.yeild();
      // me.sleep();
       me.eat();
       
	}

}

