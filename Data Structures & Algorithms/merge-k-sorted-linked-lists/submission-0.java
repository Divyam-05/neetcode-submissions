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
    public ListNode mergeKLists(ListNode[] lists) {

        int size = lists.length;

        if(size == 0){
            return null;
        }

        for(int i=0; i< size-1 ; i++){
            ListNode dummy = new ListNode(0);   
            ListNode pointer = dummy;



            while(lists[i] != null && lists[i+1] != null){
                if(lists[i].val< lists[i+1].val){
                    pointer.next = lists[i];

                    lists[i] = lists[i].next;
                }
                else{
                    pointer.next =lists[i+1];

                    lists[i+1] = lists[i+1].next;
                }

                pointer = pointer.next;
            }



            if(lists[i]!=null){
                pointer.next =lists[i];
                
            }

            else{
                pointer.next =lists[i+1];
                

            }
            lists[i+1] = dummy.next;


        }
        return lists[size-1];
      


    }
}
