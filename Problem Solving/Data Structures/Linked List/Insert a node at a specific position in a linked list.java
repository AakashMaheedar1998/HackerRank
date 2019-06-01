static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int index)
    {
        SinglyLinkedListNode newnode=new SinglyLinkedListNode(data);
        int count=0;
        if(index==count)
        {
                newnode.next=head;
                head=newnode;
                return head;
        }  
        SinglyLinkedListNode temp=head;
        SinglyLinkedListNode prev=head;
        temp=temp.next;
        while(temp!=null)
        {
            count=count+1;
            if(index==count)
            {
                newnode.next=temp;
                prev.next=newnode;
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