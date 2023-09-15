package ex;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(9);
		
		//for breadth first and depth first
		Node n1 = new Node('1');//state 1
		Node n2 = new Node('2');//state 2
		Node n3 = new Node('3');//state 3
	
		Node n4 = new Node('4');//state 4
		Node n5 = new Node('5');//state 5
		Node n6 =  new Node('6');//state 6
		Node n7 =  new Node('7');//state 7
		Node n8 =  new Node('8');//state 8
		Node n9 =  new Node('9');//state 9
		
		//adding nodes to graph
		graph.addNode(n1);
		graph.addNode(n2);
		graph.addNode(n3);
		graph.addNode(n4);
		graph.addNode(n5);
		graph.addNode(n6);
		graph.addNode(n7);
		graph.addNode(n8);
		graph.addNode(n9);
		//adding edges
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 0);
		graph.addEdge(1, 2);
		graph.addEdge(1, 7);
		graph.addEdge(2, 0);
		graph.addEdge(2, 1);
		graph.addEdge(2, 5);
		graph.addEdge(3, 4);
		graph.addEdge(3, 5);
		graph.addEdge(3, 6);
		graph.addEdge(4, 3);
		graph.addEdge(4, 5);
		graph.addEdge(5, 2);
		graph.addEdge(5, 3);
		graph.addEdge(5, 4);
		graph.addEdge(6, 3);
		graph.addEdge(6, 7);
		graph.addEdge(6, 8);
		graph.addEdge(7, 1);
		graph.addEdge(7, 6);
		graph.addEdge(7, 8);
		graph.addEdge(8, 6);
		graph.addEdge(8, 7);
		
		graph.printGraph();//print graph as adjacency matrix
		System.out.println("breadth: ");
		graph.breadthFirstSearch(0);
		System.out.println("depth: ");
		graph.depthFirstSearch(0);
		
		graph.nodes.clear();
		//for best and A*
		Node node1 = new Node('1',3);//state 1
		Node node2 = new Node('2',2);//state 2
		Node node3 = new Node('3',3);//state 3
		Node node4 = new Node('4',2);//state 4
		Node node5 = new Node('5',3);//state 5
		Node node6 =  new Node('6',3);//state 6
		Node node7 =  new Node('7',1);//state 7
		Node node8 =  new Node('8',1);//state 8
		Node node9 =  new Node('9',0);//state 9
		
		//adding nodes to graph
				graph.addNode(node1);
				graph.addNode(node2);
				graph.addNode(node3);
				graph.addNode(node4);
				graph.addNode(node5);
				graph.addNode(node6);
				graph.addNode(node7);
				graph.addNode(node8);
				graph.addNode(node9);
				//adding edges
				graph.addEdge(0, 1);
				graph.addEdge(0, 2);
				graph.addEdge(1, 0);
				graph.addEdge(1, 2);
				graph.addEdge(1, 7);
				graph.addEdge(2, 0);
				graph.addEdge(2, 1);
				graph.addEdge(2, 5);
				graph.addEdge(3, 4);
				graph.addEdge(3, 5);
				graph.addEdge(3, 6);
				graph.addEdge(4, 3);
				graph.addEdge(4, 5);
				graph.addEdge(5, 2);
				graph.addEdge(5, 3);
				graph.addEdge(5, 4);
				graph.addEdge(6, 3);
				graph.addEdge(6, 7);
				graph.addEdge(6, 8);
				graph.addEdge(7, 1);
				graph.addEdge(7, 6);
				graph.addEdge(7, 8);
				graph.addEdge(8, 6);
				graph.addEdge(8, 7);
				System.out.println();
				graph.printGraph();
			System.out.println("Best: ");
			graph.bestFirstSearch(0);
		
			
		Path p1 = new Path(node1,node2,3);
		Path p2 = new Path(node1,node3,4);
		Path p3 = new Path(node2,node8,2);
		Path p4 = new Path(node2,node3,3);
		Path p5 = new Path(node2,node1,3);
		Path p6 = new Path(node3,node1,4);
		Path p7 = new Path(node3,node2,3);
		Path p8 = new Path(node3,node6,4);
		Path p9 = new Path(node6,node3,4);
		Path p10 = new Path(node6,node4,3);
		Path p11 = new Path(node6,node5,4);
		Path p12 = new Path(node5,node6,4);
		Path p13 = new Path(node5,node4,3);
		Path p14 = new Path(node4,node6,3);
		Path p15 = new Path(node4,node5,3);
		Path p16 = new Path(node4,node7,2);
		Path p17 = new Path(node7,node4,2);
		Path p18 = new Path(node7,node8,2);
		Path p19 = new Path(node7,node9,1);
		Path p20 = new Path(node8,node2,2);
		Path p21 = new Path(node8,node7,2);
		Path p22 = new Path(node8,node9,1);
		Path p23 = new Path(node9,node8,1);
		Path p24 = new Path(node9,node7,1);
		
		
		
		ArrayList<Path> path = new ArrayList<>();
		path.add(p1);
		path.add(p2);
		path.add(p3);
		path.add(p4);
		path.add(p5);
		path.add(p6);
		path.add(p7);
		path.add(p8);
		path.add(p9);
		path.add(p10);
		path.add(p11);
		path.add(p12);
		path.add(p13);
		path.add(p14);
		path.add(p15);
		path.add(p16);
		path.add(p17);
		path.add(p18);
		path.add(p19);
		path.add(p20);
		path.add(p21);
		path.add(p22);
		path.add(p23);
		path.add(p24);
		
		graph.addPath(path);
		System.out.println("A*: ");
		graph.aStarSearch(node1);	
		
		
	}

}
