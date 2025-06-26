class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        int arr[]=new int[temperatures.length];
        for(int i=1;i<temperatures.length;i++){
            while(!st.isEmpty()&&temperatures[st.peek()]<temperatures[i]){
                int index=st.pop();
                arr[index]=i-index;


            }
            st.push(i);
        }
        return arr;
    }
}