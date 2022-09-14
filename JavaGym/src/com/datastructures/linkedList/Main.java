package com.datastructures.linkedList;

public class Main {

	public static void main(String[] args) {
		//First i inserted 10 to the linked list
		LinkedList myLinkedList = new LinkedList(0);
        
		//then i appended 1, 2, 3 to the linked list
		myLinkedList.append(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		
		myLinkedList.removeFirst();


		System.out.println(myLinkedList.get(1).value + "\n");
		
		//myLinkedList.insert(2, 1000);
		//myLinkedList.append(2000);
		//myLinkedList.set(2, 5000);
		
		myLinkedList.reverse();
		
		myLinkedList.printList();
		
		
	}

}
