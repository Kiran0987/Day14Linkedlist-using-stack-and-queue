package com.bl.stack;

public class StackQueue {
	 Node top;

     public <T> void push(T x) {
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
             System.out.printf("Empty stack");
         } else {
             Node temp = top;
             while (temp != null) {
                 System.out.print(temp.value + " ");
                 temp = temp.next;
             }
         }
     }

     public static void main(String[] args) {
         StackQueue list = new StackQueue();
         list.push(70);
         list.push(30);
         list.push(56);
         System.out.println("The Stack elements are :");
         list.display();
     }

 }

