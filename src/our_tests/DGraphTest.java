package our_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataStructure.DGraph;
import dataStructure.Edge;
import dataStructure.Node;
import dataStructure.node_data;

class DGraphTest {

	@Test
	void testGetNode() {
		Node n1=new Node ( 1);
		//Node n2=new Node;
		DGraph a=new DGraph();
		DGraph b=new DGraph();
		a.addNode(n1);
		//Node n3=new a.getNode(1);
		assertEquals(n1,a.getNode(1) );
	}

	@Test
	void testGetEdge() {
		Node n1=new Node ( 1);
		Node n2=new Node ( 2);
		//Node n2=new Node;
		DGraph a=new DGraph();
		a.addNode(n1);
		a.addNode(n2);
		a.connect(n1.getKey(), n2.getKey(), 4.5);
		Edge e=new Edge ( 1,2,4.5);
		a.getEdge(1, 2);
		assertEquals(e.toString(),a.getEdge(1, 2).toString() );//without to string its not make it 


	}

	@Test
	void testAddNode() {
		node_data n=new Node(0);

		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testConnect() {
		Node n1=new Node ( 1);
		Node n2=new Node ( 2);
		Node n3=new Node ( 3);

		//Node n2=new Node;
		DGraph a=new DGraph();

		a.addNode(n1);
		//System.out.println(a.toString());
		a.addNode(n2);
		a.connect(1, 2, 4.5);
		Edge e=new Edge ( 1,2,4.5);
		assertEquals(e.toString(),a.getEdge(1, 2).toString() );//without to string its not make it 
		//		//System.out.println(a.getEdge(1, 2));
		//		a.addNode(n3);
		//		System.out.println(a);
		//		a.connect(2, 3, 6);
		//		System.out.println(a);
		//		a.connect(1, 2, 4.5);
		//		System.out.println(a);
		//		System.out.println(a.getEdge(1,2));
		//		System.out.println(n1);
	}

	@Test
	void testGetV() {
		fail("Not yet implemented");
	}

	@Test
	void testGetE() {
		fail("Not yet implemented");
	}

	@Test
	void testRemoveNode() {
		Node n1=new Node ( 1);
		Node n2=new Node ( 2);
		Node n3=new Node ( 3);


		DGraph a=new DGraph();

		a.addNode(n1);
		a.addNode(n2);
		a.addNode(n3);
		a.connect(1, 2, 4.5);
		a.connect(2, 3, 7);
		//	System.out.println(a.toString());
		//		System.out.println(a.removeNode(2));
		//		System.out.println(a.toString());
		/// do assert......

	}

	@Test
	void testRemoveEdge() {
		Node n1=new Node ( 1);
		Node n2=new Node ( 2);
		Node n3=new Node ( 3);


		DGraph a=new DGraph();

		a.addNode(n1);
		a.addNode(n2);
		a.addNode(n3);
		a.connect(1, 2, 4.5);
		a.connect(2, 3, 7);
		
		System.out.println(a.toString());
		a.removeEdge(2, 3);
			//System.out.println(a.removeNode(2));
			System.out.println(a.toString());;
	}

	@Test
	void testNodeSize() {
		Node n1=new Node ( 1);
		Node n2=new Node ( 2);
		Node n3=new Node ( 3);


		DGraph a=new DGraph();

		a.addNode(n1);
		a.addNode(n2);
		a.addNode(n3);
		a.connect(1, 2, 4.5);
		a.connect(2, 3, 7);
		
		assertEquals(3,a.nodeSize());
	}

	@Test
	void testEdgeSize() {
		Node n1=new Node ( 1);
		Node n2=new Node ( 2);
		Node n3=new Node ( 3);


		DGraph a=new DGraph();

		a.addNode(n1);
		a.addNode(n2);
		a.addNode(n3);
		a.connect(1, 2, 4.5);
		a.connect(2, 3, 7);
		a.removeNode(1);
		assertEquals(1, a.edgeSize());
	}

	@Test
	void testGetMC() {
		Node n1=new Node ( 1);
		Node n2=new Node ( 2);
		Node n3=new Node ( 3);


		DGraph a=new DGraph();

		a.addNode(n1);
		a.addNode(n2);
		a.addNode(n3);
		a.connect(1, 2, 4.5);
		a.connect(2, 3, 7);
		
		assertEquals(5,a.getMC());
	}

}
