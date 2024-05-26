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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list = new ListNode();
        ListNode it = list;
        int mem = 0;
        while(l1!=null || l2!=null){
            int a=0; int b=0;
            if(l1!=null){
                a=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                b=l2.val;
                l2 = l2.next;
            }
            it.next = new ListNode(mem+(a+b));
            mem = 0;
            it = it.next;
            if(it.val>=10){
                mem = it.val/10;                
                it.val%=10;
            } 
        }
        if(mem>0){
            it.next = new ListNode(mem);
        }
        return list.next;
    }
}