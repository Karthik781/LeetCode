class Solution {
    String str = "";
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(0, 0, n);
        return list;
    }
    private void backtrack(int open, int close, int n){
        if(open == close && close == n){            
            list.add(str);
        }
        if(open < n){
            str += '(';
            backtrack(open + 1, close, n);
            str = str.substring(0, str.length() - 1);
        }
        if(close < open){
            str += ')';
            backtrack(open, close + 1, n);
            str = str.substring(0, str.length() - 1);
        }
    }
}