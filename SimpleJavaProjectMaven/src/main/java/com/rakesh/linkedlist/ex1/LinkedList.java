package com.rakesh.linkedlist.ex1;

public class LinkedList {
	/*
	 * printing in reverse order
	 */
	Node root;
	int size;
	
	public LinkedList(){
		//root = new Node();
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	//Linked list methods
	public Node add(int data){
		Node newNode = new Node(data,root);
		this.root = newNode;
		this.size++;
		return newNode;
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
	
	/*public void printLinkedList(){
		Node currentNode = this.root;
		while(currentNode != null){
			System.out.print(" ==> "+currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
	}*/
	public void printLinkedList(){
		Node currentNode = this.root;
		int index=0;
		while(currentNode != null){
			System.out.print("["+index+","+currentNode.getData()+"] ==>>");
			currentNode = currentNode.getNextNode();
			index++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList ll = new LinkedList();
		System.out.println("what is size now?-->"+ll.getSize());
		ll.add(8);
		System.out.println("what is size now?-->"+ll.getSize());
		ll.add(17);
		ll.add(5);
		ll.add(15);
		ll.add(20);//8->17->5->15->20
		System.out.println("what is size now?-->"+ll.getSize());
		
		System.out.println(ll.find(17).getData());
		//ll.remove(15);//8->17->5->20
		System.out.println("what is size now?-->"+ll.getSize());
		System.out.println(ll.find(15));
		//System.out.println(ll.remove(55));
		ll.printLinkedList();
		
	}

}
