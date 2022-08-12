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
    public static void main(String[] args) {
        
    }
}
