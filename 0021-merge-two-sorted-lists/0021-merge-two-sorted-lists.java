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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode();
        ListNode it = list;
        while(list1 != null && list2 != null){
            if(list1.val<=list2.val){
                it.next = new ListNode(list1.val);;
                list1 = list1.next;
            }else{
                it.next  = new ListNode(list2.val);
                list2 = list2.next;
            }
            it=it.next;
        }
        while(list1!=null){
            it.next = new ListNode(list1.val);
            list1 = list1.next;
            it = it.next;
        }
        while(list2!=null){
            it.next = new ListNode(list2.val);
            list2 = list2.next;
            it = it.next;
        }
        list = list.next;
        return list;
    }
}