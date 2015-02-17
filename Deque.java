import java.util.Iterator;
import java.util.NoSuchElementException;

public class Deque<Item> implements Iterable<Item> {
    public Node first;
    public Node last;
    public int count;
    
    public class Node {
        Node next;
        Node previous;
        Item item;
        
        public Node getNext() {
            return next;    
        }
        
        public void setNext(Node node) {
            this.next = node;
        }
        
        public Node getPrevious() {
            return previous;    
        }
        
        public void setPrevious(Node node) {
            this.previous = node;
        }
        
        public void setItem(Item newItem) {
           this.item = newItem;
        }
        
        public Item getItem() {
           return this.item;
        }
               
    }
    
    public Deque() {
        this.first = null;      
        this.last = null;
        this.count = 0;
    }                           
   
    public boolean isEmpty() {
        return count == 0;    
    } 
    
    public int size() {
        return this.count;    
    }
    
    public void addFirst(Item item) {
        if (item == null) {
            throw new NullPointerException();
        }
        Node oldFirst = first;
        first = new Node();
        first.setItem(item);
        if(isEmpty()) {
            last = first;
            first.setNext(null);
        } else {
            first.setNext(oldFirst);
            oldFirst.setPrevious(first);
        }
        
        first.setPrevious(null);
        count++;
    }
    
    public void addLast(Item item) {
        if (item == null) {
            throw new NullPointerException();
        }
        Node oldLast = last;
        last = new Node();
        last.setItem(item);
        if(isEmpty()) {
            first = last;
            last.setPrevious(null);
        } else {
            oldLast.setNext(last);
            last.setPrevious(oldLast);
        }
        last.setNext(null);
        count++;
    }           
    
    public Item removeFirst() {
       if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item result = first.getItem();
        if(count == 1) {
            last = null;
            first = null;
        } else {
            first = first.getNext();
            first.setPrevious(null);
        }
        count--;  
        return result;
    }                
  
    public Item removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Item result = last.getItem();
        if(count == 1) {
            last = null;
            first = null;
        } else {
            last = last.getPrevious();
            last.setNext(null); 
        }
        count--;
        return result;
    }     
    
    public Iterator<Item> iterator(){ 
        return new DequeIterator();
     }
     
    private class DequeIterator implements Iterator<Item> { 
        private Node current = first;
         
        public void remove() {
            throw new UnsupportedOperationException();
        }
         
        public boolean hasNext() {
            return current != null;
        }
         
        public Item next() {
            Item item = current.getItem();
            if (!hasNext()) { 
                throw new NoSuchElementException();
            }   
            current = current.getNext();
            return item;
        }
    }
}
