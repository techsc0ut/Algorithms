class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(c1,c2)->(Integer.compare(c1[1],c2[1])));
        PriorityQueue<Integer> PQ=new PriorityQueue<>(Collections.reverseOrder());
        int time=0;
        for(int i=0;i<courses.length;i++){
            if(courses[i][0]<=courses[i][1]){
                if(PQ.isEmpty()){
                    time+=courses[i][0];
                    PQ.add(courses[i][0]);
                }else{
                    if(time+courses[i][0]<=courses[i][1]){
                        time+=courses[i][0];
                        PQ.offer(courses[i][0]);
                    }else{
                        if(PQ.peek()>courses[i][0]){
                            time-=PQ.poll();
                            time+=courses[i][0];
                            PQ.offer(courses[i][0]);
                        }
                    }
                }    
            }
        }return PQ.size();
    }
}
