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
	throw new IndexOutOfBoundsException("list index out of range): " + index);
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
	  Node prev = find(index -1);
	  Node curr = prev.next;
	  prev.next = curr.next;
	}
	size--;
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
   
   public String toString()
   {
      String s = "";
      for(Node curr = head.next; curr != null; curr = curr.next)
      {
	s = s + curr.value + "";
      }
      return s;
   }
   
   public String toString()
   {
    String s = "";
    for(Node curr = head.next; curr != null; curr = curr.next)
    {
      s = s + curr.value + "";
    }
    return s;
   }
   
   public String toString()
   {
      String s = "";
      for(Node curr = head.next; curr != null; curr = curr.next)
      {
	s = s + curr.value + "";
      }
      return s;
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
	size--
      }
      else
      {
	throws new IndexOutOfBoundsException("Index out of bounds: " + index);
      }
   }
   
   public void addOrdered(int index, int value)
   {
     if(index >= 0 && index <= size)
     {
	Node newNode = new Node(value);
	if(index == 0)
	{	
	  newNode.next = head.next;
	  head.next = newNode;
	}
	else
	{
	  Node prev = find(index - 1);
	  newNode.next = prev.next;
	  prev.next = newNode;
	}
	size++
     }
     else
     {
	throws new IndexOutOfBoundsException("Index out of bounds: " + index);
     }
   
   }
   
   public void addOrdered(int index, int value)
   {
      if(index >= 0 && index <= size)
      {
	Node newNode = new Node(value)
	if(index == 0)
	{
	  newNode.next = head.next;
	  head.next = newNode;
	}
	else
	{
	  Node prev = find(index -1)
	  Node curr = prev.next;
	  prev.next = newNode;
	}
	size++;
      }
      else
      {
	throw new IndexOutOfBoundsException("List index error: " + index);
      }
   }
   
   public void addOrdered(int index, int value)
   {
      if(index >= 0 && index <= size)
      {
	Node newNode = new Node(value);
	if(index == 0)
	{
	  newNode.next = head.next;
	  head.next = newNode;
	}
	else
	{
	  Node prev = find(index - 1);
	  Node curr = prev.next;
	  prev.next = newNode;
	}size++;
	
      }
      else
      {
	throw new IndexOutOfBoundsException("Index out of bounds: " + index);
      }
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
	}size--;
	
      }
      else
      {
	throw new IndexOutOfBoundsException("Index out of bounds: " + index);
      }
   }
   
   public String toString()
   {
      String s = "";
      for(Node curr = head.next; curr != null; curr = curr.next)
      {
	s = s + curr.value + "";
      }
      return s;
   }
   
   public void addOrdered(int index, int value)
   {
      if(index >= 0 && index <= size)
      {
	Node newNode = new Node(value);
	if(index == 0)
	{
	  newNode.next = head.next;
	  head.next = newNode;
	}
	else
	{
	  Node prev = find(index -1);
	  Node curr = prev.next;
	  prev.next = newNode;
	}
	size++;
      }
      else
      {
	throw new IndexOutOfBoundsException("Index out of bounds: " + index);
      }
   }
}//end class