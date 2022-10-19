class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> dq = new ArrayDeque<>();
        int len = temperatures.length;
        int[] res = new int[len];
        dq.add(0);
        for(int i = 1; i < len; i++){
            while(dq.size() > 0 && temperatures[i] > temperatures[dq.getLast()]){
                res[dq.getLast()] = i - dq.getLast();
                dq.pollLast();
            }
            dq.add(i);
        }
        while(dq.size() > 0){
             res[dq.getLast()] = 0;
                dq.pollLast();
        }
        return res;
    }
}