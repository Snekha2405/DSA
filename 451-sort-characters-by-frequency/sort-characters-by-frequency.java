class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        char ch[]=s.toCharArray();
        for(char c:ch)
            map.put(c,map.getOrDefault(c,0)+1);
        PriorityQueue<Character> heap=new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));
        for(char c:map.keySet())
            heap.offer(c);
        StringBuilder sb=new StringBuilder();

        while(!heap.isEmpty()){
           char c = heap.poll();
            sb.append(String.valueOf(c).repeat(map.get(c)));

        }
        
        return new String(sb);


        
    }
}