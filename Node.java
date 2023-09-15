package ex;

public class Node{
	private char data;
	private int cost;
	
	public Node() {
		
	}
	public Node(char data) {//for breadth first and depth first
		this.data = data;
	}
	public Node(char data,int cost) {//for best first search and a*
		this.data = data;
		this.cost = cost;//supposing no validations
	}
	public int getCost() {
		return cost;
	}
	public char getData() {
		return this.data;
	}
}
	