package com.amit.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Demo1{
	public static void main(String[] args) {
      Queue q=new ArrayDeque();
      
      q.add(40);
      q.add(10);
      q.add(30);
      q.add(20);
      q.add(50);
      
      while(!q.isEmpty())
      {
    	  System.out.println(q.poll());
      }
      
	}

}
