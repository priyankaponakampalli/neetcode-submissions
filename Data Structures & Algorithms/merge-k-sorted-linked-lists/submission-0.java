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
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode curr = lists[i];
            while (curr != null) {
                values.add(curr.val);
                curr = curr.next;
            }
        }
        Collections.sort(values);
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        for (int i = 0; i < values.size(); i++) {
            prev.next = new ListNode(values.get(i));
            prev = prev.next;
        }
        return dummy.next;
    }
}
