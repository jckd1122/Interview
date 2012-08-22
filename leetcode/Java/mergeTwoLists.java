public class Solution{
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1 == null || l2 == null)
            return (l1 == null)? l2:l1;

        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode p1,p2;

        while(h1 != null && h2 != null){
            p1 = h1;
            p2 = h2;
            if(h1.val < h2.val && h1.next.val > h2.val){
                h1 = h1.next;
                p1.next = h2;
            }
            if(h1.val > h2.val && h2.next.val > h1.val){
                h2 = h2.next;
                p2.next = h1;
            }
            if(h2.val > h1.next.val){
                h1 = h1.next;
            }
            if(h1.val > h2.next.val){
                h2 = h2.next;
            }


        }
        return (h1 == null)? h2:h1;


    }



}
