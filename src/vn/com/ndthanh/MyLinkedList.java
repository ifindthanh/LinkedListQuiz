package vn.com.ndthanh;

//test branch
//test branch 1
public class MyLinkedList {
    private Node first;
    private Node tail;
    private int size ;
    
    public MyLinkedList() {
        this.first = null;
        this.tail = null;
        this.size = 0;
    }
    
    public Node getFirst() {
        return first;
    }
    
    public void setFirst(Node first) {
        this.first = first;
    }
    
    public Node getTail() {
        return tail;
    }
    
    public void setTail(Node tail) {
        this.tail = tail;
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public void insertAtPos(int val , int pos)
    {
        Node nptr = new Node(val, null);                
        Node ptr = this.first;
        if (ptr == null) {
            this.first = nptr;
        }
        pos = pos - 1 ;
        for (int i = 1; i < size+1; i++) 
        {
            if (i == pos) 
            {
                Node tmp = ptr.getNextElement();
                ptr.setNextElement(nptr);
                nptr.setNextElement(tmp);
                break;
            }
            if (ptr ==null) {
                continue;
            }
            ptr = ptr.getNextElement();
        }
        size++ ;
    }
    
    public void removeTail() {
        if (tail == null)
            return;
        else {
            if (this.first == tail) {
                this.first = null;
                tail = null;
            } else {
                Node temp = this.first;
                //go from the first to the node that next to the tail then set nextElement is null
                while (temp.getNextElement() != this.tail) {
                    temp = temp.getNextElement();
                }
                tail = temp;
                tail.setNextElement(null);
            }
            this.size--;
        }
    }
    
    public void insertAtStart(int val)
    {
        Node nptr = new Node(val, null);    
        size++ ;    
        if(this.first == null) 
        {
            this.first = nptr;
            this.tail = this.first;
            return;
        }
        nptr.setNextElement(this.first);
        this.first = nptr;
    }
    
    public void insertAtEnd(int val)
    {
        Node nptr = new Node(val,null);    
        size++ ;    
        if(this.first == null) 
        {
            this.first = nptr;
            this.tail = this.first;
        }
        else 
        {
            this.tail.setNextElement(nptr);
            this.tail = nptr;
        }
    }
    public void removeAllGreaterThan(int val) {
        if (this.first == null) {
            return;
        }
        
        //when the first element is greater than val  ====> remove first
        while (this.first.getValue() > val)
        {
            this.size--;
            this.first = this.first.getNextElement();
        }
        
        // in another case, check the next element, if next element > val  ==> set next level is another
        Node ptr = this.first;
        while (ptr != null)
        {
            Node temp = ptr.getNextElement();
            if (temp == null) {
                break;
            }
            if (temp.getValue() > val) {
                this.size--;
                ptr.setNextElement(temp.getNextElement());
            } else {
                ptr = ptr.getNextElement();
            }
        }
    }
    
}

