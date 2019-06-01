 static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2)
    {
        if(head1 == null) return head2;
        else if(head2 == null) return head1;
     SinglyLinkedListNode ll3=new SinglyLinkedListNode(0); 
             SinglyLinkedListNode n=ll3;
        SinglyLinkedListNode temp1=head1;
        SinglyLinkedListNode temp2=head2;
        while(temp1!=null && temp2!=null)
        {
                if(temp1.data < temp2.data)
                {
                    n.next=temp1;
                    temp1=temp1.next;
                }
                else
                {
                    n.next=temp2;
                    temp2=temp2.next;

                }
                n=n.next;
        }
        if(temp1==null)
        {
            n.next=temp2;
        }
        else
        {
            n.next=temp1;
        }
        return ll3.next;
    }
