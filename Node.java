package asg_2;

class Node {
	public String name;
	public int year;
	public Node child,sibling;
	
	public Node(String n, int y, Node c, Node s){
		name = n;
		year = y;
		child = c;
		sibling = s;
		
	}
}
