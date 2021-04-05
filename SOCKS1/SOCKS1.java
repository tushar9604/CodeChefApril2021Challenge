/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SOCKS1
{
	private static final Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		//System.out.println(A+" "+B+" "+C);
		
		if(A==B || B==C || A==C)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
