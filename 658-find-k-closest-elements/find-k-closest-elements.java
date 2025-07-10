class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < k; i++) {
            list.add(arr[i]);
        }

        for (int r = k; r < arr.length; r++) {
            int first = list.get(0);
            int current = arr[r];
           if(first!=current){
            if (Math.abs(current - x) < Math.abs(first - x) ||
                (Math.abs(current - x) == Math.abs(first - x) && current < first)) {
                list.remove(0);
                list.add(current);
            } else {
                break; 
            }
           }
        }

        // Collections.sort(list); 
        return list;
    }
}
