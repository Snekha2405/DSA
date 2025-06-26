class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        st.push(nums2[0]);
        for(int i=1;i<nums2.length;i++){
            while(!st.isEmpty()&&st.peek()<nums2[i]){
                int c=st.pop();
                map.put(c,nums2[i]);
            }
            st.push(nums2[i]);
        }
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int c=nums1[i];
            arr[i]=map.getOrDefault(c,-1);
        }

        return arr;

        
    }
}