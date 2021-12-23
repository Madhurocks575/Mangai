/**
 * 
 */

/**
 * @author balaj
 *
 */
class Demo extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Thread:"+Thread.currentThread().getId()+"is Running");
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
	}
}

public class Multithread {

	public static void main(String[] args) 
	{
        int n=5;//number of thread
        //execute
        //waiting/blocked
        //terminated
        //Multitasking=Multiprocess+MultiThreading
         for(int i=0;i<n;i++)
         {
		Demo obj=new Demo();//thread
        obj.start();
         }
//    		   

	}
}	
