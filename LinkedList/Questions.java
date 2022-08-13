public class Questions {

    class ListNode {
            int val;
            ListNode next;

            ListNode() {

            }

            ListNode(int val) { 
                this.val = val; 
            }

            ListNode(int val, ListNode next) { 
                this.val = val; this.next = next; 
            }
    }

    // merge 2 sorted linked list on leetcode ============================================================ 
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode i=head1;
        ListNode j=head2;
        
        ListNode head=new ListNode(-1);
        ListNode k=head;
        
        while(i!=null && j!=null){
            ListNode ikaNext=i.next;
            ListNode jkaNext=j.next;
            
            if(i.val < j.val){
                k.next=i;
                i.next=null;
                i=ikaNext;
            } else {
                k.next=j;
                j.next=null;
                j=jkaNext;
            }
            
            k=k.next;
        }
        
        if(i!=null){
            k.next=i;
        }
        
        if(j!=null){
            k.next=j;
        }
        
        return head.next;
    }

    // reverse linked list (leet 206) =======================================
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode currKaNext=curr.next;

            curr.next=prev;

            prev=curr;
            curr=currKaNext;
        }

        return prev;
    }

    // leet 141 ==================================== 

    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }

        return false;
    }

    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){ // if linked list is of size 0 or 1 -> no cylce
            return null;
        }
        
        ListNode slow=head;
        ListNode fast=head;
        // find the convergence point
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                break;
            }
        }

        if(slow!=fast){ // no cycle
            return null;
        }
        
        // keep fast on convergence point, slow on head
        slow=head;
        
        // keep moving until we find the convergence point again -> which will be the starting point of cycle
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
    }

    // leetcode 143 =============================================================================== 

    public static ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null){
            ListNode currKaNext=curr.next;
            
            curr.next=prev;
            
            prev=curr;
            curr=currKaNext;
        }
        
        return prev;
    }
    
    public static ListNode joinLists(ListNode head1, ListNode head2){
        ListNode i=head1;
        ListNode j=head2;
        
        ListNode dummy=new ListNode(-1);
        ListNode k=dummy;
        
        int curr_step=0;
        
        while(i!=null && j!=null){
            ListNode iKaNext=i.next;
            ListNode jKaNext=j.next;
            
            if(curr_step%2==0){
                k.next=i;
                i.next=null;
                i=iKaNext;
            } else {
                k.next=j;
                j.next=null;
                j=jKaNext;
            }
            
            k=k.next;
            curr_step++;
        }

        if(i!=null){
            k.next=i;
        } 
        if(j!=null){
            k.next=j;
        }
        
        return dummy.next;
    }
    
    
    
    public void reorderList(ListNode head) {
        ListNode mid=getMid(head);
        
        // break into 2 parts
        // reverse second part
        
        // combine both parts
    }

    public static void main(String[] args) {
        
    }
}
