// leet 155 ============================================ 
class MinStack {
    Stack<Integer> st;
    int min;
    
    public MinStack() {
        st=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(st.size()==0){
            min=x;
            st.push(x);
            return;
        }    
        
        if(x<min){
            int new_min=x;
            int to_push=(x-min)+x; 
            
            st.push(to_push);
            min=new_min;
        } else {
            st.push(x);
        }
        
        
    }
    
    public void pop() {
        if(st.peek()<min){ // we are popping encrypted value
            int tp=st.pop();
            
            int x=min;
            int old_min=2*x-tp;
            
            min=old_min;
        } else {
            st.pop();
        }
    }
    
    public int top() {
         int tr;
        if(st.peek()<min){ 
            tr=min;
        } else {
            tr=st.peek();
        }
        
        return tr;
    }
    
    public int getMin() {
        return min;
    }
}

// long to make it pass the testcases =========================== 

class MinStack {
    Stack<Long> st;
    long min;
    
    public MinStack() {
        st=new Stack<>();
        min=Long.MAX_VALUE;
    }
    
    public void push(int x) {
        if(st.size()==0){
            min=(long)x;
            st.push((long)x);
            return;
        }    
        
        if(x<min){
            long to_push=((long)(x)-min)+(long)(x); 
            
            st.push(to_push);
            min=((long)(x));
        } else {
            st.push((long)(x));
        }
    }
    
    public void pop() {
        if(st.peek()<min){ // we are popping encrypted value
            long tp=st.pop();
            
            long x=min;
            long old_min=2*x-tp;
            
            min=old_min;
        } else {
            st.pop();
        }
    }
    
    public int top() {
         long tr;
        if(st.peek()<min){ 
            tr=min;
        } else {
            tr=st.peek();
        }
        
        return (int)tr;
    }
    
    public int getMin() {
        return (int)min;
    }
}

public class minStack {
    
}
