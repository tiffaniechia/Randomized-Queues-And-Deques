import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {
    public Node first;
    public Node last;
    public int count;
    
    private class Node {
        Node next;
        Node previous;
        Item item;
    }
    
    public Deque() {
        this.first = null;
        this.last = null;
        //first.next = null;
        //last.previous = null;
        this.count = 0;
    }                           
//   public boolean isEmpty()                 
//   public int size()                        
//   public void addFirst(Item item)          
//   public void addLast(Item item)           
//   public Item removeFirst()                
//   public Item removeLast()                 
     public Iterator<Item> iterator(){ 
         return null;
     }         
}
