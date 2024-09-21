// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        ListNode list3 = new ListNode(0);
        ListNode temp = list3;

        while(l1 != null) {
            temp.next = new ListNode(l1.val);
            temp = temp.next;
            l1 = l1.next;
        }

        while(l2 != null) {
            temp.next = new ListNode(l2.val);
            temp = temp.next;
            l2 = l2.next;
        }
        return list3.next;
    }
}
