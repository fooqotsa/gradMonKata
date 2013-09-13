package Square.SpecialSquare;

import static org.junit.Assert.*;

import org.junit.Test;

public class GoToJailTest {

	@Test
	public void testIfSentToJail() {
		GoToJail square = new GoToJail();
		square.landOn();
		square.goToJail();
		
		assertTrue(square.jail);
	}

}
