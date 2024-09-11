class MyStack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(!q1.isEmpty()){
            q1.add(x);
        }else{
            q2.add(x);
        }
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        int top = -1;
        if(!q1.isEmpty()){
            while(q1.size() > 1){
                q2.add(q1.remove());
            }
            top = q1.remove();
        }else{
            while(q2.size() > 1){
                q1.add(q2.remove());
            }
            top = q2.remove();
        }
        return top;
    }
    
    public int top() {
        if(empty()){
            return -1;
        }
        int top = -1;
        if(!q1.isEmpty()){
             while(q1.size() > 1){
                q2.add(q1.remove());
            }
            top = q1.peek(); 
            q2.add(q1.remove());
        }else{
             while(q2.size() > 1){
                q1.add(q2.remove());
            }
            top = q2.peek();
            q1.add(q2.remove());
        }
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */