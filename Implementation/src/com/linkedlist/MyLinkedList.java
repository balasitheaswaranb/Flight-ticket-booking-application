package com.linkedlist;

public class MyLinkedList<T> {

	private int size;
	private Node head;

	public MyLinkedList() {
		this.size = 0;
		this.head = null;
	}

	public void insert(String item) {
		Node node = new Node();
		node.item = item;
		Node current = this.head;

		if (this.head == null) {
			this.head = node;
			this.head.next = null;
			this.size = 1;
			System.out.println(this.head.toString());
		} else {

			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			node.next = null;
			this.size += 1;
		}
	}

	public void insertFirst(String item) {
		Node node = new Node();
		node.item = item;
		node.next = this.head;
		this.head = node;
		this.size++;
	}

	public void insertNth(String item, int position) {
		Node node = new Node();
		node.item = item;
		Node current = this.head;
		if (this.head != null && position <= this.size) {
			for (int i = 1; i < position; i++) {
				current = current.next;
			}
			node.next = current.next;
			current.next = node;
			this.size += 1;
		} else {
			System.out.println("Exceeded the linked list size. Current Size: " + size);
		}
	}

	public void removeFirstNode() {
		if (head != null) {
			this.head = this.head.next;
			this.size--;
		} else {
			System.out.println("Linked list is empty");
		}
	}

	public void removeLastNode() {
		Node currentNode = this.head;
		if (size == 1) {
			head = null;
			size = 0;
		} else {
			Node prevNode = null;
			while (currentNode.next != null) {
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
			prevNode.next = null;
			this.size--;
		}
	}

	public void removeNthNode(int position) {
		if (position <= this.size && this.head != null) {
			Node currentNode = this.head;
			Node prevNode = null;
			for (int i = 0; i < position; i++) {
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
			prevNode.next = currentNode.next;
			this.size--;
		} else {
			System.out.println("No node exist at location: " + position);
		}
	}

	public void indexOf(String item) {
		Node node = this.head;
		boolean found = false;
		for (int i = 0; i < size; i++) {
			if (node.item.equals(item)) {
				System.out.println("Item " + item + " was found at location " + i + " in the linked list");
				found = true;
			}
			node = node.next;
		}

		if (!found)
			System.out.println("Item " + item + " was not found in the Linked list");
	}

	public void get(int location) {
		Node node = this.head;
		if (head != null && location <= size) {
			for (int i = 0; i < location; i++) {
				node = node.next;
			}
			System.out.println("Node item at location " + location + " is " + node.item);
		}
	}

	public void getLastNode() {
		Node node = this.head;
		if (head != null) {
			for (int i = 0; i < size - 1; i++) {
				node = node.next;
			}
			System.out.println("Node item at last location is " + node.item);
		}
	}

	public void printNodes() {
		if (this.size < 1)
			System.out.println("There are no nodes in the linked list");
		else {
			Node current = this.head;
			for (int i = 0; i < this.size; i++) {
				System.out.println(current.item + " index is " + i);
				current = current.next;
			}
		}
	}

	public int getSize() {
		return size;
	}

}
