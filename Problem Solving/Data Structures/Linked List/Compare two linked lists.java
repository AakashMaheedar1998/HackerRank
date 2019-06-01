static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2)
    {
        boolean equal=false;
        if(head1==null && head2==null)
        {
            equal = true;
            return equal;
        }
        SinglyLinkedListNode temp1= head1;
        SinglyLinkedListNode temp2= head2;
        while(temp1!=null && temp2!=null)
        {
            if(temp1.data==temp2.data)
            {
                temp1=temp1.next;
                temp2=temp2.next;
                equal = true;
            }
            else
            {
                equal = false;
                return equal;
            }
        }
        if(temp1!=null || temp2!=null)
        {
            equal =false;
        }
        else
            equal = true;

    return equal;

    }
