package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import core.Dice;

public class DiceTest {

	@Test
	public void test() {
		Dice dice = new Dice();
		for (int i = 0; i < 1000; i++){
			int roll = dice.roll();
			assertTrue(roll > 1);

			assertTrue(roll < 13);
			System.out.println(roll);
		}
	}

}
