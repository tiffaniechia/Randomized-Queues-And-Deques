import java.util.Iterator;

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
    }; 
    
    public int size() {
        return this.count;    
    };
    
    public void addFirst(Item item) {
        Node oldFirst = first;
        first = new Node();
        first.setItem(item);
        first.setNext(oldFirst);
        count++;
    }
    
//    public void addLast(Item item)           
//   public Item removeFirst()                
//   public Item removeLast()                 
     public Iterator<Item> iterator(){ 
         return null;
     }         
}
