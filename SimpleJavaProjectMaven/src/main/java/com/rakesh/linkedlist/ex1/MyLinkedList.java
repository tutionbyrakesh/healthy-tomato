package com.rakesh.linkedlist.ex1;

public class MyLinkedList {
	/*
	 * My Linked List : printing in forward order, working fine.
	 */
	Node root = null;
	int size;
	
	public MyLinkedList(){
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	// Linked list methods
	public Node add(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		
		if (root == null) {
			root = newNode;
		} else {
			Node currentNode = root;
			while (currentNode.getNextNode() != null){
				//find which object at last means that's getNextNode should be null
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);

		}
		this.size++;
		return newNode;
	}
	
	public void printLinkedList(){
		Node currentNode = this.root;
		while(currentNode != null){
			System.out.print("["+currentNode.getData()+"] ==>>");
			currentNode = currentNode.getNextNode();
		}
	}
	
	public Node find(int data){
		Node currentNode = this.root;
		while(currentNode != null){
			if(currentNode.getData() == data){
				return currentNode;
			}
			currentNode = currentNode.getNextNode();
		}
		return null;
	}
	
	public boolean remove(int data){
		Node currentNode = this.root;
		Node previousNode = null;
		while(currentNode != null){
			if(currentNode.getData() == data){
				previousNode.setNextNode(currentNode.getNextNode());
				this.setSize(this.getSize()-1);
				return true;
			}
			previousNode = currentNode;
			currentNode = currentNode.getNextNode();
		}
		return false;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLinkedList ll = new MyLinkedList();
		System.out.println("what is size now?-->"+ll.getSize());
		ll.add(8);
		System.out.println("what is size now?-->"+ll.getSize());
		ll.add(17);
		ll.printLinkedList();
		ll.add(5);
		ll.add(15);
		ll.add(20);//8->17->5->15->20
		System.out.println("what is size now?-->"+ll.getSize());
		
		//System.out.println(ll.find(17).getData());
		//ll.remove(15);//8->17->5->20
		System.out.println("what is size now?-->"+ll.getSize());
		System.out.println(ll.find(15));
		//System.out.println(ll.remove(55));
		ll.printLinkedList();
		
	}

}
