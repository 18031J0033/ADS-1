package com.xyz;
import java.util.Scanner;

class T
{
	String name;
	int wins,loses,draws;
	public T(String name,int wins,int loses,int draws)
	{
		this.name=name;
		this.wins=wins;
		this.loses=loses;
		this.draws=draws;
	}
	
}
class SelectionSort 
{ 
	int count = 0;
    void sort(T name[]) 
    { 
    	int i=0;
        while(name[i]!=null)
        {
        	if(name[i]!=null)
        		count++;
        	i++;
        }
        for (i = 0; i <count; i++) 
        { 
                        
            for (int j = i+1; j < count; j++) {
                if (name[j].wins > name[i].wins) 
                    i= j; 
                if(name[j].wins == name[i].wins) {
                	if (name[j].loses < name[i].loses) 
                        i=j; 
                }
                if((name[j].wins == name[i].wins)&&(name[j].loses == name[i].loses)) {
                	if (name[j].draws > name[i].draws) 
                        i = j; 
                }
            }
            int min=i;
            T temp = name[min]; 
            name[min] = name[i]; 
            name[i] = temp; 
        } 
    } 
   
    void printArray(T a[]) 
    { 
        for (int i=0; i<count; i++) 
        	if(count==1)
            {
            	System.out.println(a[0].name);
            	break;
            }
        	else if((i+1)!=count)
	        {
            	System.out.print(a[i].name+","); 
	        }
	        else
	        {
	            System.out.print(a[i].name);
	        }
              System.out.println(); 
       
    } 
} 
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		T[] k= new T[10];
		while(sc.hasNext())
		{
		String team = sc.nextLine();
		if(team!=null)
		{
		String[] t= team.split(",");
		String name= t[0];
		int wins= Integer.parseInt(t[1]);
		int loses= Integer.parseInt(t[2]);
		int draws= Integer.parseInt(t[3]);
		
		k[i]=new T(name,wins,loses,draws);
		i++;
		}
		}
		SelectionSort ss =new SelectionSort();
		ss.sort(k);
		ss.printArray(k);
	}
}

