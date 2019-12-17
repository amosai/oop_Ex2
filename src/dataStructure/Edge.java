package dataStructure;

public class Edge implements edge_data {
	
	private int src;
	private int dest;
	private int weight;
	

	public Edge(int src, int dest, int weight) {
		
		this.src = src;
		this.dest = dest;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Edge [src=" + src + ", dest=" + dest + ", weight=" + weight + "]";
	}

	@Override
	public int getSrc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDest() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
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
