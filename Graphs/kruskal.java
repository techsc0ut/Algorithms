import java.util.*;
public class kruskal {
	static class subset{
		int rank;
		int parent;
		protected int getRank() {
			return rank;
		}
		protected void setRank(int rank) {
			this.rank = rank;
		}
		protected int getParent() {
			return parent;
		}
		protected void setParent(int parent) {
			this.parent = parent;
		}
	}
	static class Edge implements Comparable<Edge>{
		int start;
		int end;
		int wt;
		protected int getStart() {
			return start;
		}
		protected void setStart(int start) {
			this.start = start;
		}
		protected int getEnd() {
			return end;
		}
		protected void setEnd(int end) {
			this.end = end;
		}
		protected int getWt() {
			return wt;
		}
		protected void setWt(int wt) {
			this.wt = wt;
		}
		public int compareTo(Edge E) {
			return this.getWt()-E.getWt();
		}
	}
	public static int find(int a,subset All[]) {
		if(All[a].parent==a) {
			return a;
		}
		return All[a].parent=find(All[a].parent,All);
	}
	public static void Union(int a , int b,subset All[]) {
		int x=find(a,All);
		int y=find(b,All);
		if(All[x].rank>All[y].rank) {
			All[y].parent=x;
		}else if(All[x].rank<All[y].rank) {
			All[x].parent=y;
		}else {
			All[y].parent=x;
			All[x].rank+=1;
		}
	}
	public static void Min_Span(subset All[],Edge Edges[]) {
		Arrays.parallelSort(Edges);
//		System.out.println("Starts here");
//		for(int i=0;i<Edges.length;i++) {
//			System.out.println(Edges[i].start+" --> "+Edges[i].end+" "+Edges[i].wt);
//		}
//		System.out.println("Ends here");
		int index=0;
		Edge Result[]=new Edge[Edges.length];
		for(int i=0;i<Edges.length;i++) {
			Edge E=Edges[i];
			int src=E.start;
			int dest=E.end;
			int p1=find(src,All);
			int p2=find(dest,All);
			if(p1!=p2) {
				Result[index++]=E;
				Union(p1,p2,All);
			}
		}
		int TreeCost=0;
		for(int i=0;i<index;i++) {
			System.out.println(Result[i].start+" --> "+Result[i].end+" "+Result[i].wt);
			TreeCost+=Result[i].wt;
		}
		System.out.println("Tree Cost :"+TreeCost);
	}
	public static void Initialize(Edge[] Edges,subset[] All) {
		for(int i=0;i<Edges.length;i++) {
			Edges[i]=new Edge();
		}
		for(int k=0;k<All.length;k++) {
			All[k]=new subset();
		}
		for(int j=0;j<All.length;j++) {
			All[j].parent=j;
			All[j].rank=0;
		}
	}
	public static void FillValues(Edge[] Edges) {
		Edges[0].start = 1;
        Edges[0].end = 0;
        Edges[0].wt = 4;
        
        Edges[1].start = 7;
        Edges[1].end = 0;
        Edges[1].wt = 8;
        
        Edges[2].start = 1;
        Edges[2].end = 7;
        Edges[2].wt = 11;
        
        Edges[3].start = 1;
        Edges[3].end = 2;
        Edges[3].wt = 8;
        
        Edges[4].start = 7;
        Edges[4].end = 6;
        Edges[4].wt = 1;
        
        Edges[5].start = 7;
        Edges[5].end = 8;
        Edges[5].wt = 7;
        
        Edges[6].start = 2;
        Edges[6].end = 8;
        Edges[6].wt = 2;
        
        Edges[7].start = 8;
        Edges[7].end = 6;
        Edges[7].wt = 6;
        
        Edges[8].start = 2;
        Edges[8].end = 5;
        Edges[8].wt = 4;
        
        Edges[9].start = 2;
        Edges[9].end = 3;
        Edges[9].wt = 7;
        
        Edges[10].start = 6;
        Edges[10].end = 5;
        Edges[10].wt = 2;
        
        Edges[11].start = 3;
        Edges[11].end = 5;
        Edges[11].wt = 14;
        
        Edges[12].start = 3;
        Edges[12].end = 4;
        Edges[12].wt = 9;
        
        Edges[13].start = 4;
        Edges[13].end = 5;
        Edges[13].wt = 10;
        
	}
	public static void main(String[] args) {
		Edge[] Edges=new Edge[14];
		subset All[]=new subset[9];
		Initialize(Edges,All);
		FillValues(Edges);
		Min_Span(All,Edges);
	}
}

