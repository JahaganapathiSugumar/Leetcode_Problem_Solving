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

        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        Stack<ListNode> s = new Stack<>();

        while(curr != null){
            s.push(curr);
            curr = curr.next;
        }

        if(s.isEmpty()){
            return null;
        }
        ListNode last = s.pop();
        ListNode temp = last;
        ListNode add = null;
        while(!s.isEmpty()){
             
             temp.next = s.pop();
             temp = temp.next;
        }
        temp.next = null;
        return last;
        
    }
}