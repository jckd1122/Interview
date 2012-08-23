/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution{
    public ListNode reverseBetween(ListNode head, int m, int n){
        if(m == n)
            return head;

        ListNode prev1 = head;
        ListNode prev1Tmp,cur1,post1;
        ListNode cur2 = head;
        ListNode post2;
        
        if(m == 1){
            prev1 = new ListNode(Integer.MAX_VALUE);
            prev1.next = head;
        }
        while(m-- > 2){
            prev1 = prev1.next;
        }
        while(n-- > 1){
            cur2 = cur2.next;
        }
        cur1 = prev1.next;
        post1 = prev1.next.next;
        post2 = cur2.next;

        while(cur1 != cur2){
            prev1Tmp = prev1;
            prev1.next = post1;
            cur2.next = cur1;
            cur1.next = post2;
            
            prev1 = prev1Tmp;
            cur1 = prev1.next;
            post1 = prev1.next.next;
            cur2 = cur2.next;
        }
        return head;

    }
    
    
}

