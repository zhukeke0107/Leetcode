public class video010_021_MergeTwoSortedLists {
    public static ListNode MergeTwoLists(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        }
        ListNode head = head1.val <= head2.val ? head1 : head2;
        ListNode cur1 = head.next;
        ListNode cur2 = (head == head1 ? head2 : head1);
        ListNode pre = head;
        while (cur1 != null && cur2 != null) {
            if (cur1.val <= cur2.val) {
                pre.next = cur1;
                cur1 = cur1.next;
            } else {
                pre.next = cur2;
                cur2 = cur2.next;
            }
            pre = pre.next;
        }

        pre.next = (cur1 == null ? cur2 : cur1);
        return head;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head1_1 = new ListNode(2);
        ListNode head1_2 = new ListNode(4);

        head1.next = head1_1;
        head1_1.next = head1_2;
        head1_2.next = null;

        ListNode head2 = new ListNode(1);
        ListNode head2_1 = new ListNode(3);
        ListNode head2_2 = new ListNode(7);

        head2.next = head2_1;
        head2_1.next = head2_2;
        head2_2.next = null;

        ListNode head = MergeTwoLists(head1, head2);
        System.out.println("New List Node is: ");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("Done");

    }
}
