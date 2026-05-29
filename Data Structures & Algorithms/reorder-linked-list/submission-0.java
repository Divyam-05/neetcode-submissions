/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        ListNode Slow = head;
        ListNode Fast = head.next;

           while(Fast !=null && Fast.next != null){
            Slow = Slow.next;

            Fast = Fast.next.next;
            
        }
    ListNode second = Slow.next;
    ListNode prev = Slow.next = null;

    while(second != null){
        ListNode tmp = second.next;
        second.next = prev;

        prev = second;
        second = tmp;

    }


    ListNode first = head;
    second = prev;
   


    while(second != null){
         ListNode tmp1 = first.next;
         ListNode tmp2 = second.next;
        first.next = second;
        second.next = tmp1;

        first = tmp1;
        second = tmp2;
    }



    }
}
