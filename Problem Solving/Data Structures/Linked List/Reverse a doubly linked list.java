 static DoublyLinkedListNode reverse(DoublyLinkedListNode head) 
    {

        if(head == null || head.next ==null)
        {
            return head;
        }
        DoublyLinkedListNode prev=null;
        DoublyLinkedListNode next=null;
        DoublyLinkedListNode current = head;
        while(current != null)
        {
            next = current.next;
            current.next=prev;
            current.prev=next;
            prev=current;
            current=next;
        }
        head = prev;
        return head;
    }
