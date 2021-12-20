/**
 * 
 */

/**
 * @author balaj
 *
 */
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grade();
	}
	static void grade() {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=0;
		if(a>70)b=1;
		else if(a>40)b=2;
		switch(b){
			case 1:
				System.out.println("First class");
				break;
			case 2:
				System.out.println("Second class");
				break;
			default:
				System.out.println("Fail");
				break;
		}
	}
}
