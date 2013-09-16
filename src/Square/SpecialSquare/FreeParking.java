package Square.SpecialSquare;

public class FreeParking extends SpecialSquare {
	
	public String message = "You Landed On Free Parking, Nothing Happens";
	
	
	public void landOn(){
		occupied = true;
		System.out.println(message);
	}

}
