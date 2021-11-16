/**
 * 
 */

/**
 * @author balaj
 *
 */
import java.util.Scanner;
public class Eligible {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String ele;
		ele=(a<18)?"Not eligible":"Eligible";
		System.out.println(ele);
		//if(a<18)System.out.println("Not eligible");
		//else System.out.println("Eligible");
	}

}

