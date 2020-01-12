package gui;

import dataStructure.DGraph;
import dataStructure.Node;
import utils.Point3D;

public class TestGraphGUI {

	public static void main(String[] args) throws InterruptedException {
		
		
		DGraph graph = new DGraph();
		
		Node n0 = new Node(0);
		n0.setLocation(new Point3D(32.2,35.8));
		Node n1 = new Node(1);
		n1.setLocation(new Point3D(32.6,35.2));
		Node n2 = new Node(2);
		n2.setLocation(new Point3D(32.3,35.4));
		
		graph.connect(0, 2, 3);
		graph.connect(2, 1, 3);
		
		graph.addNode(n0);
		graph.addNode(n1);
		graph.addNode(n2);
		
		Graph_GUI g = new Graph_GUI(graph);
		g.drawGraph();//build  example graph 
		g.listening();

	}

}
