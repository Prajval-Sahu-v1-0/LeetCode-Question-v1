/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode rabbit=head,snail=head;
        HashSet<ListNode> s = new HashSet<>();
      while(snail != null)
      {
        if(s.contains(snail))return snail;

        if(!s.contains(snail))s.add(snail);
        snail=snail.next;
      }return null;
    }
}