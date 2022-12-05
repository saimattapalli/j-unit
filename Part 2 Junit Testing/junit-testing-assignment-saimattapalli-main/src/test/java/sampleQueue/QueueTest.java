package sampleQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class QueueTest {

	/**
	 * Tests for Queue.
	 */

	private static final String SOME_ITEM = "some-content";
	private Queue<String> q;

	@Test
	@DisplayName("is instantiated with new Queue()")
	void isInstantiatedWithNew() {
		new Queue<>();
	}
	
	@Test
	@DisplayName("is instantiated with new Queue(Size)")
	void isInstantiatedWithNewalognSize() {
		new Queue<>(10);
	}

	@BeforeEach
	void init() {
		this.q = new Queue<String>();
	}

	@Test
	@DisplayName("Verify Queue isEmpty when queue is initialized")
	void isEmptyShouldGiveTrueOnQueueInit() {
		assertTrue(q.isEmpty());
	}
	@Test
	@DisplayName("Peek should throw an Exception if called on empty queue")
	void peekThrowsExceptionOnEmpty(){
		assertThrows(NoSuchElementException.class, () -> this.q.peek());
	}

	//Example of Wrong Test! 
	@Test
	@DisplayName("Verify Queue isEmpty returns false when queue is not empty")
	void isEmptyShouldGiveFalseWhenQueueIsNotEmpty() {
		this.q.enqueue(SOME_ITEM);
		assertFalse(q.isEmpty());
	}
	
	@Test
	@DisplayName("Verify Queue Length")
	void lengthThrowsExceptionOnEmpty(){
		assertEquals(0,this.q.length());
	}
	
	@Test
	@DisplayName("Verify Queue Removeall")
	void RemoveThrowsExceptionOnNoEmpty(){
		this.q.enqueue(SOME_ITEM);
		this.q.removeAll();
		assertEquals(0,this.q.length());
	}
	
	@Test
	@DisplayName("Verify Queue Enqueue")
	void enqueueThrowsExceptionOnNoEmpty(){
		this.q.enqueue(SOME_ITEM);
		assertEquals(1,this.q.length());
	}
	
	@Test
	@DisplayName("Verify Queue Dnqueue")
	void dnqueueThrowsExceptionOnEmpty() throws Exception{
		
		try {
			this.q.dequeue();     
		} catch (NoSuchElementException e) {
		      
		  }
	}
	
	
	
	

	
}