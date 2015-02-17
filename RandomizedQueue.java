import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {
    public int count;
    public int length;
    public Item[] queue;
    
    public RandomizedQueue() {
        this.count = 0;
        this.length = 1;
        this.queue = (Item[]) new Object[this.length];
    } 
    
    public boolean isEmpty() {
        return this.count == 0;
    }
    
    public int size() {
        return this.count;
    } 
    
    public Item getItem(int index) {
        return this.queue[index];
    }
    
    public void enqueue(Item item) {       
        queue[this.count] = item;
        count++;
        if(this.length == this.count) {
            this.length = 2*this.length;
            Item[] expandedQueue = (Item[]) new Object[this.length];
            for(int i = 0; i < size(); i++) {
                expandedQueue[i] = this.queue[i];
            }
            this.queue = expandedQueue;
        }   
    }           
//   public Item dequeue()
    
    public Item sample() {
        int randomIndex = StdRandom.uniform(this.count +1);
        return this.getItem(randomIndex);
    } 
      
    public Iterator<Item> iterator() {
        return null;
    }         
}