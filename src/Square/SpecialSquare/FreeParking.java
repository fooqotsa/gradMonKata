package Square.SpecialSquare;

public class FreeParking extends SpecialSquare {
	
	public String message = "You Landed On Free Parking, Nothing Happens";
	
	public void landedOn(){
		occupied = true;
		System.out.println(message);
	}

}
