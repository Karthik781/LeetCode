class Solution {
    String str = "";
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(0, 0, n, new StringBuilder());
        return list;
    }
    private void backtrack(int open, int close, int n, StringBuilder sb){
        if(open == close && close == n){            
            list.add(sb.toString());
        }
        if(open < n){
            sb.append('(');
            backtrack(open + 1, close, n, sb);
            sb.setLength(sb.length() - 1);
        }
        if(close < open){
            sb.append(')');
            backtrack(open, close + 1, n, sb);
            sb.setLength(sb.length() - 1);
        }
    }
}