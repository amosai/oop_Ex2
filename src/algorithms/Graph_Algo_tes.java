package algorithms;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import dataStructure.DGraph;
import dataStructure.Node;
import dataStructure.graph;
import dataStructure.node_data;

class Graph_Algo_tes {

	private DGraph connectGraph() {
		DGraph graph = new DGraph();
		graph.addNode(new Node(1));
		graph.addNode(new Node(2));
		graph.addNode(new Node(3));
		graph.connect(1, 3, 10);
		graph.connect(1, 2, 1);
		
		graph.connect(2, 3, 1);
		graph.connect(3, 1, 10);
		return graph;
	}
	
	private DGraph notConnectGraph() {
		DGraph graph = new DGraph();
		graph.addNode(new Node(1));
		graph.addNode(new Node(2));
		graph.addNode(new Node(3));
		graph.connect(1, 3, 1);
		graph.connect(1, 2, 1);
		

		return graph;
	}
	
	@Test
	void testInitGraph() {
		fail("Not yet implemented");
	}

//	@Test
//	void testInitString() {//test copy implement
//		Graph_Algo algo = new Graph_Algo(null);
//		algo.init("test.txt");
//		System.out.println( algo.g );
//		fail("Not yet implemented");
//	}
//	@Test
//	void testSave() {//test copy implement
//		DGraph graph = connectGraph();
//		Graph_Algo algo = new Graph_Algo(graph);
//		
//		//algo.save("test.txt");
//		fail("Not yet implemented");
//	}

	@Test
	void testIsConnected() {
		DGraph conGraph = connectGraph();//
		DGraph NConGraph = notConnectGraph();
		
		Graph_Algo algo = new Graph_Algo(conGraph);
		
		assertEquals(true, algo.isConnected());
		algo.init(NConGraph);
		assertEquals(false, algo.isConnected());
	}

	@Test
	void testShortestPathDist() {
		//(1) --> 3 --> (2)
		DGraph graph = new DGraph();
		graph.addNode(new Node(1));
		graph.addNode(new Node(2));
		graph.connect(1, 2, 3);
		Graph_Algo algo = new Graph_Algo(graph);
		
		double dist = algo.shortestPathDist(1, 2);
		assertEquals(3, dist);
		
		graph = connectGraph();
		algo.init(graph);
		dist = algo.shortestPathDist(1, 3);
		assertEquals(2, dist);

		
		
		
	}

	@Test
	void testShortestPath() {
		DGraph graph = new DGraph();
		graph.addNode(new Node(1));
		graph.addNode(new Node(2));
		graph.connect(1, 2, 3);
		Graph_Algo algo = new Graph_Algo(graph);
		
		List<node_data> l = algo.shortestPath(1, 2);
		assertEquals("[Node [key=2, location=null], Node [key=1, location=null]]", l.toString());
		
		
		graph = connectGraph();
		algo.init(graph);
		l = algo.shortestPath(1, 3);
		assertEquals("[Node [key=3, location=null], Node [key=2, location=null], Node [key=1, location=null]]", l.toString());
	}

	@Test
	void testTSP() {
		fail("Not yet implemented");
	}

	@Test
	void testCopy() {
		

		graph a = connectGraph();
		Graph_Algo algo = new Graph_Algo(a);
		graph b = algo.copy();
		
		assertEquals(a.toString(), b.toString());
		b.addNode(new Node(4));
		b.connect(3, 4, 1);
		assertNotEquals(a.toString(), b.toString());
	}

}
