package asg_2;
/*
 * This class was created so that Nodes would be able to be pushed easier
 * 	into the stack
 */
class sNode {
	Node item;
	sNode next;
	public sNode(Node i, sNode n ){
		item = i;
		next = n;
	}
}
