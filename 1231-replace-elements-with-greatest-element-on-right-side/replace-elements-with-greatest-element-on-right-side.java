class Solution {
    public int[] replaceElements(int[] arr) {
        int a[]=new int[arr.length];
        int max=arr[arr.length-1];
        a[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;--i){
            a[i]=max;
            if(arr[i]>max){
                max=arr[i];
            }
            
            
        }
        return a;
        
    }
}