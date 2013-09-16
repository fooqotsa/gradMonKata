package Square.SpecialSquare;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpecialSquareTest {

	@Test
	public void testOccupied() {
		SpecialSquare square = new SpecialSquare();
		square.landOn();
		assertTrue(square.occupied);
	}

}
