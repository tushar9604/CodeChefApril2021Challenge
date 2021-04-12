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
		while(t-->0){

			int N = scanner.nextInt();
			int M = scanner.nextInt();
			double K = scanner.nextDouble();
			scanner.nextLine();
			double arr[][] = new double[N+1][M+1];
			
			for(int i=0;i<=N;i++)
			{
				for(int j=0;j<=M;j++)
				{
					if(i==0 || j==0){
						arr[i][j]=0;
					}
					else{
						arr[i][j]=scanner.nextDouble();
					}
				}
				//scanner.nextLine();
			}
			/*
			for(int i=0;i<=N;i++){
				for(int j=0;j<=M;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
				
			System.out.println();
		*/
			for(int i=0;i<=N;i++){
				double pre=0;
				for(int j=0;j<=M;j++){
					arr[i][j] += pre;
					pre = arr[i][j];
				}
			}
			
			/*
			for(int i=0;i<=N;i++){
				for(int j=0;j<=M;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
				System.out.println();
			*/
			for(int j=0;j<=M;j++){
				double pre=0;
				for(int i=0;i<=N;i++){
					arr[i][j] += pre;
					pre = arr[i][j];
				}
			}
			
			/*
			
			for(int i=0;i<=N;i++){
				for(int j=0;j<=M;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
				System.out.println();
			*/
			int ans = 0;
			
			for(int len=1;len<=N;len++){
				for(int i=len;i<=N;i++){
					for(int j=len;j<=M;j++){
						if((arr[i][j]+arr[i-len][j-len]-arr[i][j-len]-arr[i-len][j])/(len*len)>=K){
							ans++;
						}
					}
				}
			}
			System.out.println(ans);
		}
		
	}
}
