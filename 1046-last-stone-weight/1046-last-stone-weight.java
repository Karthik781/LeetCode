class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        
        for(int s : stones)
            pq.offer(s);
        
        while(pq.size() > 1){
            int y = pq.poll();
            int x = pq.poll();
            
            if(x != y) {
                int ans = y - x;
                pq.offer(ans);
            }
        }
        if(pq.peek() != null){
            return pq.peek();
        }
        return 0;
    }
}