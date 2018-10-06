package com.xyz;
import java.util.*;
class Node
{
	static Node head;
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}


	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
}

 class LinkedList {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Node obj=new Node(sc.nextInt());
		Node.head=new Node(1);
		Node Second=new Node(2);
		Node third=new Node(3);
		obj.head.next=Second;
		Second.next=third;
		obj.display();
		
		
		 
	}

}
