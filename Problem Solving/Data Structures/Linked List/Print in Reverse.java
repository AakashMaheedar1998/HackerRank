    static SinglyLinkedListNode reverse(SinglyLinkedListNode head)
    {
            if(head ==null || head.next==null)
            {
                
                return head;
            }
            SinglyLinkedListNode prev=null;
            SinglyLinkedListNode next =null;
            SinglyLinkedListNode current =head;
            while(current!=null)
            {
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
        head= prev;
        return head;
        
    }
    static void reversePrint(SinglyLinkedListNode head)
    {
            head=reverse(head);
            SinglyLinkedListNode temp=head;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
    }
