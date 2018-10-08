import java.util.Scanner;
class AddLargeNumbers {
	static LinkedList head;
	class LinkedList
	{
		String data;
		LinkedList next;
		LinkedList(String data)
		{
			this.data=data;
			this.next=next;
		}
	}
    
    public static LinkedList numberToDigits(String number) {
		for(int i=0;i<number.length;i++)
		{
			char c=number.charAt(i);
			LinkedList new_node=new LinkedList(c);
			new_node.next=head;
			head=new_node;
		}

    }

    public static String digitsToNumber(LinkedList list) {

    }

    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) {

    }
}

public class Solution {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		System.out.println("enter the input");
        String input = sc.nextLine();
		System.out.println("enter one number");
        String p = sc.nextLine();
		System.out.println("enter another number");
        String q = sc.nextLine();
        switch(input){
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;

            case "addLargeNumbers":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
        }
    }
    
}
