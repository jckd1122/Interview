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
public class Solution {
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head == null)
            return head;
            
        ListNode h = head;
        ListNode prev,next,last2;
        ListNode last1 = new ListNode(Integer.MIN_VALUE);
        ListNode start = last1;
        prev = last1;
        prev.next = head;
        
        //determine the first last1
        if(head.val < x)
            last1 = h;
                
        while(h != null){
            next = h.next;
            
            if(h.val < x && prev.val >= x){
                last2 = last1.next;
                last1.next = h;
                last1 = last1.next;
                last1.next = last2;
                prev.next = next;
            }
            
            prev = h;
            h = h.next;
        }
        return start.next;
    }
}