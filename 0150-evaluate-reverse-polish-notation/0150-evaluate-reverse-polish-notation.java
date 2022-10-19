class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < tokens.length; i++){
            String s = tokens[i];
            
            if(s.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(s.equals("-")){
                int a = stack.pop();
                int b = stack.pop();
                 stack.push(b - a);
            }else if(s.equals("*")){
                 int a = stack.pop();
                int b = stack.pop();
                 stack.push(a * b);
            }else if(s.equals("/")){
                 int a = stack.pop();
                int b = stack.pop();
                 stack.push(b / a);
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.peek();
    }
}