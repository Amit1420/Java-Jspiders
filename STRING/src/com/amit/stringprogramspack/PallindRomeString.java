package com.amit.stringprogramspack;

public class PallindRomeString 
{

	public static void main(String[] args) 
	{
	 System.out.println(isPallindRome("MalaYalam"));
		
	}
	static boolean isPallindRome(String s)
	{
		char[] a=s.toLowerCase().toCharArray();
		int i=0;int j=a.length-1;
		while(i<j)
		{
			if(a[i]!=a[j]) return false;
			i++;
			j--;
		}
		return true;
	}

}
