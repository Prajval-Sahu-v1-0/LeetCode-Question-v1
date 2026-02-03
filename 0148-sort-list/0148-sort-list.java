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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null)return head;

        ListNode rabbit = head.next,snail = head;

        while(rabbit != null && rabbit.next != null)
        {
            snail = snail.next;
            rabbit = rabbit.next.next;
        }

        ListNode mid = snail.next; snail.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left,right);
    }

    ListNode merge(ListNode left, ListNode right)
    {
        ListNode dummy = new ListNode(0);
        ListNode tail= dummy;

        while(left != null && right != null)
        {
            if(left.val <= right.val){
                tail.next = left;
                left = left.next;
            }

            else{
                tail.next = right;
                right = right.next;
            }

            tail=tail.next;
        }

        tail.next = (left != null)? left:right;
        return dummy.next;
    }
}