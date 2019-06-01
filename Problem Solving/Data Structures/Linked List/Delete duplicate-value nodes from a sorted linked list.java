   static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head)
    {
        SinglyLinkedListNode current = head;
        while(current != null)
        {
                SinglyLinkedListNode temp =current;
                while(temp!=null && temp.data==current.data)
                    {
                        temp = temp.next;
                    }                
                current.next=temp;
                current=current.next;
        }       
    return head;
}