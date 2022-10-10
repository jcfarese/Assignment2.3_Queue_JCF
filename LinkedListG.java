/**
 * uses Node class to make a linked list so a queue can form a line
 * 
 * @author Jim Farese
 * @version 10/09/22
 * 
 * Fall 2022
 */

public class LinkedListG<T> {
	
	private NodeG<T> head;
	private NodeG<T> tail;
	private int length;
	
	//constructor
	public LinkedListG() {
		
		this.head=null;
		this.length=0;
		this.tail=null;
		
	}//end LinkedListG
	
	//clears the linked list
	public void clear() {
		
		head=null;
		length=0;
		
	}//end clear
	
	/**
	 * checks the linked list to see if it is empty
	 * @return a boolean that is true if the list is empty
	 */
	public boolean isEmpty() {
		
		if(head==null) {
			
			return true;
			
		}
		
		else return false;
		
	}//end isEmpty
	
	/**
	 * gets a list
	 * @return the head of the list
	 */
	public NodeG<T> getList() {
		
		return head;
		
	}//end get list
	
	/**
	 * gets the size of the list
	 * @return an int indicating the size of the linked list
	 */
	public int getSize() {
		
		NodeG<T> tempNode = new NodeG<T>();
		int size=0;
		
		for(tempNode=head;tempNode.getNextNode() != null; tempNode = tempNode.getNextNode()){
			size++;
		}
		
		return size;
	}//end getSize
	
	/**
	 * removes the head of the list and makes the next node the head
	 * @return data as the new head
	 */
	public T remove() {
		
		T data = head.getData();
		head = head.getNextNode();
		length--;
		
		return data;
	}//end remove
	
	//creates a new node at the tail of the list
	public void addNode(NodeG<T> newEntry) {
		
		if(isEmpty()) {
			head=newEntry;
			tail=head;
			return;
			
		}
		
		tail.setNextNode(newEntry);
		tail=tail.getNextNode();
		tail.setNextNode(null);
		length++;		
		
	}//end addNode

}//end LinkedListG class
