package dataStructure;

import utils.Point3D;

public class Node implements node_data {
	private int key;
	private Point3D location;
	//add all the object you need : weghit etz.
	
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
		// TODO Auto-generated method stub

	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setWeight(double w) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInfo(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getTag() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTag(int t) {
		// TODO Auto-generated method stub

	}

}
