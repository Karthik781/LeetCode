class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] nodes = preorder.split(",");
        Deque<String> dq = new LinkedList<>();
        for(String s : nodes){
            while(s.equals("#") && !dq.isEmpty() && dq.peek().equals("#")){
                dq.pop();
                if(dq.isEmpty()){
                    return false;
                }
                dq.pop();
            }
            dq.push(s);
        }
        return dq.size() == 1 && dq.peek().equals("#");
    }
}