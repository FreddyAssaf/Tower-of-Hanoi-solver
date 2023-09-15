package ex;
import java.util.*;


public class Graph{
	ArrayList<Node>nodes;
	ArrayList<Path>paths;
	int[][]matrix;
	Path path;
	
	public Graph(int size) {
		nodes = new ArrayList<Node>();
		paths = new ArrayList<Path>();
		matrix = new int [size][size];
	}
	
	public void addNode(Node n) {//adds the nodes
		this.nodes.add(n);
	}
	public void addEdge(int src,int dest) {//add the edges between the nodes
		this.matrix[src][dest] = 1;
	}
	public void printGraph() { //printing graph as adjacency matrix
		System.out.print("  ");
		for(Node n:nodes)
			System.out.print(n.getData()+" ");
		System.out.println();
		
		for(int i = 0;i<this.matrix.length;i++) {
			System.out.print(nodes.get(i).getData()+" ");
			for(int j = 0;j<this.matrix[i].length;j++) {
				System.out.print(this.matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public void breadthFirstSearch(int src) {
		Queue<Integer>queue = new LinkedList<>();
		boolean []visited = new boolean[this.matrix.length];
		
		queue.offer(src);
		visited[src] = true;
		
		while(queue.size()!=0) {
			src = queue.poll();
			System.out.println(nodes.get(src).getData()+" = visited");
			
			
			for(int i = 0;i<this.matrix[src].length;i++) {
				if(this.matrix[src][i] == 1 & visited[i]!=true) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
		
	}
	public void depthFirstSearch(int src) {
		boolean []visited = new boolean[this.matrix.length];
		dfs(src,visited);
	}
	private void dfs(int src, boolean[] visited) {
		
		if(visited[src])
			return;
		else {
			visited[src] = true;
			System.out.println(this.nodes.get(src).getData()+" = visited");
			
		}
		for(int i = 0;i < this.matrix[src].length;i++) {
			if(this.matrix[src][i] == 1)
				dfs(i,visited);
		}
	}
	public void bestFirstSearch(int src) {
		ArrayList<Integer>openedList = new ArrayList<>();//we use it to add the neighboring nodes of the source nodes
		//and compare their heuristic values
		ArrayList<Integer>closedList = new ArrayList<>();//adding the successful nodes of minimal value thus creating a path
		
		openedList.add(src);//Starting node
		closedList.add(src);
		
		while(true) {
			if(nodes.get(src).getCost() == 0) {//if goal node is reached then h(x) of node = 0
				String result = "";				
				for(Integer i:closedList) {
					result+=this.nodes.get(i).getData()+" ";
				}
				System.out.println(result);//prints the successful nodes from closed lists
				break;//break the infinite loop as result is reached
			}
			openedList.clear();//clears src node from the opened list
			
			for(int i = 0;i<this.matrix[src].length;i++) {
				if(this.matrix[src][i] == 1) {
					openedList.add(i);
				}//ADDING SUCCESSORS TO THE OPENED LIST	
			}
			int cost = nodes.get(openedList.get(0)).getCost();//will carry the value of least heuristic value
			for(int i = 0;i<openedList.size();i++) {
				if(cost>nodes.get(openedList.get(i)).getCost())
					cost = nodes.get(openedList.get(i)).getCost();//comparing for minimum heuristic value of successor nodes
			}
			Node node = new Node();
			for(Node n:nodes) {
				if(n.getCost() == cost){//finding the node of the minimum heuristic value
					closedList.add(nodes.indexOf(n));
					node = n;
				}//adding node of minimum heuristic value to the closed list
			}
			openedList.clear();//we clear the opened list again 
			
			src = nodes.indexOf(node);//src node becomes the successor node of a minimal heuristic value
		}
	}
	public void addPath(ArrayList<Path>p) {//to add the ArrayList of paths created in the mainClass to the graph class
		this.paths = p;
	}
	public String printPath(ArrayList<Path>pa) {//it will be used once the goal node reached to print the paths
		String result = " ";
		for(Path p:pa) {
			result+=p.getSrc().getData()+" "+p.getDest().getData()+"   ";
		}
		return result;
	}
	public void aStarSearch(Node src) {
		ArrayList<Node>visited = new ArrayList<>();//add the visited nodes 
		ArrayList<Path>success = new ArrayList<>();//add the successful paths of least f(x) = g(x)+h(x)
		ArrayList<Path>temp = new ArrayList<>();//will be used and a temporary arraylist of paths
		Path path = new Path();//to be representing the successful path
		visited.add(src);//we start by marking src node as visited
		
		for(Path p:paths) {//loop through the paths arraylist
			if(src == p.getSrc())//if the src node is = to the src node of the path in the arraylist
				temp.add(p);//this means the src node is of this path so we add the path to the temp arraylist
		}
		path = temp.get(0);//path will be = to the first path of the temp arraylist
		for(Path p:temp) {//we check the path of the least f(x)
			if((path.getCost()+path.getDest().getCost())>(p.getCost()+p.getDest().getCost()))
				path = p;
		}
		success.add(path);//add it as successful path and we start with it
		temp.clear();
		
		while(!paths.isEmpty()) {
			int cost = 0;
			for(Path p:success) {//to add the g(x) of each path
				cost+=p.getCost();
			}
			if(path.getDest().getCost() == 0) {//goal node reached then break out 
				System.out.println(this.printPath(success));	
				break;
			}
			
			for(Path p:paths) {//adding successor paths in graph
				if(path.getDest() == p.getSrc() && !visited.contains(p.getDest())) {//if the dest node of the successful path
					temp.add(p);//that we are using is = to the src node of the other paths then those 2 nodes are neighbors
					visited.add(p.getDest());//we mark the dest node as visited
				}
			}
			path = temp.get(0);
			for(Path p:temp) {//comparing f(x) of temp
				if((path.getCost()+cost+path.getDest().getCost())>p.getCost()+cost+p.getCost())
					path = p;
			}
			success.add(path);//mark the path as successful if f(x) is minimal
			temp.clear();
		}
		
	}
}











