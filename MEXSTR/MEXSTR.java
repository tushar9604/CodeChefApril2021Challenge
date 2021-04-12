import java.util.*;
import java.lang.*;
import java.io.*;

class Mexstr
{
	private static final Scanner scanner = new Scanner(System.in);
	static Set<String> al = new HashSet<String>();
	
	private static void findsubsequences(String s, String ans)
	{
		if (s.length() == 0){
			al.add(ans);
			return;
		}
		
		findsubsequences(s.substring(1), ans + s.charAt(0));
		
		findsubsequences(s.substring(1),ans);
	}
	
	public static void main(String[] args) throws java.lang.Exception
	{
		int t = scanner.nextInt();
		 scanner.nextLine();
		for(int i=0;i<t;i++){
			
			String s = scanner.nextLine();
			findsubsequences(s,""); // Calling a function
			/*
			Set<String> finalSubSeq = new HashSet<String>();
			for(String ss:al){
				if(!(ss.length()>1 && ss.charAt(0)=='0')){
					finalSubSeq.add(ss);
					//System.out.println(ss);
				}
			}
			*/
			
			//System.out.println(finalSubSeq);
			int output = 0;
			
			while(al.contains(Integer.toBinaryString(output))){
				output++;
			}
			System.out.println(Integer.toBinaryString(output));
			al.clear();
		}
		
	}
}
