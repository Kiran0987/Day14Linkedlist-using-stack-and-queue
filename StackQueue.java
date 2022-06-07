package com.bl.stack;

public class StackQueue {
	Node top;

	public <T> void push(int x) {
		Node newNode = new Node(x);
		if (isEmpty()) {
			top = newNode;
		} else {
			newNode.value = x;
			newNode.next = top;
			top = newNode;
		}
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void display() {
		if (top == null) {
			System.out.printf("\nStack is Empty");
		} else {
			Node temp = top;
			while (temp != null) {
				System.out.print(temp.value + " ");
				temp = temp.next;
			}
		}
	}

	public void pop() {
		if (isEmpty()) {
			System.out.print("\n\n Stack is EMPTY ");
			return;
		}
		for (int i = 0; i < 3; i++) {
			top = top.next;
		}
	}

	public <T> Object peek() {
		if (!isEmpty()) {
			System.out.println("Top data is :" + top.value);
			return top.value;
		} else {
			System.out.println("Stack is empty");
			return - 1 ;
		}
	}
	public static void main(String[] args) {
		/*	System.out.println("Welcome Stack and Queue program");
		StackQueue list = new StackQueue();
		list.push(70);
		list.push(30);
		list.push(56);
		list.peek();
		System.out.println("The Stack elements are ");
		list.display();
		list.pop();
		System.out.println("\nAfter deletion ");
		list.display();
		System.out.printf("\nTop element is %d\n", list.peek());*/
		Queue queue = new Queue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.display();
		System.out.println("\nThe Elements after delete in Queue is ");
		queue.dequeue();
		queue.display();

	}
}
