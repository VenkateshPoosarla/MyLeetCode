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
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->(a.val-b.val));
        for(ListNode l1:lists){
             if(l1!=null)
                pq.offer(l1);
        }
        ListNode dummy=new ListNode(-1);
        ListNode dummy1=dummy;
        while(pq.size()!=0){
            ListNode l1=pq.poll();
            
            dummy1.next=new ListNode(l1.val);
            dummy1=dummy1.next;
            if(l1.next!=null){
                pq.offer(l1.next);
            }
        }
        return dummy.next;
    }
}