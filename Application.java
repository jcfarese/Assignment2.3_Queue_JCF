/*
 * application that uses NodeG and LinkedListG class to queue and deque a line when people get in and out of a line.
 * 
 * @author Jim Farese
 * @version 10/09/22
 * 
 * Fall 2022
 */

//Application class that implements Nodes, Linked Lists and Queues to move through a line.
public class Application {

	//main method
	public static void main(String[] args) {
	
		//creates a line
		Queue<String> line = new Queue<String>();
		
		line.enqueueTail("Bill");
		line.printQueue();
		
		line.enqueueTail("Alice");
		line.printQueue();
		
		line.enqueueTail("Bob");
		line.printQueue();
		
		line.dequeueFront();
		line.printQueue();
		
		line.enqueueTail("Jane");
		line.printQueue();
		
		line.enqueueTail("Hamad");
		line.printQueue();
		
		line.dequeueFront();
		line.printQueue();
		
		line.dequeueFront();
		line.printQueue();
		
		line.enqueueTail("Jim");
		line.printQueue();
		
		line.dequeueFront();
		line.printQueue();
		
		line.dequeueFront();
		line.printQueue();
		
	}//end main method

}//end application class
