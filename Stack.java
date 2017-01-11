package asg_2;

public class Stack {
	private sNode top;
	
	public Stack( ){
		top = null;
	}
	
	//Adds a Node to the Stack
	public void push(Node n){
		top = new sNode(n, top);
	}
	
	//Removes the top Node from the Stack
	public Node pop( ){
		Node i;
		
		if(top == null){
			throw new NoItemException();
		}
		else {
			i = top.item;
			top=top.next;
			return i;
		}
	}
	
	//Gives the Data from the top node but does not remove it
	public Node top( ){
		if(top == null){
			throw new NoItemException();
		}
		else{
			return top.item;
		}
	}
	
	//Returns the depth or length of the stack
	public int depth( ){
		sNode p = top;
		int i =0;
		while(p!=null){
			p=p.next;
			i++;
		}
		return i;
	}
	
	//Checks if there are any nodes in the stack
	public boolean empty(){
		return top == null;
	}
}
