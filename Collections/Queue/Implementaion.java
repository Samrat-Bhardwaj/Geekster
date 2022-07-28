class Queue {
    private int[] data;
    private int front;
    private int size;

    public Queue(){
        this.data=new int[4];
        this.front=0;
        this.size=0;
    }

    private void doubleSize(){
        int[] newData=new int[2*data.length];

        for(int i=0; i<size; i++){
            int idx=(front+i)%data.length;

            newData[i] = data[idx];
        }

        front=0;
        data=newData;
    }

    public void add(int ele){
        if(size==data.length){
            doubleSize();
        }

        int idx = (front + size) % data.length;
        data[idx]=ele;

        size++;
    }

    public int remove(){
        if(size==0){
            System.out.println("Runtime error!!, Queue is empty");
            return -1;
        }

        int ele=data[front];

        front=(front+1) % data.length;

        // if(front==data.length) {
        //     front=0;
        // }

        size--;

        return ele;
    }

    public int peek(){
        if(size==0){
            System.out.println("Runtime error!!, Queue is empty");
            return -1;
        }

        int ele=data[front];
        
        return ele;
    }

    public int size(){
        return this.size;
    }
}

public class Implementaion {
    
}
