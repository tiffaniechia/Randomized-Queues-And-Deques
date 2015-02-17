import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RandomizedQueueTest{
    
    @Test
    public void shouldInitializeWithEmptyArray() {
        RandomizedQueue<String> randomizedQueue = new RandomizedQueue<String>();
        assertEquals(0, randomizedQueue.size());
    }
    
    
    
}
