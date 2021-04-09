import java.util.*;
public class MinRooms_For_Lectures {
	public static void main(String[] args) {
		int intervals[][]= {{1, 18},{18, 23},{15, 29},{4, 15},{2, 11},{5, 13}};
		Arrays.parallelSort(intervals,Comparator.comparing((int[] intv)->intv[0]));//Sorting According to Start Time of the Lectures.
		PriorityQueue<Integer> P=new PriorityQueue<Integer>();//Storing Ending Time of lectures in min Heap , which will return the earliest finishing lecture; 
		int minRooms=0;
		for(int[] intv: intervals) {
			if(P.isEmpty()) {
				minRooms++;
			}else {
				if(intv[0]>=P.peek()) {//Greedy Approach.
					P.poll();
				}else {
					minRooms++;
				}
			}
			P.offer(intv[1]);
		}
		System.out.println(minRooms);
	}
}
