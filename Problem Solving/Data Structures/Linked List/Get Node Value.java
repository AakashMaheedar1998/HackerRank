static SinglyLinkedListNode reverse(SinglyLinkedListNode head)
    {
        if(head == null || head.next == null)
            return head;
         SinglyLinkedListNode prev=null;
         SinglyLinkedListNode next=null;
         SinglyLinkedListNode current = head;
         while(current != null)
         {
             next = current.next;
             current.next=prev;
             prev=current;
             current=next;
         }   
         head=prev;
         return head;
    }
    static int getNode(SinglyLinkedListNode head, int index)
    {
        int count = 0;
        head=reverse(head);
        SinglyLinkedListNode temp=head;
        int result=0;
        while(temp!=null)
        {
            if(index==count)
            {
                result = temp.data;
                break;
            }
            else
            {
                count=count+1;
                temp=temp.next;
            }
        }
    return result;
    }