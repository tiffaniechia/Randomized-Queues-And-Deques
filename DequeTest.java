import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DequeTest {
    Deque<String> deque;
    
    @Before
    public void setUp() {
        deque= new Deque<String>();
    }
    
    @Test
    public void shouldInstantiateDequeWithNoNodes() {          
        assertTrue(deque instanceof Deque);        
        assertNull(deque.first);
        assertNull(deque.last);
        assertEquals(0,deque.size());
        assertTrue(deque.isEmpty());
    }
    
    @Test
    public void shouldCreateNewNodeWithNewNextWhenAddingNode() {
        String newNode = "newNode";
        deque.addFirst(newNode);
        assertEquals(1,deque.size());
        assertEquals(null,deque.first.getNext());
        assertEquals(newNode,deque.first.getItem());
    }
    
}
