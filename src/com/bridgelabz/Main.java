package com.bridgelabz;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);
		list.display();
		list.insertAfterGivenValue(40, 30);
		list.display();
		list.deleteIndex(list.findIndex(40));
		list.display();
		list.displaySize();
	}
}
