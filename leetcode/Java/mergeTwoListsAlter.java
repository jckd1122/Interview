public class Solution{
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        ListNode h1 = l1;
        ListNode h2 = l2;
        
        if(h1 == null || h2 == null)
            return (h1 == null)? h2:h1;
        
        
        if(h1.val <= h2.val){
            h1.next = mergeTwoLists(h1.next,h2);
            return h1;
        }
        else{
            h2.next = mergeTwoLists(h1,h2.next);
            return h2;
        }
    }
}