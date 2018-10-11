
import java.util.*;
 class LinkedList {
	class Node
	{
		int data;
		
		Node next;
		Node(int data,Node next)
		{
			this.data=data;
			this.next=next;
		}
	}
	Node front,rear,temp;
	int elements;
	LinkedList()
	{
		this.front=null;
		this.rear=null;
		elements=0;
	}
	public void add(int val)
	{
   		if(front==null)
   		{
   			front=new Node(val, front);
   			front.next=front;
   			rear=front;
   			temp=front;
   		}
   		else
   		{
   			Node newnode = new Node(val, null);
   			rear.next=newnode;
   			newnode.next=front;
   			rear=newnode;
   		}
   		elements++;
   	}	
	public int dequeue(int pos)
	{
   		Node temp2=temp, prev= null;
   		
   		for(int i=0;i<pos-1;i++)
   		{
   			prev=temp2;
   			
   			temp2=temp2.next;

   		}
   		prev.next=temp2.next;
   		
   		temp=temp2.next;
   		elements--;
   		return temp2.data;

   	}
	int size()
	{
		return elements;
	}
	void display()
	{
		Node temp=front;
		System.out.println("The elements present in the linked list are");
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
 }
 class Josephus
 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no=sc.nextInt();
		LinkedList obj=new LinkedList();
		for(int i=0;i<no;i++)
		{
			//sc.nextLine();
			int n=sc.nextInt();
			int m=sc.nextInt();
			for(int j=0;j<n;j++)
			{
				obj.add(j);
			}
			while(obj.size()!=0)
			{
				System.out.println(obj.dequeue(m));
			}

		}
	}
// TODO Auto-generated method stub

	}


