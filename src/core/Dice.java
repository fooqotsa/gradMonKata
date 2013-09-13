package core;

import java.util.Random;

public class Dice {
	
	private int die1;
	private int die2;
	
	public int getDie1() {
		return die1;
	}
	public int getDie2() {
		return die2;
	}
	private static Random random = new Random();

    public int roll() {
    	die1 = random.nextInt(5) + 1;
    	die2 = random.nextInt(5) + 1;
    	
    	return die1 + die2;
    }	
	/*
	 * will want random dice rolls, also store the users rolls if a double is rolled ( three user ends up in jail)
	 */
	public boolean isDoubleRoll(){
		return die1 == die2;
	}
	
	
}
