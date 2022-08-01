import java.util.Collections;
import java.util.PriorityQueue;

public class Example {
    // leet 215 ======================================================
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        // nlogn
        for(int i=0; i<n; i++){
            pq.add(nums[i]); //logn
        }
        
        int ans=-1;
        
        // klogn
        while(k>0){
            ans=pq.remove(); // logn
            k--;
        }
        
        return ans;
    }

    // nlogk
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        for(int i=0; i<n; i++){
            pq.add(nums[i]);
            
            if(pq.size()>k){
                pq.remove();
            }
        }
        
        return pq.remove();
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(14);
        pq.add(11);
        pq.add(2);
        pq.add(13);
        
        
        System.out.println(pq.peek());

        int a=pq.remove();
        System.out.println(a);

        System.out.println(pq.peek());
    }

}
