import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> {
            //return a-b; // minimum element should be out first
            return b-a; // maximum element should be out first
        });


        // this - other

        // if a-b is negative => a is smaller than b, a will be removed from the pq first

        // if a-b is positive => a is greater than b, b will be removed from the pq first

        // if a-b is zero => a is equal to b, any of them will be removed from pq first

        pq.add(1);
        pq.add(4);
        pq.add(2);
        pq.add(3);

        while(pq.size()>0){
            int a=pq.poll();

            System.out.println(a);
        }
        
        PriorityQueue<int[]> pq1=new PriorityQueue<>((a,b)->{
            if(a[0]==b[0]){
                return b[1] - a[1]; // 
            } else {
                return a[0] - b[0];
            }
        });

        // question -> print these arrays in this order (if 0th index is smaller, print that, if 0th index is equal, print array with bigger first index)
        int[] a1={1,5,3};
        int[] a2={2,4,5,6};
        int[] a3={1,2,7,9};

        // ans=> a1,a3,a2

        pq1.add(a1);
        pq1.add(a2);
        pq1.add(a3);

        while(pq1.size()>0){
            int[] arr=pq1.poll();

            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }

            System.out.println();
        }
    }
}
