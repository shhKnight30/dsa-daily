class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode();
        ListNode current  = newNode;
        int carry = 0;
        while(l1!=null ||  l2!= null || carry != 0){
            int val1 = l1!=null ? l1.val : 0;
            int val2 = l2!=null ? l2.val : 0;
            int sum = val1 + val2 + carry;
            current.next = new ListNode(sum%10);
            carry = sum/10;
            if(l1!= null){
                l1 = l1.next;
            }if(l2!=null){
                l2 = l2.next;
            }
            current = current.next;
        }
        return newNode.next;
    }
}
