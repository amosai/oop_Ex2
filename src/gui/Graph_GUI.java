package gui;

import algorithms.Graph_Algo;
import dataStructure.edge_data;
import dataStructure.graph;
import dataStructure.node_data;
import utils.Point3D;
import utils.StdDraw;

public class Graph_GUI {


	private double left ; 
	private double right ;
	private double top ;
	private double bottom ;
	private graph g;


	public Graph_GUI(graph g) {
		super();
		this.g = g;
		set_box();
	}
	public  void set_box() {

		Graph_Algo algo = new Graph_Algo(this.g);
		this.left=algo.get_left();
		this.right =algo.get_right();
		this.top=algo.get_top();
		this.bottom=algo.get_bottom();

	}
	public  Point3D screen_position(Point3D p) {

		
		double x=Math.abs((p.x()-left)/(left -right));
		x = 0.9*x+0.03;
		double y=Math.abs((p.y()-bottom)/(bottom -top));
		y = 0.9*y+0.03;

		return new Point3D(x,y);

	}
	public void drawNodes() {

		StdDraw.setPenRadius(0.04);
		StdDraw.setPenColor(StdDraw.BLUE);
		
		
		for (node_data v  :g.getV()) {
			if (v.getLocation()==null)
				continue;
			Point3D sp=screen_position(v.getLocation());

			StdDraw.point(sp.x(), sp.y());
			StdDraw.text(sp.x(), sp.y()+0.04, ""+v.getKey());

		}
	}

		public void drawEdges() {

			StdDraw.setPenRadius(0.01);
			StdDraw.setPenColor(StdDraw.MAGENTA);
			
			for (node_data v  :g.getV()) {
				if (v.getLocation()==null)
					continue;
				
				if( g.getE(v.getKey()) == null)
					continue;
				
				for (edge_data ed : g.getE(v.getKey())) {
					node_data u = g.getNode(ed.getDest());
					if (u.getLocation()==null)
						continue;
					
					Point3D vsp=screen_position(v.getLocation());
					Point3D usp=screen_position(u.getLocation());
					
					double xc = Math.abs( (usp.x() + vsp.x())/2 );//x center
					double yc = Math.abs( (usp.y() + vsp.y())/2 );
					
					double xd = Math.abs(  (usp.x() - vsp.x())*7/8 + vsp.x() );
					double yd = Math.abs(  (usp.y() - vsp.y())*7/8 + vsp.y() );//y derection
					
					StdDraw.setPenColor(StdDraw.MAGENTA);
					StdDraw.line(vsp.x(), vsp.y(), usp.x(), usp.y());
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.point(xd, yd);
					StdDraw.setPenColor(StdDraw.BLACK);
					StdDraw.text(xc, yc+0.02, ""+ed.getWeight());
				}
				

				

			}
		


	}

	public void drawGraph() {
		drawEdges();
		drawNodes();
		
		/*StdDraw.setPenRadius(0.05);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.point(0.5, 0.5);*/
		



		/*StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.line(0.2, 0.2, 0.8, 0.2);*/

	}

	public void listening() throws InterruptedException {
		char c = 0;
		while (c != 'q') {

			if (StdDraw.hasNextKeyTyped()) {
				c = StdDraw.nextKeyTyped();
			} 

			switch (c) {
			case 's':
				System.out.println("save");
				break;

			case 'l':
				System.out.println("load");
				break;

			case 'q':
				System.out.println("load");
				break;

			default:
				break;
			}

			c = 0;
			Thread.sleep(15);

		}
	}

}
