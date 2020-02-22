import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook a1 = new GradeBook(5);
	GradeBook a2 = new GradeBook(5);
	GradeBook a3 = new GradeBook(5);
	
	@BeforeEach
	void setUp() throws Exception {	
		a1.addScore(10);
		a1.addScore(20);
		
		a2.addScore(5);
		a2.addScore(10);
		a2.addScore(15);
		a2.addScore(20);
		a2.addScore(25);
		
		a3.addScore(5);
		a3.addScore(10);
		a3.addScore(15);
	}

	@AfterEach
	void tearDown() throws Exception {
		a1 = null;
		a2 = null;
		a3 = null;
	}

	@Test
	void testAddScore() {
		//System.out.print(a1.toString());
		assertTrue(a1.toString().equals("10.0 20.0"));
		assertEquals(a1.getScoreSize(), 2);
		//System.out.print(a2.toString());
		assertTrue(a2.toString().contains("5.0 10.0 15.0 20.0 25.0"));
		assertEquals(a2.getScoreSize(), 5);
		//System.out.print(a3.toString());
		assertTrue(a3.toString().contains("5.0 10.0 15.0"));
		assertEquals(a3.getScoreSize(), 3);
		
	}

	@Test
	void testSum() {
		assertEquals(a1.sum(), 30);
		assertEquals(a2.sum(), 75);
		assertEquals(a3.sum(), 30);
	}

	@Test
	void testMinimum() {
		assertEquals(a1.minimum(), 10);
		assertEquals(a2.minimum(), 5);
		assertEquals(a3.minimum(), 5);
	}

	@Test
	void testFinalScore() {
		assertEquals(a1.finalScore(), 20);
		assertEquals(a2.finalScore(), 70);
		assertEquals(a3.finalScore(), 25);
	}

	@Test
	void testGetScoreSize() {
		//fail("Not yet implemented");
	}

	@Test
	void testToString() {
		//fail("Not yet implemented");
	}

}
