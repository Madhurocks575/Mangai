/**
 * 
 */

/**
 * @author balaj
 *
 */
public class Puppy {
	int puppyAge;
	
	public Puppy(String name)
	{
		System.out.println("Name of chosen is:"+name);
	}

	public void setAge(int age)
	{
		puppyAge=age;
	}
	public int getAge()
	{
		System.out.println("puppy age is:"+puppyAge);
		return puppyAge;
	}
	
	public static void main(String[] args) 
	{
		Puppy ojb=new  Puppy("sam");
		
		ojb.setAge(6);
		ojb.getAge();
		System.out.println("Variable value:"+ojb.puppyAge);

	}

}
