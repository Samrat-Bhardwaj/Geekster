import java.util.HashMap;
import java.util.HashSet;

public class Example {
    // https://leetcode.com/problems/intersection-of-two-arrays/ 

    public int[] intersection(int[] nums1, int[] nums2) {
        
    }

    // https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1

    public static int count_common_elements(int[] arr1, int n1, int[] arr2, int n2){
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0; i<n1; i++){
            set.add(arr1[i]);
        }
        
        for(int i=0; i<n2; i++){
            set.add(arr2[i]);
        }
        
        return set.size();
    }
    
    public static int doUnion(int arr1[], int n1, int arr2[], int n2) 
    {
        int common_elements=count_common_elements(arr1,n1,arr2,n2);
        int ans=common_elements;
        
        return ans;
    }

    // leet 169 ============================================
    public int majorityElement(int[] nums) {
        int n=nums.length;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0; i<n; i++){
            int ele=nums[i];

            if(map.containsKey(ele)){
                int fre=map.get(ele);

                map.put(ele,fre+1);
            } else {
                map.put(ele,1);
            }
        }

        for(int i=0; i<n; i++){
            int ele=nums[i];

            int fre=map.get(ele);
            if(fre>n/2) return ele;
        }

        return -1;
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        map.put("Rohini",12);
        map.put("Noida",17);
        map.put("Janakpuri",22);
        map.put("Dwarka",17);

        System.out.println(map);

        map.remove("Noida");

        System.out.println(map);

        // System.out.println(map.get("Janakpuri"));

        System.out.println(map.containsKey("Noida"));

        map.put("Rohini",17);

        System.out.println(map);
    }
}
