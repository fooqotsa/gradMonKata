package Square;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareTest {

	@Test
	public void testCanBeLandedOn() {
		Square square = new Square();
		square.landOn();
		
		assertTrue(square.occupied);
	}
	
	@Test
	public void testIfNotLandedOnOccupiedIsFalse(){
		Square square = new Square();

		assertFalse(square.occupied);
	}

}
