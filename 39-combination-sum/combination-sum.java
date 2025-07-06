class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
       List<List<Integer>> ans = new ArrayList<>();
       List<Integer> curr = new ArrayList<>();
       func(candidates,target,curr,ans,0);

       return ans;
    }

    public void func(int[] candidates,int target,List<Integer> curr,List<List<Integer>> ans,int i)
    {
        if(target == 0)
        {
            List<Integer> temp = new ArrayList<>(curr);
            ans.add(temp);
            return ;
        }

        if(target  > 0 && i < candidates.length)
        {
            curr.add(candidates[i]);
            func(candidates,target-candidates[i],curr,ans,i);
            curr.remove(curr.size()-1);
        

            
            func(candidates,target,curr,ans,i+1);
        }
        else
        {
            return;
        }


        
    }
}