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
    public boolean isPalindrome(ListNode head) {
      /*  ListNode slow = head, fast = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prev = null;
        while(slow != null)
        {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        } 

        while(prev != null)
        {
            if(prev.val != head.val)return false;
            prev = prev.next;
            head = head.next;
        }return true; */

        StringBuilder sb = new StringBuilder();
        
        ListNode temp = head;
        while(temp != null){
            sb.append(temp.val);
            temp= temp.next;
        }
        String orignal = sb.toString();
        String reversed = sb.reverse().toString();
        return orignal.equals(reversed);
    }
}