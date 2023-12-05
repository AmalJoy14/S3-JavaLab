import java.util.LinkedList;
import java.util.Scanner;

class DoublyLinkedList<T>{
	private LinkedList<T> list = new LinkedList<>();
	
	public  void insetionAtEnd(T element) {
		list.addLast(element);
	}
	public void insertionAtFront(T element) {
		list.addFirst(element);
	}
	public void insertionAtPos(int index,T element) {
		list.add(index, element);
	}
	public void delete(int index) {
		list.remove(index);
	}
	public void display() {
		for(T element : list) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
}

public class DoublyLinkedListDemo {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList<Integer> doublyLinkedList=new DoublyLinkedList<>();
		int choice,element,index;
		boolean condition=true;
		while(condition) {
			System.out.println("Enter your choice:\n"
					+ "1.Insertion At Front\n"
					+ "2.Insertion At End\n"
					+ "3.Insertion At Any Position\n"
					+ "4.Delete\n"
					+ "5.Display\n"
					+ "6.Exit");
			choice=sc.nextInt();
			
			switch (choice) {
			
			case 1:
				System.out.println("Enter the element:");
				element=sc.nextInt();
				doublyLinkedList.insertionAtFront(element);
				break;
				
			case 2:
				System.out.println("Enter the element:");
				element=sc.nextInt();
				doublyLinkedList.insetionAtEnd(element);
				break;
				
			case 3:
				System.out.println("Enter the element:");
				element=sc.nextInt();
				System.out.println("Enter the position:");
				index=sc.nextInt();
				doublyLinkedList.insertionAtPos(index,element);
				break;
			
			case 4:
				System.out.println("Enter the position:");
				index=sc.nextInt();
				doublyLinkedList.delete(index);
				break;
				
			case 5:
				System.out.println("The elements are:");
				doublyLinkedList.display();
				break;
				
			case 6:
				condition=false;
				break;
				
			default:
				System.out.println("Invalid Entry");
				break;
			}
		}
	}
}
