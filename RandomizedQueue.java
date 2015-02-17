import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
    public int count;
    public int length;
    public Item[] queue;
    
    public RandomizedQueue() {
        count = 0;
        length = 1;
        this.queue = (Item[]) new Object[this.length];
    }                 
    public boolean isEmpty() {
        return this.count == 0;
    }                 
    public int size() {
        return this.count;
    }                        
//   public void enqueue(Item item)           
//   public Item dequeue()                    
//   public Item sample() 
      
    public Iterator<Item> iterator() {
        return null;
    }         
}