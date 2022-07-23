import java.util.Stack;

public class Example {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            } else if(ch==')'){
                if(st.size()==0 || st.peek()!='(') return false;

                st.pop();
            } else if(ch=='}'){
                if(st.size()==0 || st.peek()!='{') return false;

                st.pop();
            } else if(ch==']'){
                if(st.size()==0 || st.peek()!='[') return false;

                st.pop();
            }
        }

        if(st.size()==0) return true;

        
        return false;
    }

    // is balanced bracket using integer

    public boolean isBalanced(String s){
        int a=0;

        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);

            if(ch=='('){
                a++;
            } else {
                a--;
            }

            if(a<0){ // more closing brackets than opening
                return false;
            }
        }

        if(a==0){
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        System.out.println(st.peek());

        st.push(4);
        st.push(5);

        while(st.size()>0){
            int a=st.pop();
            System.out.println(a);
        }
    }
}
