package com.amit.stringmethods;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		
		System.out.println(reverse("jspiders"));

	}
	static String reverse(String s)
	{
		char[] a=s.toCharArray();
		int i=0,j=s.length()-1;
		while(i<j)
		{
			char t=a[i];
			a[i]=a[j];
			a[j]=t;
			i++;
			j--;
			
		}
		return new String(a);
	}

}
