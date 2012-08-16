
public class Solution{
    public ListNode swapPairs(ListNode head){
        ListNode start = head;
        if(head == null)
            return head;
        

        while(true){
            if(head == null || head.next == null)
                return start;
            int tmp = head.val;
            head.val = head.next.val;
            head.next.val = tmp;
            head = head.next.next;
        }

    }


}
