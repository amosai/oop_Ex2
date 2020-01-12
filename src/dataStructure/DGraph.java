package dataStructure;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DGraph implements graph{
	
	//int[]src_dest=new int[2];
	private HashMap<Integer, node_data> nodes=new HashMap<>();
//private HashMap<Integer,HashMap<Integer, edge_data > dests=new HashMap<>() > edges=new HashMap<>();
	private HashMap<Integer, ArrayList<edge_data> > edges=new HashMap<>();//the init line
	private int modeCount = 0;
	private int edgesCount = 0;
	@Override
	public node_data getNode(int key) {
		
		return this.nodes.get(key);
	}

	@Override
	public edge_data getEdge(int src, int dest) {

		ArrayList<edge_data> srcs = this.edges.get(src);// why we not need new?
		for(edge_data ed:srcs)//ed = edge_data.
			if(ed.getDest() == dest)
				return ed;
		
		return  null;
				

	}

	@Override
	public void addNode(node_data n) {
		modeCount++;
		this.nodes.put(n.getKey(),n );
		
	}

	@Override
	public String toString() {
		return "DGraph [nodes=" + nodes + ", edges=" + edges + "]";
	}

	@Override
	public void connect(int src, int dest, double w) {
		modeCount++;
		edgesCount++;
		ArrayList<edge_data> srcs = this.edges.get(src);
		
		if(srcs == null) {
			edges.put(src, new ArrayList<edge_data>());
			srcs = this.edges.get(src);
		}
		
		
		edge_data ed = new Edge(src, dest, w);
		srcs.add(ed);
		
		//this.edges.put(b.getkey(), b);
		
		//this.edges.put(this.edges.get(), b);
	}

	@Override
	public Collection<node_data> getV() {// maybe with clone method
		
		return this.nodes.values();
	}

	@Override
	public Collection<edge_data> getE(int node_id) { //maybe with clone method
		ArrayList<edge_data> srcs = this.edges.get(node_id);
		return srcs;
	}

	@Override
	public node_data removeNode(int key) {
		node_data n= getNode(key);
		
		ArrayList<edge_data> srcs = this.edges.get(key);
		edgesCount-= srcs.size();//Count edges with src key.
		this.edges.remove(key);//remove edges with src key.
		Map<Integer,ArrayList<edge_data>> gfg =  this.edges; 
		for ( Map.Entry<Integer,ArrayList<edge_data>> entry : gfg.entrySet())   {
			ArrayList<edge_data> al = entry.getValue();
			for(edge_data ed:al)//ed = edge_data.
			{
				if(ed.getDest() == key)
				{
					edgesCount--;
					al.remove(ed);
					break;
					//this.edges.remove(ed);
				}
			}if(al.isEmpty())
				this.edges.remove(entry.getKey());
		}
	 	this.nodes.remove(key);
		return n;
	}

	@Override
	public edge_data removeEdge(int src, int dest)
	{
		edgesCount--;
		ArrayList<edge_data> al =this.edges.get(src);
		for(edge_data ed:al)//ed = edge_data.
		{
			if(ed.getDest() == dest)
			{
				al.remove(ed);
				
			}if(al.isEmpty())
				this.edges.remove(src);
			return ed;
				//this.edges.remove(ed);
		}
		
		return null;
	}

	@Override
	public int nodeSize() {
	
		return  this.nodes.size();
	}

	@Override
	public int edgeSize() {
//		int sum=0;
//	
//		Map<Integer,ArrayList<edge_data>> gfg =  this.edges; 
//		for ( Map.Entry<Integer,ArrayList<edge_data>> entry : gfg.entrySet())   {
//
//			ArrayList<edge_data> al = entry.getValue();
//			sum+=al.size();
		return edgesCount;
		}
		



	@Override
	public int getMC() {
		
		return 	modeCount;
	}

}
