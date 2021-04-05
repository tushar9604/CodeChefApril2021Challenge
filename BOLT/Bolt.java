/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Bolt
{
	static final float timeBolt=9.58F;
	private static final Scanner scanner = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		int t = scanner.nextInt();
		float k1,k2,k3,v,time;
		
		for(int i=0;i<t;i++)
		{
			k1 = scanner.nextFloat();
			k2 = scanner.nextFloat();
			k3 = scanner.nextFloat();
			v = scanner.nextFloat();	
			
			//System.out.println(k1+" "+k2+" "+k3+" "+v);
			v = k1*k2*k3*v;
			time = Math.round((100/v)*100.0);
			time = time/100;
			if(time<timeBolt)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
			
	}
}
