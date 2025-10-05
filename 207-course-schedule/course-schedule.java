class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++) adj.add(new ArrayList<>());
        int[] inDegree=new int[numCourses];
        for(int[] pre:prerequisites){
            int course=pre[0];
            int prereq=pre[1];
            adj.get(prereq).add(course);
            inDegree[course]++;

        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inDegree[i]==0) queue.offer(i);

        }
        int count=0;
        while(!queue.isEmpty()){
            int curr=queue.poll();
            count++;
            for(int neighbour:adj.get(curr)){
                inDegree[neighbour]--;
                if(inDegree[neighbour]==0)
                    queue.offer(neighbour);
            }


        }
        return count==numCourses;

        
    }
}