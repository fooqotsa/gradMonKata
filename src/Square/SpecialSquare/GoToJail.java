package Square.SpecialSquare;

public class GoToJail extends SpecialSquare{
	protected boolean jail = false;
	public Jail inJail;
	
	public void goToJail(){
		if (occupied = true){
			jail = true;
			System.out.println("Head directly to jail.  Do not pass Go, do not collect £200");
			inJail.occupied = true;
			occupied = false;
		}
	}

}
