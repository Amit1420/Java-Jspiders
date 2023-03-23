package com.amit.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo3 {

	public static void main(String[] args) {
		Queue q=new PriorityQueue();
	      
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
