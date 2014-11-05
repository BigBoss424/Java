//Starting the practice of linked lists

public class LinkedLIst
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
      this.head = new Node(0);
   ]
   
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
}


