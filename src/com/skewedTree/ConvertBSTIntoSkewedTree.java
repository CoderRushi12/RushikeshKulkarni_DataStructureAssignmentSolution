package com.skewedTree;

public class ConvertBSTIntoSkewedTree {

	public static Node node;

	static Node previousNode = null;
	static Node headNode = null;

	static void convertBSTtoRightSkewedTree(Node root) {

		if (root == null) {
			return;
		}

		convertBSTtoRightSkewedTree(root.left);

		Node rightNode = root.right;
		Node leftNode = root.left;

		if (headNode == null) {
			headNode = root;
			root.left = null;
			previousNode = root;
		} else {
			previousNode.right = root;
			root.left = null;
			previousNode = root;
		}

		convertBSTtoRightSkewedTree(rightNode);
	}

	static void traverseRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.key + " ");
		traverseRightSkewedTree(root.right);
	}

	public static void main(String[] args) {

		ConvertBSTIntoSkewedTree tree = new ConvertBSTIntoSkewedTree();

		tree.node = new Node(6);
		tree.node.left = new Node(3);
		tree.node.right = new Node(8);
		tree.node.left.left = new Node(1);
		tree.node.left.right = new Node(4);
		tree.node.right.left = new Node(7);
		tree.node.right.right = new Node(10);

		convertBSTtoRightSkewedTree(node);
		traverseRightSkewedTree(headNode);
	}

}
