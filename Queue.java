package asg_2;

public class Queue {
	sNode front;
	sNode p;
	public Queue( ){
		front = null;
	}
	
	//Adds a node to the back of the queue
	public void enqueue(Node n){
		p = front;
		if(p == null){
			front = new sNode(n,front);
		}else{
			while(p.next!= null){
				p = p.next;
			}
			p.next = new sNode(n, null);
		}
	}
	
	//Removes a Node from the front of the Queue
	public Node dequeue( ){
		Node i;
		
		if(front == null){
			throw new NoItemException();
		}
		else {
			i = front.item;
			front=front.next;
			return i;
		}
	}
	
	//Checks if the queue is empty
	public boolean empty(){
		return front==null;
	}
	
	//Returns the Data from the front most node but does not dequeue
	public Node peak(){
		Node i;
		i = front.item;
		return i;
	}
}
