package com.abc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.abc.BinarySearchTree.Node;

class Student implements Comparable<Student>
{
	String name;
	double total_marks;
	int roll_number;
	public Student(String name, String input, double d)
	{
		this.name=name;
		this.total_marks=input;
		this.roll_number=d;
		
	}
	public Student(String data[])
	{
		this.name=data[0];
		this.total_marks=Integer.parseInt(data[1]);
		this.roll_number=Integer.parseInt(data[2]);
		
	}
	@Override
	public int compareTo(Student st) {
		
		// TODO Auto-generated method stub
		return 0;
	}
}
class Student1
{
	Node root=null;
	class Node
	{
		  Student key;
	        Integer value;
	         Node left;
	         Node right;
			public int size;
	        Node(Student key,Integer value)
	        {
	        	this.key=key;
	        	this.value=value;
	        }
	}
	 public boolean isEmpty()
	    { 
	    return root == null; 
	    }
	    
	    public void put(Student key, Integer value)
	    { 
	    root = put(root, key, value); 
	    }
	    private Node put(Node x, Student key, Integer val)
	    {
	     if (x == null) 
	   	  return new Node(key, val);
	     int cmp = key.compareTo(x.key);
	     if (cmp < 0)
	     {
	    	 x.left = put(x.left, key, val);
	     }
	     else if (cmp > 0) 
	     {
	    	 x.right = put(x.right, key, val);
	     }
	     else
	    { 
	    	 x.value = val;
	    	
	    }
	     return x;
	    }
	    public Integer get(Student key)
	    { 

	    return get(root, key);
	    }
	    
	   
	    private Integer get(Node x, Student key)
	    {
	     if(x == null) 
	   	  return null;
	     int cmp = key.compareTo(x.key);
	     if(cmp < 0) 
	   	  return get(x.left, key);
	     else if(cmp > 0) 
	   	  return get(x.right, key);
	     else if(cmp == 0) 
	   	  return x.value;
	   return null;
	    }

	   
}

public class Solution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		Student1 obj=new Student1();
		while(sc.hasNext())
		{
			String i=sc.nextLine();
			String input[]=i.split(",");
			//Book k=new Book(input[1],input[2],Double.parseDouble(input[3]));
			switch(input[0])
			{
			case "put":
				obj.put( new Student(input[1],input[2],Double.parseDouble(input[3])),Integer.parseInt(input[4]));
						break;
			
			case "get":
				System.out.println(obj.get(new Student(input[1],input[2],Double.parseDouble(input[3]))));
						break;
			}
			
		}
		

	}

}
