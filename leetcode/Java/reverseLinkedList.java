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
        ListNode l0;
        ListNode p1 = head;
        ListNode p2,l1,l2,after1,after2;
        p2 = head;
        while(l0.next != null){
            l0 = l0.next;
            length++;
        }
        
        if(length < 2){
            return head;
        }
            return head;
        while(m-- > 2){
            p1 = p1.next;
        }
        while(n-- > 2){
            p2 = p2.next;
        }
        
        l1 = p1.next;
        after1 = p1.next.next;
        l2 = p2.next;
        after2 = p2.next.next;
        while(l1 != l2){
            l2.next = l1;
            p2.next = after2;
            p1.next = l2;
            
            p1 = p1.next;
            l1 = l1.next;
            after1= after1.next;
            p2 = p2.next;
            l2 = l2.next;
            after2 = after2.next;
        }
        return head;

    }
    
    
}

