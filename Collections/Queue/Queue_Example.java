import java.util.*;

public class Queue_Example {
    // leet 2073 ================================================ 
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> que=new ArrayDeque<>();
        
        int n=tickets.length;
        
        for(int i=0; i<n; i++){
            if(i==k){
                que.add(-1 * tickets[i]);
            } else {
                que.add(tickets[i]);
            }
        }
        
        int time=0;
        while(que.size()>0){
            int front_ele=que.remove();
            
            if(front_ele==-1) return time+1;
            
            if(front_ele<0){
                front_ele++;
            } else {
                front_ele--;
            }
            
            if(front_ele!=0){
                que.add(front_ele);
            }
            
            time++;
        }
        return time;
    }

    // leet 1700 ======================================= 
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st=new Stack<>();
        
        int n=students.length;
        
        for(int i=n-1; i>=0; i--){
            st.push(sandwiches[i]);
        }
        
        Queue<Integer> que=new ArrayDeque<>();
        
        for(int i=0; i<n; i++){
            que.add(students[i]);
        }
        
        while(st.size()>0){
            int curr_students = que.size();
            
            while(curr_students>0 && que.peek()!=st.peek()){
                int front_ele=que.remove();
                que.add(front_ele);
                
                curr_students--;
            }
            
            if(curr_students==0) return que.size();
            
            st.pop();
            que.remove();
        }
        
        return 0;
    }
    public static void main(String[] args) {
        Queue<Integer> que=new ArrayDeque<>();

        que.add(1);
        que.add(2);
        que.add(3);

        // {1,2,3}

        int a=que.remove();

        System.out.println(a);
        // {2,3}

        que.add(4);

        while(que.size()>0){
            a=que.remove();
            System.out.println(a);
        }        
    }
}
