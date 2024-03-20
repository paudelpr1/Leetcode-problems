class MinStack {
    public Stack<Integer> minstack; 
    public Stack<Integer> temp;

    public MinStack() {
        minstack = new Stack<>();
        temp = new Stack<>();
        
    }
    
    public void push(int val) {
        minstack.push(val);
        if(temp.isEmpty()){
            temp.push(val);
        }
        else{
            temp.push(Math.min(val, temp.peek()));
        }
        
    }
    
    public void pop() {
        minstack.pop();
        temp.pop();      
    }
    
    public int top() {
        return minstack.peek();
    
    }
    
    public int getMin() {
        return temp.peek();
        
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