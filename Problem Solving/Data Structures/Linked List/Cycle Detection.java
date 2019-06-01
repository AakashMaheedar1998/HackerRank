 static boolean hasCycle(SinglyLinkedListNode head)
    {
        boolean cycle = false ;
        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;
        while(fast != null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                {
                    cycle = true;
                    break;
                } 

        }

    return cycle;
    }