package dataStructure;

import utils.Point3D;

public class Node implements node_data {
	private int key;
	private Point3D location;
	private double Weight;///maybe i need change to public or something
	private String info;
	private int tag;
	//add all the object you need : weghit etc.
	
	public Node(int key) {
		
		this.key = key;
	}
	@Override
	public String toString() {
		return "Node [key=" + key + ", location=" + location + "]";
	}
	@Override
	public int getKey() {
		
		return this.key;
	}

	

	@Override
	public Point3D getLocation() {
		
		return this.location;
	}

	@Override
	public void setLocation(Point3D p) {
		
		this.location=p;
	}

	@Override
	public double getWeight() {
		
		//i need think i to do that and when because its not 
		// const value it change with change of src or with the pathe's i have to choose between 
		return this.Weight;
	}

	@Override
	public void setWeight(double w) {
		//i need think i to do that and when because its not 
				// const value it change with change of src or with the pathe's i have to choose between 
		this.Weight=w;
	}

	@Override
	public String getInfo() {
		
		return this.info;
	}

	@Override
	public void setInfo(String s) {
		this.info=s;

	}

	@Override
	public int getTag() {//0 its not visit for dfs/bfs
		                     //1 its not visit for dfs/bfs
		return this.tag;
	}

	@Override
	public void setTag(int t) {//0 its not visit for dfs/bfs
                                //1 its not visit for dfs/bfs
		this.tag=t;
	}

}
