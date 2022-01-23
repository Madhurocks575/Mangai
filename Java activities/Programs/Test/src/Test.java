/**
 * 
 */

/**
 * @author balaj
 *
 */
public class Test {

	public static void main(String[] args) throws InterruptedException
	{
		Test t1=new Test();
		Test t2=new Test();
		
		t1=null;
		System.gc();
		t2=null;
		Runtime.getRuntime().gc();//running GC
	}
	protected void finalize() throws Throwable
	{
		System.out.println("GC is called");
		System.out.println("object GC collected:"+this);
}
}
