package LeetCode.Easy.AddTwoNumbers2;

public class Solution {

    public static void main(String[] args) {


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode();
        ListNode tail = temp;
        int value = 0;
        while (l1 != null || l2!=null || value!=0 ){
            int temp1 = (l1 != null) ? l1.val : 0;
            int temp2 = (l2 != null) ? l2.val : 0;
            int sum = temp1 + temp2 + value;

            int number = sum%10;
            value = sum/10;
            tail.next = new ListNode(number);
            tail = tail.next;

            l1 = (l1!=null) ? l1.next : null;
            l2 = (l2!=null) ? l2.next : null;
        }
        ListNode result = temp.next;
        temp.next = null;
        return result;
    }
}
  class ListNode {
      int val;
      ListNode next;

      ListNode() {
      }

      ListNode(int val) {
          this.val = val;
      }

      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }
