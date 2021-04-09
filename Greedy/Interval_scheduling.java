import java.util.*;
public class Interval_scheduling {
	public static void main(String[] args) {
		int intervals[][]= {{1, 18},{18, 23},{15, 29},{4, 15},{2, 11},{5, 13}};
		Arrays.parallelSort(intervals, Comparator.comparing((int[] intv )->intv[1]));// Sorting based on Finish Time .
		PriorityQueue<Integer> P=new PriorityQueue();
		int Max_Non_Overlapping_intervals=0;
		for(int[] intv:intervals) {
			if(P.isEmpty()) {
				Max_Non_Overlapping_intervals+=1;
				P.offer(intv[1]);
			}else if(intv[0]>=P.peek()) {
				Max_Non_Overlapping_intervals+=1;
				P.poll();
				P.offer(intv[1]);
			}
		}
		System.out.println("Maximum Number of Non-Overlapping Intervals are : "+Max_Non_Overlapping_intervals);
	}
}
