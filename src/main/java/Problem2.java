
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
         ListNode newNode = new ListNode(val);
        if(position == 1 || head == null) {
            newNode.next = head;
            return newNode;
        }

        ListNode current = head;
        int curPos = 0;
        while(current.next != null && curPos < position - 2) {
            current = current.next;
            curPos++;
        }
        newNode.next = current.next;
        current.next = newNode;
        
        return head;
    }
}
