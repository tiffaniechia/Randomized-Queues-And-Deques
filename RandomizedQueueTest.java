import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomizedQueueTest{
    RandomizedQueue<String> randomizedQueue;
    
    @Before
    public void setUp() {
        randomizedQueue = new RandomizedQueue<String>();
    }
    
    @Test
    public void shouldInitializeWithEmptyArray() {
        assertEquals(0, randomizedQueue.size());
    }
    
    @Test
    public void shouldDoubleInLengthIfArrIsFull() {
        String item = "newItem";
        randomizedQueue.enqueue(item);
        assertEquals(1, randomizedQueue.size());
        assertEquals(2, randomizedQueue.length);
        assertEquals(item, randomizedQueue.getItem(0));
        assertEquals(null, randomizedQueue.getItem(1));
    }
    
}
