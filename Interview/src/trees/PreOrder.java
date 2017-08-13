package trees;

import java.util.Stack;

public class PreOrder {

	public static void main(String[] args) {
		CreateTree createTree = new CreateTree();
		Node root = createTree.createTree();
		PreOrder order = new PreOrder();
		order.preOrder(root);
		System.out.println();
		order.preOrderIterative(root);
	}
	
	void preOrder(Node root) {
		if (root != null) {
			System.out.print(" " + root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	void preOrderIterative(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		Node node = null;
		while(!stack.isEmpty()) {
			node = stack.pop();
			System.out.print(" " + node.data);
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
		}
	}
}
