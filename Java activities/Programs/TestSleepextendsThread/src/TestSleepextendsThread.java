/**
 * 
 */

/**
 * @author balaj
 *
 */


 class TestSleep extends Thread
{
	public void run()
	{
		int i=1;
		for(i=1;i<5;i++)
		{
			try
			{
				Thread.sleep(100);
			}
					
		
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
			System.out.println(i);
		}
		
	
}
	public static void main(String[] args)
	{
	 TestSleep a=new TestSleep();
     TestSleep b=new TestSleep();
     TestSleep c=new TestSleep();
	  a.start();
	  b.start();
	  c.start();

	}

}