 package no.hvl.dat102.kjedet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat102.exceptions.EmptyCollectionException;

public class KjedetKoeTest {
    
    private KjedetKoe<Integer> queue;
      
      @BeforeEach
      void setUp() {
        queue = new KjedetKoe<>();
      }
      
      @Test
      void testInnKoe() {
        queue.innKoe(1);
        queue.innKoe(2);
        queue.innKoe(3);
        
        assertEquals(3, queue.toString().split("\n").length);
      }
      
      @Test
      void testUtKoe() {
        queue.innKoe(1);
        queue.innKoe(2);
        queue.innKoe(3);
        
        assertEquals(1, queue.utKoe());
        assertEquals(2, queue.utKoe());
        assertEquals(3, queue.utKoe());
      }
      
      @Test
      void testFoerste() {
        queue.innKoe(1);
        queue.innKoe(2);
        queue.innKoe(3);
        
        assertEquals(1, queue.foerste());
        assertEquals(1, queue.foerste());
      }
      
      @Test
      void testErTom() {
        assertTrue(queue.erTom());
        
        queue.innKoe(1);
        
        assertFalse(queue.erTom());
      }
      
      @Test
      void testUtKoeOnEmptyQueue() {
        assertThrows(EmptyCollectionException.class, () -> queue.utKoe());
      }
      
      @Test
      void testFoersteOnEmptyQueue() {
        assertThrows(EmptyCollectionException.class, () -> queue.foerste());
      }

}
