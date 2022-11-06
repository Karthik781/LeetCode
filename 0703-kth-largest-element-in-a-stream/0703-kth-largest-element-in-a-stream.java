class KthLargest {
    PriorityQueue<Integer> pq = null;
    int k = 0;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();
        for(int n : nums)
            pq.add(n);
    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size() > k){
            pq.poll();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */