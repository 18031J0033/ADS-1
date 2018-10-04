package com.xyz;
import java.util.Arrays;
import java.util.Scanner;

class Equalpair {
	

	public void Numberpair(int[] a) {
		// TODO Auto-generated method stub
		int l = a.length;
		int temp1=0;
		for(int i=0;i<l-1;i++)
		{
			
				if(a[i]>a[i+1])
				{
					temp1=a[i];
					a[i]=a[i+1];
					a[i+1]=temp1;
				}		
			
		}
		int count = 0;
		int temp = a[0];
		for(int i=1;i<l;i++)
		{
			if(a[i]==a[i+1])
			{
				count++;
			}
			//temp = a[i];
			
		}
		System.out.println("No.of equal numbers in the given array are: "+count);
	}
}
	public class Pairs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of elements in the array");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements to the array");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		Equalpair ep = new Equalpair();
		ep.Numberpair(a);

	}

}
