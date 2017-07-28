package com.rakesh.linkedlist.ex1;

public class Node {

	public int data;
	public Node nextNode;
	
	
	//this is use to create a simple node, we can set data + pointer by using setter getter
	public Node() {

	}

	// this is for last node with no next pointer
	public Node(int val) {
		data = val;
	}

	// this for all middle node, having data + pointer both
	public Node(int val, Node next) {
		data = val;
		nextNode = next;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [nextNode=" + nextNode + ", data=" + data + "]";
	}

}
