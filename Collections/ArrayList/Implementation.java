import java.util.Arrays;

class ArrayList {
    private int[] data;
    private int capacity=4;
    private int size;

    public ArrayList(){
        data=new int[capacity];
        size=0;
    }

    private void doubleTheSpace(){
        int[] newData=new int[2*data.length];

        for(int i=0; i<data.length; i++){
            newData[i]=data[i];
        }

        this.data=newData;
    }

    public void add(int val){
        if(size==data.length){
            this.doubleTheSpace();
        }

        data[size]=val;
        size++;
    }

    public int get(int idx)  {
        if(idx<0 || idx>=size){
            System.out.println("Array index out of bound");
            return -1;
        }

        return data[idx];
    }

    public void set(int idx, int val){
        if(idx<0 || idx>=size){
            System.out.println("Array index out of bound");
            return;
        }

        data[idx]=val;
    }

    public int size(){
        return this.size;
    }

    public void remove(int idx){
        if(idx<0 || idx>=size){
            System.out.println("Array index out of bound");
            return;
        }

        for(int i=idx; i<size; i++){
            data[i]=data[i+1];
        }

        size--;
    }
}

public class Implementation {
    public static void main (String[] args) {
        ArrayList al=new ArrayList();

        for(int val=2; val<=10; val=val+2){
            al.add(val);
        }

        for(int i=0; i<al.size(); i++){
            int val=al.get(i);
            System.out.println(val);
        }

        al.set(14,45);

        // System.out.println(al.get(3));
        al.remove(1);

        for(int i=0; i<al.size(); i++){
            int val=al.get(i);
            System.out.println(val);
        }
    }
}
