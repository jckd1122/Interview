public class Solution{
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1 == null || l2 == null)
            return (l1 == null)? l2:l1;
        
        ListNode h1 = l1;
        ListNode h2 = l2;
        if(h1.val <= h2.val){
            h1.next = mergeTwoLists(h1.next,h2);
        }
        else
            h2.next = mergeTwoLists(h1,h2.next);


    }



}
