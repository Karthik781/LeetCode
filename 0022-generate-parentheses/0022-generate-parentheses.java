class Solution {
    Stack<Character> stack = new Stack<>();
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(0, 0, n);
        return list;
    }
    private void backtrack(int open, int close, int n){
        if(open == close && close == n){
            String res = "";
            Iterator itr = stack.iterator();
            while(itr.hasNext()){
                res += itr.next();
            }
            list.add(res);
        }
        
        if(open < n){
            stack.push('(');
            backtrack(open + 1, close, n);
            stack.pop();
        }
        if(close < open){
            stack.push(')');
            backtrack(open, close + 1, n);
            stack.pop();
        }
    }
}