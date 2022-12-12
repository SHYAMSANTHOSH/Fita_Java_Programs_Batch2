package com.fita.team2.collections.list;



public class QueueProgram {
	int size = 10;
	int[] shows = new int[size];
	int front,rear;
	
	QueueProgram(){
		front = -1;
		rear = -1;
	}
	
	boolean isFull() {
		System.out.println(front);
		System.out.println(rear);
		
	    if (front == 0 && rear == size - 1) {
	      return true;
	    }
	    return false;
	  }
	
	boolean isEmpty() {
	    if (front == -1)
	      return true;
	    else
	      return false;
	  }

	  // insert elements to the queue
	 void enQueue(int element) {

		    // if queue is full
		    if (isFull()) {
		      System.out.println("Queue is full");
		    }
		    else {
		      if (front == -1) {
		        // mark front denote first element of queue
		        front = 0;
		      }

		      rear++;
		      // insert element at the rear
		      shows[rear] = element;
		      System.out.println("Insert " + element);
		    }
		  }
	 
	 int deQueue() {
		    int element;

		    // if queue is empty
		    if (isEmpty()) {
		      System.out.println("Queue is empty");
		      return (-1);
		    }
		    else {
		      // remove element from the front of queue
		      element = shows[front];

		      // if the queue has only one element
		      if (front >= rear) {
		        front = -1;
		        rear = -1;
		      }
		      else {
		        // mark next element as the front
		        front++;
		      }
		      System.out.println( element + " Deleted");
		      return (element);
		    }
		  }

	 void display() {
		    int i;
		    if (isEmpty()) {
		      System.out.println("Empty Queue");
		    }
		    else {
		      // display the front of the queue
		      System.out.println("\nFront index-> " + front);

		      // display element of the queue
		      System.out.println("Items -> ");
		      for (i = front; i <= rear; i++)
		        System.out.print(shows[i] + "  ");

		      // display the rear of the queue
		      System.out.println("\nRear index-> " + rear);
		    }
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueProgram que = new QueueProgram();
		que.deQueue();
		for(int i = 1; i < 12; i ++) {
			que.enQueue(i);
		    }
		
		que.enQueue(11);
		que.display();
	}

}
