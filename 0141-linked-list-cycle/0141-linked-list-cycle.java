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
    public boolean hasCycle(ListNode head) {
      ListNode rabbit=head,snail=head;

      while(rabbit != null && rabbit.next != null)
      {
        rabbit=rabbit.next.next;
        if(snail == rabbit)return true;
        snail=snail.next;
      }return false;

}
}