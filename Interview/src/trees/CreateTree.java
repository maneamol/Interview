package trees;

public class CreateTree {

	public Node createTree() {
		/*Node root = new Node(1);
		Node node = root;
		node.left = new Node(2);
		node.right = new Node(3);
		node.left.left = new Node(4);
		node.left.right = new Node(5);
		node.right.left = new Node(6);
		node.right.right = new Node(7);
		node.left.left.left = new Node(8);
		node.left.left.right = new Node(9);
		node.left.right.left = new Node(10);
		node.left.right.right = new Node(11);
		node.right.left.left = new Node(12);
		node.right.left.right = new Node(13);
		node.right.right.left = new Node(14);
		node.right.right.right = new Node(15);*/
		
		Node root = new Node(25);
		Node node = root;
		
		node.left = new Node(18);
		node.left.left = new Node(19);
		node.left.right = new Node(20);
		node.left.left.right = new Node(15);
		node.left.right.left = new Node(21);
		node.left.right.right = new Node(25);
		
		node.right = new Node(50);
		node.right.left = new Node(35);
		node.right.right = new Node(60);
		node.right.left.left = new Node(20);
		node.right.left.right = new Node(40);
		node.right.left.left.right = new Node(25);
		node.right.right.left = new Node(55);
		node.right.right.right = new Node(70);
		return root;
	}
}
