package trees;

import java.util.Stack;

public class InOrder {
	public static void main(String[] args) {
		CreateTree createTree = new CreateTree();
		Node root = createTree.createTree();
		InOrder inOrder = new InOrder();
		inOrder.inOrder(root);
		System.out.println();
		inOrder.inOrderIterative(root);
	}
	
	void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(" " + root.data);
			inOrder(root.right);
		}
	}
	
	void inOrderIterative(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		//stack.push(root);
		Node node = root;
		while (true) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				if (stack.isEmpty()) {
					break;
				}
				node = stack.pop();
				System.out.print(" " + node.data);
				node = node.right;
			}
		}
	}
}
