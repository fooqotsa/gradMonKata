package Square.SpecialSquare;

import static org.junit.Assert.*;

import org.junit.Test;

public class JailTest {

	@Test
	public void testIfJailTrueSquareIsOccupiedAndInJail() {
		Jail square = new Jail();
		GoToJail gojail = new GoToJail();
		gojail.jail = true;
		square.landOnJail();
		
		assertTrue(square.occupied);
		assertEquals(JailState.InJail, square.state);
		
	}
	
	@Test
	public void testIfJailLandedOnSquareIsOccupiedAndJustVisiting(){
		Jail square = new Jail();
		GoToJail gojail = new GoToJail();
		gojail.jail = false;
		square.landOn();
		square.landOnJail();
		
		assertTrue(square.occupied);
		assertEquals(JailState.JustVisiting, square.state);
	}

}
