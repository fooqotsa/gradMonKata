package Square.SpecialSquare;

public class GoToJail extends SpecialSquare{
	protected boolean jail = false;
	public Jail inJail;
	
	public void landOn(){
			occupied = true;
			inJail = new Jail();
			jail = true;
			System.out.println("Head directly to jail.  Do not pass Go, do not collect �200");
	}

}
