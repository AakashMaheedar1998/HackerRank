public static void  printLinkedList(SinglyLinkedListNode node)
    {
        SinglyLinkedListNode tnode=node;
        while(tnode!=null)
        {
            System.out.println(tnode.data);
            tnode=tnode.next;
        }
        
    }
    
