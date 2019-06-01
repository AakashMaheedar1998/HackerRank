static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int index) 
    {
        int count=0;
        if(index==count)
        {
            head=head.next;
            return head;
        }
        SinglyLinkedListNode prev=head;
        SinglyLinkedListNode temp=head.next;
        
        while(temp!=null)
        {
            count=count+1;
            if(index==count)
            {
                prev.next=temp.next;
                return head;
            }
            else
            {
                prev=temp;
                temp=temp.next;
            }
        }
    return head;
    }
