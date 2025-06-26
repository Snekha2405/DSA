class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int arr[]=new int[nums.length];
        for(int i=nums.length-1;i>=0;--i){
            while(!st.isEmpty()&&st.peek()<nums[i]){
                st.pop();
            }
            if(st.isEmpty())
                arr[i]=-1;
            else 
                arr[i]=st.peek();
            st.push(nums[i]);
    }
    for(int i=nums.length-1;i>=0;--i){
            while(!st.isEmpty()&&st.peek()<=nums[i]){
                st.pop();
            }
            if(st.isEmpty())
                arr[i]=-1;
            else 
                arr[i]=st.peek();
            st.push(nums[i]);
    }
        return arr;
        
    }
}