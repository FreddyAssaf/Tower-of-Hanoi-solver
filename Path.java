package ex;

public class Path {//for A*Search
	private Node src,dest;
	private int cost;
	
	public Path() {
		
	}
	public Path(Node src,Node dest,int cost) {
		this.cost = cost;
		this.src = src;
		this.dest = dest;
		}
	
	public int getCost() {
		return cost;
	}
	public Node getSrc() {
		return src;
	}
	public Node getDest() {
		return dest;
	}
	
}
	

