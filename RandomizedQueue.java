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
 
    public Item dequeue() {
        int randomIndex = StdRandom.uniform(this.count);
        Item result = this.queue[randomIndex];
        this.queue[randomIndex] = this.queue[this.count];
        this.queue[this.count] = null;
        count--;
        if(this.length/4 == this.count) {
            this.length = this.length/2;
            Item[] contractedQueue = (Item[]) new Object[this.length];
            for(int i = 0; i < size(); i++) {
                contractedQueue[i] = this.queue[i];
            } 
            this.queue = contractedQueue;
        }
        return result;
    }
    
    public Item sample() {
        int randomIndex = StdRandom.uniform(this.count);
        return this.getItem(randomIndex);
    } 
      
    public Iterator<Item> iterator() {
        return null;
    }         
}