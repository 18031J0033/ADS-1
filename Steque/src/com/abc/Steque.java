
import java.util.*;
class LinkedList
{
	Node first,last;
	int elements;
	
	class Node
	{ 
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			
		}
	}
	LinkedList()
	{
		elements=0;
		first=null;
		last=null;
	}
	 void push(int value)
    {
    	Node n=new Node(value);
    	Node temp=first;
        if(first==null) 
        {
            first=n;
            last=n;
        } 
        else
        {
        	
             first=n;
             first.next=temp;
        }

        elements++;
    }
	  void enqueue(int value) 
	    {
	        if (last==null)
	        {
	            last=new Node(value);
	            
	            first=new Node(value);
	        } 
	        else 
	        {
	            Node newnode=new Node(value);
	             
	            last.next=newnode;
	            last=newnode;
	        }
	        elements++;
	    }
	     
	  void pop() 
	    {
	        if(first!=null) 
	        {
	            Node popped=first;
	           first=first.next;
	            popped.data=0;
	            popped.next=null;
	            elements--;
	            
	        }
	        else
	        {
	        	System.out.println("Steque is empty");
	        }
	        
	    }
		
	 void display()
	 {
		 Node temp=first;
		 
		 while(temp!=null){
			 System.out.println(temp.data);
			 temp=temp.next;
		 }
		  }
	
}

class Steque
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		LinkedList d=new LinkedList();
		for(int i=0;i<N;i++)
		{
			while(sc.hasNext())
			{
				String input=sc.next();
				
				switch(input)
				{
				case "push":
					int v=sc.nextInt();
					d.push(v);
					d.display();
					break;
				case "pop":
					d.pop();
					d.display();
					break;
				case "enqueue":
					int x=sc.nextInt();
					d.enqueue(x);
					d.display();
					break;
				
				}
			}
		}
	}
}