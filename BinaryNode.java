package swordOffer;

public class BinaryNode {
	public BinaryNode lChild;
	public BinaryNode rChild;
	public int data;
	
	public BinaryNode() {}
	public BinaryNode(int data) {
		this.data = data;
	}
	public BinaryNode(int data, BinaryNode lChild, BinaryNode rChild) {
		this.data = data;
		this.lChild = lChild;
		this.rChild = rChild;
	}
}
