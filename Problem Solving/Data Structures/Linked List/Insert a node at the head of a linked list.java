static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data)
    {
        SinglyLinkedListNode newnode=new SinglyLinkedListNode(data);
        if(head==null)
        {
            head=newnode;
            return head;
        }
        newnode.next=head;
        head=newnode;
        return head;

    }