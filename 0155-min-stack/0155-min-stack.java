class MinStack {
    List<Integer> stack, list;
    int top = -1;
    public MinStack() {
        stack = new ArrayList<>();
        list = new ArrayList<>();
    }
    
    public void push(int val) {
        if(top == -1){
            stack.add(val);
            top++;
            list.add(top, val);
        }else{
            stack.add(val);
            if(list.get(top) < val){
                list.add(top+1, list.get(top));
                top++;
            }else{
                list.add(top+1, val);
                top++;
            }
        }
    }
    
    public void pop() {
        stack.remove(top);
        list.remove(top);
        top--;
    }
    
    public int top() {
        return stack.get(top);
    }
    
    public int getMin() {
        return list.get(top);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */