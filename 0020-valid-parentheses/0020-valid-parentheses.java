class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); 
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch =='(' || ch =='['){
                stack.push(ch);
            }
            else if(ch == '}'){
                if(stack.size()> 0 && stack.peek() == '{') stack.pop();
                else stack.push(ch);
            }
            else if(ch == ')'){
                if(stack.size()> 0 && stack.peek() == '(') stack.pop();
                else stack.push(ch);
            }
            else if(ch == ']'){
                if(stack.size()> 0 && stack.peek() == '[') stack.pop();
                else stack.push(ch);
            }
        }

        if(stack.size() == 0) return true;

        return false;
    }
}