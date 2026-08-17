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
    public ListNode deleteDuplicates(ListNode head) {

        
        // Dummy node handles cases where the head itself is duplicated
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        
        while (head != null) {
            
            // Check if current node is part of duplicates
            if (head.next != null && head.val == head.next.val) {
                
                int duplicate = head.val;
                
                // Skip all nodes having the duplicate value
                while (head != null && head.val == duplicate) {
                    head = head.next;
                }
                
                // Connect previous unique node to the next unique node
                prev.next = head;
                
            } else {
                // Current node is unique
                prev = head;
                head = head.next;
            }
        }
        
        return dummy.next;
    }
}