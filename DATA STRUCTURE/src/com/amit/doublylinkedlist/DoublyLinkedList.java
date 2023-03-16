package com.amit.doublylinkedlist;

public class DoublyLinkedList {
  private Node first=null;
  private int count=0;
  
  public void add(Object e)
  {
	  if(first==null)
	  {
		  first=new Node(e);
		  count++;
		  return;
	  }
	  Node curr=first;
	  while(curr.next!=null)
	  {
		  curr=curr.next;
	  }
	  curr.next=new Node(e,null,curr);
	  count++;
  }
  public void add(int index,Object e)
  {
	  if(index==0)
	  {
		  Node n=new Node(e,first,null);
		  first.prev=n;
		  first=n;
		  count++;
		  return;
	  }
	  Node curr=first;
	  for(int i=1;i<index;i++)
	  {
		  curr=curr.next;
	  }
	  Node n=new Node(e,curr.next,curr);
	  curr.next.prev=n;
	  curr.next=n;
	  count++;
	  
  }
  public int size()
  {
	  return count;
  }
  
  public Object get(int index)
  {
	  if(index<=-1||index>=size())
	  {
		  throw new IndexOutOfBoundsException();
	  }
	  Node curr=first;
	  for(int i=1;i<=index;i++)
	  {
		  curr=curr.next;
	  }
	  return curr.ele;
  }
  
  public void remove(int index)
  {
	  if(index==0)
	  {
		  first=first.next;
		  count--;
		  return;
	  }
	  Node curr=first;
	  for(int i=1;i<index;i++)
	  {
		  curr=curr.next;
	  }
	  curr.next=curr.next.next;
	  curr.next.prev=curr;
	  
	  count--;
  } 
  public void reverse()
	{
	  Node temp = null;
      Node curr = first;

      /* swap next and prev for all nodes of
       doubly linked list */
      while (curr != null) {
          temp = curr.prev;
          curr.prev = curr.next;
          curr.next = temp;
          curr = curr.prev;
      }

      /* Before changing first, check for the cases like
       empty list and list with only one node */
      if (temp != null) {
          first = temp.prev;
      }
	}
  
}
