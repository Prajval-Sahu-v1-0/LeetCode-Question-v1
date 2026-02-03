/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
     
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A=headA,B=headB;

        while(A != null)
        {
            while(B != null)
            {
                if(A == B)return A;
                B=B.next;
            }
            B=headB;A=A.next;
        }return null;
    }
}