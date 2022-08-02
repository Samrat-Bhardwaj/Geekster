import java.util.*;
public class Questions {
    // leet 451 ==========================================
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            
            if(map.containsKey(ch)==true){
                int fre=map.get(ch);
                
                map.put(ch,fre+1);
            } else {
                map.put(ch,1);
            }
        }
        
        ArrayList<Character> keys=new ArrayList<>(map.keySet());
        
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->{
            return map.get(b) - map.get(a);
        });
        
        
        for(int i=0; i<keys.size(); i++){
            pq.add(keys.get(i));
        }
        
        StringBuilder sb=new StringBuilder();
        while(pq.size()>0){
            char c=pq.remove();
            
            int fre=map.get(c);
            
            while(fre>0){
                sb.append(c);
                fre--;
            }
        }
        
        return sb.toString();
    }

    // leet 692 (Wrong code)================================================ 

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0; i<words.length; i++){
           String s=words[i];
            
            if(map.containsKey(s)==true){
                int fre=map.get(s);
                
                map.put(s,fre+1);
            } else {
                map.put(s,1);
            }
        }

        ArrayList<String> keys=new ArrayList<>(map.keySet());
        
        PriorityQueue<String> pq=new PriorityQueue<>((a,b)->{
            if(map.get(a)==map.get(b)){
                return a.compareTo(b); // will compare two strings
            } else {
                return map.get(a) - map.get(b);
            }
        });

        for(int i=0; i<keys.size(); i++){
            pq.add(keys.get(i));

            if(pq.size()>k){
                pq.remove();
            }
        }
        
        List<String> ans=new ArrayList<>();

        while(pq.size()>0){
            String s=pq.remove();
            ans.add(s);
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}
