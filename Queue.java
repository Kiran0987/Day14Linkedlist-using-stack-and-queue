package com.bl.stack;

public class Queue <T>{
	Node head, tail;

	public <T> void enqueue(int x) {        
		Node newNode = new Node(x);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		} else {
			head.next = newNode;
			head = newNode;
		}
	}

	public boolean isEmpty() {

		return head == null;
	}

	public void display() {
		if (isEmpty()) {
			System.out.print("\n Queue is empty. Add data in Queue");
		} else {
			Node temp = tail;
			while (temp != null) {
				System.out.print(temp.value + " ");
				temp = temp.next;
			}
		}	
	}
	public <T> void dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty add Data to delete ");
		} else
			tail = tail.next;

	}
}


