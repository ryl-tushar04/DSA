class MyQueue {
Stack<Integer> first;
Stack<Integer> Second;
    public MyQueue() {
        first=new Stack<>();
        Second=new Stack<>();
    }
    
    public void  push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!first.isEmpty()){
            Second.push(first.pop());
        }
        int remove=Second.pop();
        while(!Second.isEmpty()){
            first.push(Second.pop());
        }
        return remove;
    }
    
    public int peek() {
        while(!first.isEmpty()){
            Second.push(first.pop());
        }
        int look=Second.peek();
        while(!Second.isEmpty()){
            first.push(Second.pop());
        }
        return look;
    }
    
    public boolean empty() {
        return first.isEmpty();        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */