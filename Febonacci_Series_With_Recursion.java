/**
 * 
 */
package With_Recusrion;

import java.util.Scanner;

/**
 * @author Preetam singh rana
 *
 */
public class Febonacci_Series_With_Recursion {

	/**
	 * calling the function itself
	 */
	
	static int first=0;
	static int second=1;
	static int next=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input the number upto which you want the series ");
		int num=sc.nextInt();
		
		
		System.out.println("The Febonacci Series----");
		System.out.print(first+"-");
		System.out.print(second+"-");
		febonacci_call( num);

	}

	private static void febonacci_call(int num) {
	       next=first+second;
	       first=second;
	       second=next;
	       System.out.print(next+"-");
	       num--;
	       if(num>2)
	    	   febonacci_call(num);
		
	}

}
