/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sscript
{
	private static Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t = scanner.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int N = scanner.nextInt();
			int K = scanner.nextInt();
			scanner.nextLine();
			String S = scanner.nextLine();
			int count =0;
			boolean ans = false;
			//System.out.println(N+" "+K+" "+S);
			for(char c:S.toCharArray())
			{
				if(c=='*')
					count += 1;
				else
					count=0;
				ans = (ans || count >= K);
			}
			System.out.println(ans ? "YES":"NO");			
		}
	}
}
