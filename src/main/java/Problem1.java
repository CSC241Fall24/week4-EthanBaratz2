// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        ListNode list3 = new ListNode(0);
        ListNode temp = list3;

        while(num1 != null) {
            temp.next = new ListNode(num1.val);
            temp = temp.next;
            num1 = num1.next;
        }

        while(num2 != null) {
            temp.next = new ListNode(num2.val);
            temp = temp.next;
            num2 = num2.next;
        }
        return list3.next;
    }
}
