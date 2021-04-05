/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Sdice
{
	private static final Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t = scanner.nextInt();
		for(int i=0;i<t;i++)
		{
			scanner.nextLine();
			long N = scanner.nextLong();
			//System.out.println(t+" "+N);
			long sum=0;
			long levels = N/4;
			if(levels==0)
			{
				if(N==1)
					sum=21 - 1;
				if(N==2)
					sum=21 - 1 + 21 - 1 - 2 -2;
				if(N==3)
					sum=21 - 1 + 21 - 1 - 2 -2 + 21 - 1 - 2 -3;
			}
			if(levels>0)
			{
				if(N%4==0)
					sum = 4*4 + (levels)*4*11;
				if(N%4==1)
					sum = (levels)*4*11+ 4*4 + 21 -1 -4;
				if(N%4==2)
					sum = (levels)*4*11 + 4*4 + 21 -1 -4 + 21 - 1 -4 -2 -2;
				if(N%4==3)
					sum = (levels)*4*11 + 4*4 + 21 -1 -4 + 21 - 1 -4 -2 -2 + 21 -1 -4 -3 -2;
			}
			System.out.println(sum);
		}
					
	}
}

