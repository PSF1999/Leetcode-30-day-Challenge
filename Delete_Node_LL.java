Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.


class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node,prev = null;
        while(temp.next != null) {
            prev = temp;
            temp.val = temp.next.val;
            temp = temp.next;
        }
        prev.next = null;
    }
}