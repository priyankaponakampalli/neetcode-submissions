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
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondhalf = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode curr = secondhalf;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        ListNode rev = prev;
        ListNode first = head;
        ListNode second = rev;

        while (second != null) {
            ListNode firstnext = first.next;
            ListNode secondnext = second.next;
            first.next = second;
            second.next = firstnext;
            first = firstnext;
            second = secondnext;
        }

    }
}
