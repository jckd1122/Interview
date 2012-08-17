/** 
 * Definition for singly-linked list..
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
    public ListNode swapPairs(ListNode head){
        ListNode start = head;
        if(head == null)
            return head;
        
        while(head!= null && head.next != null){
            int tmp = head.val;
            head.val = head.next.val;
            head.next.val = tmp;
            head = head.next.next;
        }
        return start;

    }


}
