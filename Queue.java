package com.bl.stack;

public class Queue <T>{
	Node front, rear;

	public <T> void enqueue(int x) {        
		Node newNode = new Node(x);
		if (isEmpty()) {
			rear = newNode;
			front = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
	}

	public boolean isEmpty() {

		return rear == null;
	}

	public void display() {
		if (isEmpty()) {
			System.out.print("\n Queue is empty. Add data in Queue");
		} else {
			Node temp = front;
			while (temp != null) {
				System.out.print(temp.value + " ");
				temp = temp.next;
			}
		}
	}
}

