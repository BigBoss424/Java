/*
This will just be pure repitition on my part to fully memorize the Linked List methods that will be required of
of me to write. 

*/

public class LinkedList
{
   private class Node
   {
      public int value;
      public Node next;
      
      public Node(int aValue)
      {
	this.value = aValue;
      }
   }
   
   private Node head;
   private int size;
   
   public LinkedListDummy()
   {
      this.head =  new Node(0);
   }
   
   public void add(int value)
   {
      Node newNode = new Node(value);
      
      Node curr = head;
      
      while(curr.next != null)
      {
	curr = curr.next;
      }
      
      curr.next = newNode;
      size++;
   }
   
   public void add(int value)
   {
      Node newNode = new Node(value);
      Node curr = head;
      while(curr.next != null)
      {
	curr = curr.next;
      }
      curr.next = newNode;
      size++;
      
   }
   
   public vod add(int value)
   {
      Node newNode = new Node(value);
      Node curr = head;
      while(curr.next != null)
      {
	curr = curr.next;
      }
      curr.next = newNode;
      size++;
   }
   
   public void add(int value)
   {
      Node newNode = new Node(value);
      Node curr = head;
      while(curr.next != null)
      {
	curr = curr.next;
      }
      
      curr.next = newNode;
      size++;
   }
   
   public void add(int value)
   {
      Node newNode = new Node(value);
      Node curr = head;
      while(curr.next != null)
      {
	curr = curr.next;
      }
      curr.next = newNode;
      size++;
   }
   
   public void add(int value)
   {
      Node newNode = new Node(value);
      Node curr = head;
      while(curr.next != null)
      {
	curr.next = curr;
      }
      curr.next = newNode;
      size++;
   }
   
   public void add(int value)
   {
      Node newNode = new Node(value);
      Node curr = head;
      while(curr.next != null)
      {
	curr.next = curr;
      }
      curr.next = newNode;
      size++;
   }
   
   public void delete(int index)
   {
      if(index >= 0 && index < size)
      {
	if(index == 0)
	{
	  head.next = head.next.next;
	}
	else
	{
	  Node prev = find(index -1);
	  Node curr = prev.next;
	  prev.next = curr.next;
	}
	size--;
      }
      else
      {
	throw new IndexOutOfBoundsException("List index not working");
      }
   }

   public void delete(int index)
   {
      if(index >= 0 && index < size)
      {
	  if(index == 0)
	  {
	    head.next = head.next.next;
	  }
	  else
	  {
	    Node prev = find(index - 1);
	    Node curr = prev.next;
	    prev.next = curr.next;
	  }
	  size--;
      }
      else
      {
	throw new IndexOutOfBoundsException("List index error on add (out of range): " + index);
      }
   }
   
   public void delete(int index)
   {
      if(index >= 0 && index < size)
      {
	if(index == 0)
	{
	  head.next = head.next.next;
	}
	else
	{
	  Node prev = find(index - 1);
	  Node curr = prev.next;
	  prev.next = curr.next;
	}
	size--;
      }
      else
      {
	throw new IndexOutOfBoundsException("List index error on add(out of range): " + index);
      }
   }
   
   public String toString()
   {
      String s = "";
      for(Node curr = head.next; curr != null; curr = curr.next)
      {
	s = s + curr.value + " ";
      }
      return s;
   }
   
   public String toString()
   {
      String s = "";
      for(Node curr = head.next; curr != null; curr = curr.next)
      {
	s = s + curr.value + " ";
      }
      return s;
   }
   
   public String toString()
   {
      String s = "";
      for(Node curr = head.next; curr != null; curr = curr.next)
      {
	s = s + curr.value + " ";
      }
      return s;
   }
   
   public String toString()
   {
      String s = "";
      for(Node curr = head.next; curr != null; curr = curr.next)
      {
	s = s + curr.value + " ";
      }
      return s;
   }
   
   public String toString()
   {
      String s = "";
      for(Node curr = head.next; curr != null; curr = curr.next)
      {
	s = s + curr.value + " ";
      }
      return s;
   }
   
   public String toString()
   {
     String s = "";
     for(Node curr = head.next; curr != null; curr = curr.next)
     {
       s = s + curr.value + " ";
     }
     return s;
   }
   
   public String toString()
   {
    String s = "";
    for(Node curr = head.next; curr != null; curr = curr.next)
    {
      s = s + curr.value + " ";
    }
    return s;
   }
}//end class