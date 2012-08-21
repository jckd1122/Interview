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
        int length = 1;
        ListNode l0 = head;
        ListNode l1 = head;
        ListNode l2 = head;
        while(l0.next != null){
            l0 = l0.next;
            length++;
        }
        //if(length  m || length > n)
        //    return head;
        while(m-- > 1){
            l1 = l1.next;
        }
        while(n-- > 1){
            l2 = l2.next;
        }

        int tmp = l1.val;
        l1.val = l2.val;
        l2.val = tmp;
        return head;

    }



}