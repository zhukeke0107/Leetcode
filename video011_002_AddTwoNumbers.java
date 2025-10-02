public class video011_002_AddTwoNumbers {
    public static ListNode AddTwoNumbers(ListNode h1, ListNode h2) {
        ListNode ans = null, cur = null;
        int carry = 0;
        int val, sum;
        while (h1 != null || h2 != null) {
            sum = (h1 == null ? 0 : h1.val) + (h2 == null ? 0 : h2.val) + carry;
            val = sum % 10;
            carry = sum / 10;

            if (ans == null) {
                ans = new ListNode(val);
                cur = ans;
            } else {
                cur.next = new ListNode(val);
                cur = cur.next;
            }

            h1 = h1 == null ? null : h1.next;
            h2 = h2 == null ? null : h2.next;
        }
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        ListNode head1_1 = new ListNode(8);
        ListNode head1_2 = new ListNode(9);

        head1.next = head1_1;
        head1_1.next = head1_2;
        head1_2.next = null;

        ListNode head2 = new ListNode(2);
        ListNode head2_1 = new ListNode(6);
        ListNode head2_2 = new ListNode(7);
        ListNode head2_3 = new ListNode(9);

        head2.next = head2_1;
        head2_1.next = head2_2;
        head2_2.next = head2_3;
        head2_3.next = null;

        ListNode head = AddTwoNumbers(head1, head2);
        System.out.println("New List Node is: ");
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + "->");
            current = current.next;
        }
        System.out.println("Done");

    }
}
