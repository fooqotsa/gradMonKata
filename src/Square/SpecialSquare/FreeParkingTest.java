package Square.SpecialSquare;



import static org.junit.Assert.*;

import org.junit.Test;

public class FreeParkingTest {

	@Test
	public void testThatWhenLandedOnMessageDisplaye() {
		FreeParking square = new FreeParking();
		square.landOn();
		
		assertTrue(square.occupied);
		assertEquals("You Landed On Free Parking, Nothing Happens", square.message);
	}

}
