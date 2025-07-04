class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        int n=arr.length;
        int i=0,j=n-1;
        while(i+1<n&&arr[i]<arr[i+1])
            i++;
        while(j>0&&arr[j-1]>arr[j])
            --j;
        return i==j&&i>0&&j<n-1;
        
        
    }
}