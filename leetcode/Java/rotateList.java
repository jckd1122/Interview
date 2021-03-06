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
    public ListNode rotateRight(ListNode head,int n){
        if(head == null)
            return head;
        
        ListNode h = head;
        ListNode rotate = head;
        ListNode lastNode;
        int count;
        int length = 1;
        while(h.next != null){
             h = h.next;
             length++;
        }
        
        n = n%length;
        if(n == 0)
           return head;
        
        count = length-n;
        while(count > 1){
            rotate = rotate.next;
            count--;
        }
        lastNode = rotate;
        rotate = rotate.next;
        lastNode.next = null;
        h.next = head;
        return rotate;
    }



}