package com.amit.singlelinkedlist;

public class Demo1 {
	public static void sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++ )
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		SingleLinkedList l1 = new SingleLinkedList();
		l1.add(50);
		l1.add(20);
		l1.add(10);
		l1.add(30);
		l1.add(40);
//		l1.add(2,60);
//		l1.remove(0);
//		l1.reverse();
		int[] a=new int[l1.size()];
		
		
		for(int i=0; i<l1.size(); i++) {
			a[i]=(int) l1.get(i);
		}
		System.out.println("Before Sorting : ");
		for(int n:a)
		{
			System.out.println(n);
		}
		sort(a);
		System.out.println("After Sorting : ");
		for(int n:a)
		{
			System.out.println(n);
		}
		
	}

}
