/**
 * 
 */

/**
 * @author balaj
 *
 */
import java.util.Iterator;
public class LinkedList1{  
public static void main(String args[]){  
LinkedList<String> al=new LinkedList<String>();  
  al.add("R");  
  al.add("V");  
  al.add("R");  
  al.add("A");  
  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }}