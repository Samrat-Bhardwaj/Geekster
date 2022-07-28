class Stack { // using array 
    private int[] data;
    private int tos;

    public Stack(){
        this.data=new int[4];
        this.tos=-1;
    }

    private void doubleSize(){
        int[] newData = new int[2*data.length];

        for(int i=0; i<data.length; i++){
            newData[i]=data[i];
        }

        this.data=newData;
    }

    public void push(int val){
        if(tos + 1 ==data.length){
            doubleSize();
        }

        this.tos++;
        this.data[tos]=val;
    }

    public int pop(){
        if(tos==-1){
            System.out.println("Runtime Error!!, Stack is empty");
            return -1;
        }

        int ele=data[tos];
        tos--;

        return ele;
    }

    public int peek(){
        if(tos==-1){
            System.out.println("Runtime Error!!, Stack is empty");
            return -1;
        }

        int ele=data[tos];

        return ele;
    }

    public int size(){
        return tos+1;
    }
}

public class Implementation {
    public static void main(String[] args) {
        Stack st=new Stack();

        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st.peek());

        int popped_ele=st.pop();
        System.out.println(popped_ele);

        st.push(75);
        st.push(95);
        st.push(105);

        System.out.println(st.size());
    }
}
