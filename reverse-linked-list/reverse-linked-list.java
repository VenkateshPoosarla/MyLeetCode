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
    public ListNode reverseList(ListNode head) {
        ListNode temp=null;
        while(head!=null){
            ListNode temp1=head;
            head=head.next;
            temp1.next=null;
            temp1.next=temp;
            temp=temp1;
        }
        return temp;
    }
}