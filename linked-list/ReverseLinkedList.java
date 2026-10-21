class ReverseLinkedList{
    public ListNode reverseList(ListNode head){
        ListNode previous = null;
        ListNode current = head;

        while(current != null){
            ListNode nextBox = current.next;
            current.next = previous; //flipping the arrow
            previous = current;
            current = nextBox;
        }

        return previous;

    }
}