/*
 * uses NodeG and LinkedList class to form a line
 * 
 * @author Jim Farese
 * @version 10/09/22
 * 
 * Fall 2022
 */

public class Queue<T> {

	LinkedListG<T> queueList = new LinkedListG<T>();
	
	//adds a new entry to the tail of the list
	public void enqueueTail(T newEntry) {
		
		System.out.println("***" + newEntry + " has gotten in line.***");
		
		NodeG<T> tempNode = new NodeG<T>(newEntry, null);
		
		queueList.addNode(tempNode);
		
	}//end enqueueTail

	//removes the head of the list and makes the next node the head
	public void dequeueFront() {
		
		T tempNode = queueList.remove();
		
		System.out.println("***" + tempNode + " was served***");
		
	}//end dequeueFront

	/**
	 * checks if the linked list is empty
	 * @return empty to be true if the linked list is empty
	 */
	public boolean isEmpty() {
		
		boolean empty=true;
		empty = queueList.isEmpty();
		
		return empty;
		
	}//end isEmpty

	//clears the list
	public void clear() {
		
		queueList.clear();
		
	}//end clear

	/**
	 * gets the front of the list
	 * @return the data in the list
	 */
	public T getFront() {
		
		return queueList.getList().getData();
		
	}//end getFront

	
	// checks if the list is empty and then prints all the data in the linked list starting with the head first and then iterates the data with the tail last.
	public void printQueue() {
		
		if(queueList.isEmpty()) {
			System.out.println("There is no one in line.");
		}
		
		System.out.println("The customers in line are: ");
		
		NodeG<T> tempNode = new NodeG<T>();
		tempNode = queueList.getList();
		for(int i=0; i<=queueList.getSize(); i++) {
			System.out.println(tempNode.getData());
			tempNode=tempNode.getNextNode();
		}
		
		System.out.println("");
		
	}//end printQueue
				 
}//end Queue Class
