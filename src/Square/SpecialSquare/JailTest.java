package Square.SpecialSquare;

import static org.junit.Assert.*;

import org.junit.Test;

public class JailTest {

	@Test
	public void testIfJailTrueSquareIsOccupiedAndInJail() {
		Jail square = new Jail();
		GoToJail gojail = new GoToJail();
		gojail.landOn();
		gojail.goToJail();
		square.landOnJail(gojail);
		
		assertTrue(square.occupied);
		assertTrue(gojail.occupied);
		assertTrue(gojail.jail);
		assertEquals(JailState.InJail, square.state);
		
	}
	
	@Test
	public void testIfJailLandedOnSquareIsOccupiedAndJustVisiting(){
		Jail square = new Jail();
		GoToJail gojail = new GoToJail();
		gojail.jail = false;
		square.landOn();
		square.landOnJail(gojail);
		
		assertTrue(square.occupied);
		assertEquals(JailState.JustVisiting, square.state);
	}

}
