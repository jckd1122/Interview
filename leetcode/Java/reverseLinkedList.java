public class Solution{
    public ListNode reverseBetween(ListNode head, int m, int n){
        ListNode l1 = head;
        ListNode l2 = head;
        while(m-- > 0){
            l1 = l1.next;
        }
        while(n-- > 0){
            l2 = l2.next;
        }

        int tmp = l1.value;
        l1.value = l2.value;
        l2.value = tmp;
        return head;

    }



}
