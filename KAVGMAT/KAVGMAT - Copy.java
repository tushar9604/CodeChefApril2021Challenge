/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class KAVGMAT
{
	private static final Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t = scanner.nextInt();
		scanner.nextLine();
		while(t--){

			int N = scanner.nextInt();
			int M = scanner.nextInt();
			int K = scanner.nextInt();
			scanner.nextLine();
			int arr[][] = new int[N+1][M+1];
			int pin,pinI,pinJ,temp;
			pin=0;
			pinI=0;
			pinJ=0;
			temp=0;
			
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<M;j++)
				{
					arr[i][j]=scanner.nextInt();
					if((arr[i][j]>=pin) && (temp==0))
					{
						pinI = i;
						pinJ = j;
						pin = arr[i][j];
						temp=1;
					}
				}
				scanner.nextLine();
			}
		
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<M;j++)
				{
					System.out.print(arr[i][j] + " ");
				}
				System.out.println(K);
			}
		

			System.out.println(pin+" "+pinI+" "+pinJ);
		}
	}
}
