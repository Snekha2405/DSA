class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
        int j=0;
        for(int i=-n+1;i<n;i+=2){
            arr[j++]=i;
            System.out.println(i);

        }
        return arr;
        
    }
}