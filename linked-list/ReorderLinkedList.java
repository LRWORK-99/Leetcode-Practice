class ReorderLinkedList{
    public void reorderList(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode previous = null;
        ListNode current = second;
        while (current != null) {
            ListNode nextBox = current.next;
            current.next = previous;
            previous = current;
            current = nextBox;
        }

        ListNode first = head;
        second = previous;
        while (second != null) {
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            first.next = second;
            second.next = tmp1;

            first = tmp1;
            second = tmp2;
        }
    }
}