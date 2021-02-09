public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode cur = head1;
        cur.next = new ListNode(2);
        cur = cur.next;
        cur.next = new ListNode(6);
        cur = cur.next;
        cur.next = new ListNode(3);
        cur = cur.next;
        cur.next = new ListNode(4);
        cur = cur.next;
        cur.next = new ListNode(5);
        cur = cur.next;
        cur.next = new ListNode(6);
    }
 }