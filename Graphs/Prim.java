import java.util.*;
public class prim {
	static Vertex[] Graph;
	static ArrayList<Edge> Result;
	prim(int size){
		Graph=new Vertex[size];
		Result=new ArrayList();
		initialize();
	}
	public static void initialize() {
		for(int i=0;i<Graph.length;i++) {
			Graph[i]=new Vertex();
		}
	}
	static class Edge implements Comparable<Edge>{
		int start;
		int end;
		int wt;
		public int compareTo(Edge E) {
			return this.wt-E.wt;
		}
		Edge(){
			
		}
		public Edge(int start, int end, int wt) {
			super();
			this.start = start;
			this.end = end;
			this.wt = wt;
		}
	}
	static class Vertex{
		ArrayList<Edge> neighbours;
		Vertex(){
			neighbours=new ArrayList();	
		}
	}
	public static void PrimsAlgo(int src) {
		Boolean [] Visited=new Boolean[Graph.length];
		for(int i=0;i<Visited.length;i++) {
			Visited[i]=false;
		}
		Visited[src]=true;		
		PriorityQueue<Edge> Best=new PriorityQueue();
		for(Edge E:Graph[src].neighbours) {
			Best.add(E);
		}
		while(!Best.isEmpty()) {
			Edge E=Best.remove();
			if(!Visited[E.end]) {
				Result.add(E);
				Visited[E.end]=true;
				for(Edge neigbour:Graph[E.end].neighbours) {
					if(!Visited[neigbour.end]) {
						Best.add(neigbour);
					}
				}
			}
		}
		int TreeCost=0;
		for(Edge r:Result) {
			System.out.println(r.start+" --> "+r.end+" "+r.wt);
			TreeCost+=r.wt;
		}
		System.out.println("Tree Cost :"+TreeCost);		
	}
	public static void fillValues() {
		Graph[0].neighbours.add(new Edge(0,1,4));
		Graph[1].neighbours.add(new Edge(1,0,4));
		Graph[0].neighbours.add(new Edge(0,7,8));
		Graph[7].neighbours.add(new Edge(7,0,8));
		Graph[7].neighbours.add(new Edge(7,1,11));
		Graph[1].neighbours.add(new Edge(1,7,11));
		Graph[7].neighbours.add(new Edge(7,6,1));
		Graph[6].neighbours.add(new Edge(6,7,1));
		Graph[1].neighbours.add(new Edge(1,2,8));
		Graph[2].neighbours.add(new Edge(2,1,8));
		Graph[7].neighbours.add(new Edge(7,8,7));
		Graph[8].neighbours.add(new Edge(8,7,7));
		Graph[2].neighbours.add(new Edge(2,8,2));
		Graph[8].neighbours.add(new Edge(8,2,2));
		Graph[8].neighbours.add(new Edge(8,6,6));
		Graph[6].neighbours.add(new Edge(6,8,6));
		Graph[2].neighbours.add(new Edge(2,3,7));
		Graph[3].neighbours.add(new Edge(3,2,7));
		Graph[6].neighbours.add(new Edge(6,5,2));
		Graph[5].neighbours.add(new Edge(5,6,2));
		Graph[2].neighbours.add(new Edge(2,5,4));
		Graph[5].neighbours.add(new Edge(5,2,4));
		Graph[3].neighbours.add(new Edge(3,5,14));
		Graph[5].neighbours.add(new Edge(5,3,14));
		Graph[3].neighbours.add(new Edge(3,4,9));
		Graph[4].neighbours.add(new Edge(4,3,9));
		Graph[5].neighbours.add(new Edge(5,4,10));
		Graph[4].neighbours.add(new Edge(4,5,10));		
	}
	public static void main(String[] args) {
		prim root=new prim(9);
		fillValues();
		PrimsAlgo(8);
	}
}

