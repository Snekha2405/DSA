class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        int ans[]=new int[numCourses];
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
        int j=0;
        while(!queue.isEmpty()){
            int curr=queue.poll();
            ans[j++]=curr;
            for(int neighbour:adj.get(curr)){
                inDegree[neighbour]--;
                if(inDegree[neighbour]==0)
                    queue.offer(neighbour);
            }


        }
        if(j == numCourses) return ans;
        else return new int[0]; // cycle present
        
    }
}