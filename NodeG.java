/**
 * Creates a node to be used with a linked list and a queue to form a line
 * 
 * @author Jim Farese
 * @version 10/09/22
 * 
 * Fall 2022
 */


public class NodeG<T> {
	
	private T data;
	private NodeG<T> nextNode;

	//Constructor
	public NodeG() {
		setNextNode(null);
		data=null;
	}//end NodeG

	//Data and next node
	public NodeG(T data, NodeG<T> nextnode) {
		
		this.data = data;
		this.nextNode = nextNode;
		
	}//end NodeG
	
	//sets data
	public void setData(T data) {
		this.data=data;
		
	}//end setData
	
	//gets data
	public T getData() {
		
		return this.data;
		
	}//end getData
	
	//get Node
	public NodeG<T> getNode() {
		return nextNode;
	}//end getNode
	 
	//sets the next node
	public void setNextNode(NodeG<T> nextNode) {
		this.nextNode=nextNode;
		
	}//end setNextNode
	
	//gets the next node
	public NodeG<T> getNextNode() {
		return nextNode;
	}//end getNextNode


}//end NodeG class
