package trees;

import java.util.Stack;

public class PostOrder {
	public static void main(String[] args) {
		(new PostOrder()).postOrder((new CreateTree()).createTree());
		System.out.println();
		(new PostOrder()).postOrderIterative((new CreateTree()).createTree());
		System.out.println();
		(new PostOrder()).postOrderSingleStackItr((new CreateTree()).createTree());
	}
	
	void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(" " + root.data);
		}
	}
	
	void postOrderIterative(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		Node node = root;
		stack1.push(node);
		while (!stack1.isEmpty()) {
			node = stack1.pop();
			stack2.push(node);
			if (node.left != null) {
				Node leftNode = node.left;
				stack1.push(leftNode);
			}
			if (node.right != null) {
				Node rightNode = node.right;
				stack1.push(rightNode);
			}
		}
		while (!stack2.isEmpty()) {
			System.out.print(" " + (stack2.pop()).data);
		}
	}
	void postOrderSingleStackItr(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		Node current = root;
		Node temp = null;
		while (current != null || (!stack.isEmpty())) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				temp = stack.peek().right;
				if (temp ==null) {
					temp = stack.pop();
					System.out.print(" " + temp.data);
					while (!stack.isEmpty() && stack.peek().right == temp) {
						temp = stack.pop();
						System.out.print(" " + temp.data);
					}
				} else {
					current = temp;
				}
			}
		}
	}
}
