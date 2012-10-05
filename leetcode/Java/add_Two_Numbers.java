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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = null;
        ListNode h3 = null;
        int sum,adder = 0;
        
        while(l1 != null || l2 != null){
            int val1 = (l1 == null)? 0:l1.val;
            int val2 = (l2 == null)? 0:l2.val;
            sum = val1+val2+adder;
            adder = sum/10;
            
            if(l3 == null){
                l3 = new ListNode(sum%10);
                h3 = l3;
            }
            else{
                h3.next = new ListNode(sum%10);
                h3 = h3.next;
            }                
            l1 = (l1 == null)? null:l1.next;
            l2 = (l2 == null)? null:l2.next;
        }
        if(adder == 1)
            h3.next = new ListNode(adder);
        
        return l3;
        
    }
}