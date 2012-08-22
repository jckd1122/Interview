public class Solution{
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1 == null || l2 == null)
            return (l1 == null)? l2:l1;

        ListNode h1 = l1;
        ListNode h2 = l2;
        ListNode p1,p2;

        while(true){
            p1 = h1;
            p2 = h2;
            if(h2.val >= h1.val){
                if(h1.next != null)
                    h1 = h1.next;
                else{
                    h1.next = h2;
                    break;
                }

                
                if(h2.val <= h1.val){
                    p1.next = h2;
                    h2 = h2.next;
                }
            }
            else{
                if(h2.next != null)
                    h2 = h2.next;
                else{
                    h2.next = h1;
                    break;
                }
                if(h1.val <= h2.val){
                    p2.next = h1;
                    h1 = h1.next;
                }
            }
        }
        
        return (h1 == null)? l2:l1;


    }



}
