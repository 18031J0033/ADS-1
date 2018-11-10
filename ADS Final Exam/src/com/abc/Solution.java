
import java.util.HashMap;
import java.util.Scanner;

class Student1
{
	int roll_number;
	String name;
	double total_marks;
	
	Student1(String name,double total_marks)
	{
		
		this.name=name;
		this.total_marks=total_marks;
	}
	public Double getTotal()
	{
		return this.total_marks;
	}
	public String getName()
	{
		return this.name;
	}
	
}



public class Solution 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		HashMap<Integer,Student1> h=new HashMap<Integer,Student1>(n);
		
		for(int i=0;i<n;i++)
		{
			String elements[]=sc.nextLine().split(",");
			h.put(Integer.parseInt(elements[0]),
					new Student1(elements[1],Double.parseDouble(elements[2])));
		}
		int n1=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n1;i++)
		{
			String elements1[]=sc.nextLine().split(" ");
			Student1 det=h.get(Integer.parseInt(elements1[1]));
			if(det == null)
			{
				System.out.println("Student doesn't exists...");
			}
			else
			{
				if(elements1[2].equals("1"))
				{
					System.out.println(det.getName());
				}
				else
				{
					System.out.println(det.getTotal());
				}
			}
		}
			
	}

}
