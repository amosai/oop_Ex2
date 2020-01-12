package our_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dataStructure.Edge;

class EdgeTest {

	@Test
	void testEdge() {
	Edge e=new Edge ( 0,1,4);
	System.out.println(e.toString());
		assertEquals("Edge [src=0, dest=1, weight=4]",e.toString() );
	
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSrc() {
		Edge e=new Edge ( 0,1,4);
		assertEquals(0,e.getSrc() );
	}

	@Test
	void testGetDest() {
		Edge e=new Edge ( 0,1,4);
		assertEquals(1,e.getDest() );
	}

	@Test
	void testGetWeight() {
		Edge e=new Edge ( 0,1,4);
		assertEquals(4,e.getWeight() );
	}

	@Test
	void testGetInfo() {
		fail("Not yet implemented");
	}

	@Test
	void testSetInfo() {
		fail("Not yet implemented");
	}

	@Test
	void testGetTag() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTag() {
		fail("Not yet implemented");
	}

}
