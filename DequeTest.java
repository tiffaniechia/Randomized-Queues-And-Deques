import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DequeTest {
    
    @Test
    public void shouldInstantiateDequeWithNoNodes() {
        Deque<String> deque= new Deque<String>();        
        assertTrue(deque instanceof Deque);        
        assertNull(deque.first);
        assertNull(deque.last);
        assertEquals(0,deque.count);
    }
    
}
