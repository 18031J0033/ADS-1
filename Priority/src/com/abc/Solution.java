

import java.util.Scanner;

class minHeap {
	public boolean minHeapInt(String a[]) {
		int x = a.length;
		if(a.length<1) {
			return false;
		}
		int ar[] = new int[x];
		
		for (int i = 0; i < a.length; i++) {
			ar[i] = Integer.parseInt(a[i]);
		}
		boolean flag = false;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					flag = true;
				}else if(ar[i] > ar[j]){
					flag = false;
				}
			}
		}

		return flag;

	}
	public boolean minHeapString(String a[]) {
		int x = a.length;
		if(a.length<1) {
			return false;
		}
		String ar[] = new String[x];
		
		for (int i = 0; i < a.length; i++) {
			ar[i] = a[i];
		}
		boolean flag = false;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i; j < ar.length; j++) {
				if (ar[i].compareTo(ar[j])<0) {
					flag = true;
				}else if(ar[i].compareTo(ar[j])>0){
					flag = false;
				}
			}
		}

		return flag;

	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String n = sc.nextLine();
		int x = Integer.parseInt(n);
		boolean b[] = new boolean[x];
		switch (input)
		{
		case "Integer":
			int i = Integer.parseInt(n);

			for (int k = 0; k < i; k++) {
				String line = sc.nextLine();
				String items[] = line.split(",");
				minHeap ob = new minHeap();
				b[k] = ob.minHeapInt(items);
			}
			break;

		case "String":
			i = Integer.parseInt(n);

			for (int k = 0; k < i; k++) {
				String line = sc.nextLine();
				String items[] = line.split(",");
				minHeap ob = new minHeap();
				b[k] = ob.minHeapString(items);
			}
			break;
		case "Float":
			i=Integer.parseInt(n);
		for (int k = 0; k < i; k++) {
					String line = sc.nextLine();
					String items[] = line.split(",");
					minHeap ob = new minHeap();
					b[k] = ob.minHeapString(items);
				}
				break;
	case "Double":
		i=Integer.parseInt(n);
		for (int k = 0; k < i; k++) {
					String line = sc.nextLine();
					String items[] = line.split(",");
					minHeap ob = new minHeap();
					b[k] = ob.minHeapString(items);
				}
				break;

		}
		for (int k = 0; k < b.length; k++) {
			System.out.println(b[k]);
		}
	}

}