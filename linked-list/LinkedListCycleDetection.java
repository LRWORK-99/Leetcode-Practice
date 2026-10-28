class LinkedListCycleDetection {
    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        Set<ListNode> set = new HashSet<ListNode>();
        while (current != null) {
            if (set.contains(current)) {
                return true;
            } else {
                set.add(current);
            }
            current = current.next;
        }

        return false;

        //Better version - Space complexity is O(1)
//        ListNode slow = head;
//        ListNode fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//
//            if (slow == fast) {
//                return true;
//            }
//        }
//
//        return false;
    }
}