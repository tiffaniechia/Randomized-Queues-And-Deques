import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DequeTest {
    Deque<String> deque;
    Deque<String> addedDeque;
    
    @Before
    public void setUp() {
        deque = new Deque<String>();
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
    public void shouldCreateNewNodeWithSettingsWhenAddedToFront() {
        String newNodeFront = "newNode";
        deque.addFirst(newNodeFront);
        assertEquals(1,deque.size());
        assertEquals(null,deque.first.getNext());
        assertEquals(newNodeFront,deque.first.getItem());
        assertEquals(newNodeFront,deque.last.getItem());
        assertEquals(null,deque.first.getPrevious());
    }
    
    @Test
    public void shouldCreateNewNodeWithSettingsWhenAddedToback() {
        String newNodeBack = "newNode";
        deque.addLast(newNodeBack);
        assertEquals(1,deque.size());
        assertEquals(null,deque.first.getNext());
        assertEquals(newNodeBack,deque.last.getItem());
        assertEquals(newNodeBack,deque.first.getItem());
        assertEquals(null,deque.first.getPrevious());
    }
    
    @Test 
    public void shouldKnowItsItsSequenceAndItsNeighbours() {
        String frontNode = "front";
        String backNode = "back";
        deque.addLast(frontNode);
        deque.addLast(backNode);
        
        String firstItem = deque.first.getItem();
        String firstNext = deque.first.getNext().getItem();
        String lastItem = deque.last.getItem();
        String lastPrevious = deque.last.getPrevious().getItem();
       
        assertEquals(2,deque.size());
       
        assertNull(deque.first.getPrevious());
        assertEquals(backNode,firstNext);
        assertEquals(frontNode,firstItem);
        
        assertEquals(backNode,lastItem);
        assertEquals(frontNode,lastPrevious);
        assertNull(deque.last.getNext());
    }
    
    @Test
    public void shouldRemoveAppropriateLinksWhenRemoved() {
        String frontNode = "front";
        String backNode = "back";
        deque.addLast(frontNode);
        deque.addLast(backNode);
        deque.removeLast();

        assertEquals(1,deque.size());   
        assertNull(deque.first.getNext());       
    }
    
    @Test
    public void removeCleanlyIfNoPrevOrNext() {
        String frontNode = "front";
        deque.addLast(frontNode);
        deque.removeFirst();
        
        assertEquals(0,deque.size());
    }
        
}
