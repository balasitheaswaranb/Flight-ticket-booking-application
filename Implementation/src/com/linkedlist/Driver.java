package com.linkedlist;

public class Driver {

	public static void main(String[] args) {
		MyLinkedList<String> list = new MyLinkedList<>();

		System.out.println("Current Size of the list is: " + list.getSize());

		list.insert("test1");
		list.insert("test2");
		list.insert("test3");
		list.insert("test4");
		list.insert("test5");
		list.insert("test6");
		list.insert("test7");
		list.printNodes();
		list.indexOf("test2");

		list.indexOf("nonExist");

		System.out.println();

		System.out.println("Finding item at location 4");
		list.get(4);

		System.out.println();
		System.out.println("Finding item at last location ");
		list.getLastNode();

		System.out.println();

		System.out.println("Current Size of the list is: " + list.getSize());
		System.out.println("Adding test1st at start of the Node");
		list.insertFirst("test1st");
		list.printNodes();

		System.out.println();

		System.out.println("Current Size of the list is: " + list.getSize());
		System.out.println("Adding testNth at 2nd Location");
		list.insertNth("testNth", 2);
		list.printNodes();

		System.out.println();

		System.out.println("Current Size of the list is: " + list.getSize());
		System.out.println("Deleting first node");
		list.removeFirstNode();
		list.printNodes();

		System.out.println();

		System.out.println("Current Size of the list is: " + list.getSize());
		System.out.println("Deleting last node");
		list.removeLastNode();
		list.printNodes();

		System.out.println();

		System.out.println("Current Size of the list is: " + list.getSize());
		System.out.println("Deleting node from 4th location");
		list.removeNthNode(4);
		list.printNodes();
	}

}
