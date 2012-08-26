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

        ListNode prev,cur,curTmp,start,end;
        int pos = m+1;
        if(m == 1){
            prev = head;
            start = new ListNode(Integer.MAX_VALUE);
            start.next =prev;
            cur = prev.next;
            end = prev;  // the first node to be reversed, which will be connected to end 
        }
        
        else{
            start = head;
            while(m-- > 2){
                start = start.next;
            }
            prev = start.next;
            cur = start.next.next;
            end = prev;
        }

        while(pos <= n){
            start.next = cur;
            curTmp = cur;
            cur.next = prev;
            prev = curTmp;
            cur = prev.next;
            pos++;
        }
        end.next = cur;
        return head;

    }

   public ListNode reverseBetween(ListNode head, int m, int n){
        if(head == null || m == n)
            return head;

        //here prev corrsponds to the first element to be reversed
        ListNode prev = head;// includes m == 1's case 
        ListNode cur,end;
        ListNode start = head;
        int count = m+1;
        int pos1 = m;
        int pos2 = m;
        while(pos1 > 1){
            prev = prev.next;
            pos1--;
        }
        while(pos2 > 2){
            start = start.next;
            pos2--;
        }
        cur = prev.next;
        end = prev;

        while(count <= n){
            ListNode post = cur.next;
            cur.next = prev;
            prev = cur;
            cur = post;
            count++;
        }
        end.next = cur;
        if(m > 1)
            start.next = prev;
            
        
        return (m > 1)? head:prev;



    }
    
    
}

