class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        while(i<nums1.length&&j<nums2.length){
            if(nums1[i]<=nums2[j]){
                list.add(nums1[i]);
                i++;

            }
            else{
                list.add(nums2[j]);
                j++;
            }
        }
        while(i<nums1.length){
            list.add(nums1[i]);
            i++;
        }
        while(j<nums2.length){
            list.add(nums2[j]);
            j++;
        }
        if(list.size()%2==1){
            return (double)list.get(list.size()/2);
        }
        int n=list.size();
        // System.out.println(list.get(n/2));
        // System.out.println(list.get((n/2)-1));
        double res=(double)(list.get(n/2)+list.get((n/2)-1))/2;
        return res;


        
    }
}