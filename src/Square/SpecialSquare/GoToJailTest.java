package Square;

import static org.junit.Assert.*;

import org.junit.Test;

public class GoToJailTest {

	@Test
	public void testIfOccupiedTrueThenSentToJail() {
		GoToJail square = new GoToJail();
		square.landOn();
		square.goToJail();
		
		assertTrue(square.jail);
	}

}
